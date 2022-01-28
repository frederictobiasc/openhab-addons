/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.modbus.froeling3200.internal;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.modbus.handler.BaseModbusThingHandler;
import org.openhab.core.io.transport.modbus.AsyncModbusFailure;
import org.openhab.core.io.transport.modbus.AsyncModbusReadResult;
import org.openhab.core.io.transport.modbus.ModbusBitUtilities;
import org.openhab.core.io.transport.modbus.ModbusReadFunctionCode;
import org.openhab.core.io.transport.modbus.ModbusReadRequestBlueprint;
import org.openhab.core.io.transport.modbus.ModbusRegisterArray;
import org.openhab.core.io.transport.modbus.ModbusWriteRegisterRequestBlueprint;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.QuantityType;
import org.openhab.core.thing.ChannelUID;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingStatus;
import org.openhab.core.thing.ThingStatusDetail;
import org.openhab.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link Froeling3200Handler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Frédéric Tobias Christ - Initial contribution
 *
 */
@NonNullByDefault
public class Froeling3200Handler extends BaseModbusThingHandler {
    Froeling3200Configuration config = new Froeling3200Configuration();
    private static final int TRIES = 3;
    private @Nullable ModbusReadRequestBlueprint blueprint;
    private final Logger logger = LoggerFactory.getLogger(Froeling3200Handler.class);
    private Map<Froeling3200ReadUID, Froeling3200Registers[]> readRegisterMap;

    public Froeling3200Handler(Thing thing) {
        super(thing);
        readRegisterMap = new HashMap<>();
    }

    /**
     * @param command get the value of this command.
     * @return short the value of the command multiplied by 10 (see datatype 2 in
     *         the stiebel eltron modbus documentation)
     *
     * @author Paul Frank - Initial contribution
     * @author Frédéric Tobias Christ - customized for Froeling3200 binding
     *
     */
    private short getScaledInt16Value(Command command, BigDecimal scale) throws IllegalArgumentException {
        if (command instanceof QuantityType) {
            QuantityType<?> blubb = (QuantityType<?>) command;
            return blubb.shortValue();

            // QuantityType<?> c = ((QuantityType<?>) command).toUnit(CELSIUS);
            // if (c != null) {
            // return (new BigDecimal(c.doubleValue()).divide(scale).shortValue());
            // } else {
            // throw new IllegalArgumentException("Unsupported unit");
            // }
        }
        if (command instanceof DecimalType) {
            DecimalType c = (DecimalType) command;
            return (new BigDecimal(c.doubleValue()).divide(scale).shortValue());
        }
        throw new IllegalArgumentException("Unsupported command type");
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        if (!config.enableRC) {
            logger.debug("Remote Control disabled. Ignore command for {}", channelUID.getId());
            return;
        }
        logger.debug("Command {} received for channel {}", command.toString(), channelUID.getId());
        for (Froeling3200Registers register : Froeling3200BindingConstants.WRITABLE_REGISTERS) {
            if (createChannelUid(register).equals(channelUID)) {
                logger.debug("I should set register {} to {}", register.getRegisterNumber() - 1, command.toString());
                writeInt16(register.getRegisterNumber() - 1, getScaledInt16Value(command, register.getMultiplier()));
                break;
            }
        }

    }

    @Override
    public void thingUpdated(Thing thing) {

    }

    /**
     * Currently, no distinction by control type is made.
     */
    @Override
    public void modbusInitialize() {
        config = getConfigAs(Froeling3200Configuration.class);

        if (config.pollInterval <= 0) {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR,
                    "Invalid poll interval: " + config.pollInterval);
            return;
        }

        // Setup polling registers
        // Basic information
        registerPoller(Froeling3200BindingConstants.MAIN_REGISTERS);
        registerPoller(Froeling3200BindingConstants.OUTDOOR_TEMPERATURE);
        registerPoller(Froeling3200BindingConstants.REGISTER_SET_STATE_RUNTIME);

        // heatingCircuits
        for (int i = 1; i <= 18; i++) {
            if (config.heatingCircuits.contains(String.format("hc_%d", i))) {
                // register a polling task
                registerPoller(Froeling3200BindingConstants.HEATING_CIRCUIT_REGISTER_SETS[i - 1]);
                logger.debug(String.format("Register heating circuit %d", i));
            } else {
                logger.debug(String.format("Don't register heating circuit %d", i));
                // remove channel
            }
        }

        // Buffers
        for (int i = 1; i <= 8; i++) {
            if (config.buffers.contains(String.format("bf_%d", i))) {
                // register a polling task
                registerPoller(Froeling3200BindingConstants.BUFFER_REGISTER_SETS[i - 1]);
                logger.debug(String.format("Register Buffer %d", i));
            } else {
                logger.debug(String.format("Don't register Buffer %d", i));
                // remove channel
            }
        }
    }

    private void registerPoller(Froeling3200Registers[] registers) {
        ModbusReadRequestBlueprint localBlueprint = blueprint = new ModbusReadRequestBlueprint(getSlaveId(),
                ModbusReadFunctionCode.READ_INPUT_REGISTERS, registers[0].getRegisterNumber() - 1,
                (registers[registers.length - 1].getRegisterNumber() - registers[0].getRegisterNumber()) + 1, TRIES);
        updateStatus(ThingStatus.UNKNOWN);
        registerRegularPoll(localBlueprint, config.pollInterval, 0, this::readSuccessful, this::readError);
        readRegisterMap.put(new Froeling3200ReadUID(ModbusReadFunctionCode.READ_INPUT_REGISTERS,
                registers[0].getRegisterNumber() - 1), registers);
        logger.debug("Register poller for regno {} len {}", registers[0].getRegisterNumber() - 1,
                (registers[registers.length - 1].getRegisterNumber() - registers[0].getRegisterNumber()) + 1);

    }

    /**
     *
     * @param address
     * @param shortValue
     *
     * @author Paul Frank - Initial contribution (org.openhab.binding.modbus.stiebeleltron)
     * @author Frédéric Tobias Christ - customized for Froeling3200 binding
     *
     */

    protected void writeInt16(int address, short shortValue) {
        logger.debug("got {} {}", address, shortValue);
        // big endian byte ordering
        byte hi = (byte) (shortValue >> 8);
        byte lo = (byte) shortValue;
        ModbusRegisterArray data = new ModbusRegisterArray(hi, lo);

        ModbusWriteRegisterRequestBlueprint request = new ModbusWriteRegisterRequestBlueprint(getSlaveId(), address,
                data, false, TRIES);

        submitOneTimeWrite(request, result -> {
            logger.debug("Successful write, matching request {}", request);
            updateStatus(ThingStatus.ONLINE);
        }, failure -> {
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR, "Failed to write");

        });
    }

    /**
     * Modbus function code + start address is assumed to be uniquely identifying for a read operation.
     *
     */
    private void readSuccessful(AsyncModbusReadResult result) {
        result.getRegisters().ifPresent(registers -> {
            if (getThing().getStatus() != ThingStatus.ONLINE) {
                updateStatus(ThingStatus.ONLINE);
            }

            Froeling3200Registers[] readRegisters = readRegisterMap.get(
                    new Froeling3200ReadUID(result.getRequest().getFunctionCode(), result.getRequest().getReference()));
            logger.debug("I got a reading for register {}, reference: {}", readRegisters[0].name(),
                    result.getRequest().getReference());

            for (Froeling3200Registers channel : readRegisters) {
                int index = channel.getRegisterNumber() - readRegisters[0].getRegisterNumber();
                ModbusBitUtilities.extractStateFromRegisters(registers, index, channel.getType())
                        .map(d -> d.toBigDecimal().multiply(channel.getMultiplier()))
                        .map(bigDecimal -> new QuantityType<>(bigDecimal, channel.getUnit()))
                        .ifPresent(v -> updateState(createChannelUid(channel), v));

            }

        });
    }

    private void readError(AsyncModbusFailure<ModbusReadRequestBlueprint> error) {
        updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
                "Failed to retrieve data: " + error.getCause().getMessage());
    }

    private ChannelUID createChannelUid(Froeling3200Registers channel) {
        return new ChannelUID(getThing().getUID(), channel.toString().toLowerCase());
    }

    /**
     * @param address address of the value to be written on the modbus
     * @param shortValue value to be written on the modbus
     */

}
