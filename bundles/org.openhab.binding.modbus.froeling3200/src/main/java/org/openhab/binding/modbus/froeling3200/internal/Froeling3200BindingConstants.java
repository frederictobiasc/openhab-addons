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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.modbus.ModbusBindingConstants;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link Froeling3200BindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Frédéric Tobias Christ - Initial contribution
 */
@NonNullByDefault
public class Froeling3200BindingConstants {
    public static final ThingTypeUID THING_TYPE_LAMBDATRONIC_H3200 = new ThingTypeUID(ModbusBindingConstants.BINDING_ID,
            "lambdatronicH3200");
    public static final ThingTypeUID THING_TYPE_LAMBDATRONIC_P3200 = new ThingTypeUID(ModbusBindingConstants.BINDING_ID,
            "lambdatronicP3200");
    public static final ThingTypeUID THING_TYPE_LAMBDATRONIC_S3200 = new ThingTypeUID(ModbusBindingConstants.BINDING_ID,
            "lambdatronicS3200");
    public static final ThingTypeUID THING_TYPE_LAMBDATRONIC_SP3200 = new ThingTypeUID(
            ModbusBindingConstants.BINDING_ID, "lambdatronicSP3200");
    public static final String EMPTY_FROELING3200_CONTROL = "00000000";

    public static final Froeling3200Registers[] MAIN_REGISTERS = { Froeling3200Registers.BOILER_TEMPERATURE,
            Froeling3200Registers.EXHAUST_GAS_TEMPERATURE, Froeling3200Registers.BOARD_TEMPERATURE,
            Froeling3200Registers.RESIDUAL_OXYGEN_CONTENT, Froeling3200Registers.PRIMARY_AIR_POSITION,
            Froeling3200Registers.SECONDARY_AIR_POSITION, Froeling3200Registers.SUCK_BLOWER_SPEED,
            Froeling3200Registers.SENSOR_1_TEMPERATURE, Froeling3200Registers.CONDENSING_HEAT_EXCHANGER_TEMPERATURE,
            Froeling3200Registers.RETURN_FLOW_TEMPERATURE, Froeling3200Registers.INLET_AIR_SPEED,
            Froeling3200Registers.PRIMARY_AIR_TARGET_POSITION, Froeling3200Registers.SUCK_BLOWER_TARGET,
            Froeling3200Registers.SECONDARY_AIR_TARGET_POSITION, Froeling3200Registers.BOILER_POWER_TARGET,
            Froeling3200Registers.EXHAUST_GAS_TARGET_TEMPERATURE, Froeling3200Registers.OXYGEN_REGULATOR_TARGET,
            Froeling3200Registers.PELLET_BOARD_TEMPERATURE, Froeling3200Registers.INLET_AIR_TEMPERATURE,
            Froeling3200Registers.DISCHARGE_AUGER_CURRENT, Froeling3200Registers.OPERATING_HOURS,
            Froeling3200Registers.PELLET_INTERMEDIATE_CONTAINER_LEVEL, Froeling3200Registers.BURNER_IGNITIONS,
            Froeling3200Registers.FIRE_CONSERVATION_HOURS };

    public static final Froeling3200Registers[] OUTDOOR_TEMPERATURE = { Froeling3200Registers.OUTDOOR_TEMPERATURE };

    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_1 = {
            Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_2 = {
            Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_3 = {
            Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_4 = {
            Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_5 = {
            Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_6 = {
            Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_7 = {
            Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_8 = {
            Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_9 = {
            Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_10 = {
            Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_11 = {
            Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_12 = {
            Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_13 = {
            Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_14 = {
            Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_15 = {
            Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_16 = {
            Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_17 = {
            Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_ROOM_TEMPERATURE };
    public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_18 = {
            Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_IS_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_TARGET_TEMPERATURE,
            Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_ROOM_TEMPERATURE };

    public static final Froeling3200Registers[][] HEATING_CIRCUIT_REGISTER_SETS = { REGISTER_SET_HEATING_CIRCUIT_1,
            REGISTER_SET_HEATING_CIRCUIT_2, REGISTER_SET_HEATING_CIRCUIT_3, REGISTER_SET_HEATING_CIRCUIT_4,
            REGISTER_SET_HEATING_CIRCUIT_5, REGISTER_SET_HEATING_CIRCUIT_6, REGISTER_SET_HEATING_CIRCUIT_7,
            REGISTER_SET_HEATING_CIRCUIT_8, REGISTER_SET_HEATING_CIRCUIT_9, REGISTER_SET_HEATING_CIRCUIT_10,
            REGISTER_SET_HEATING_CIRCUIT_11, REGISTER_SET_HEATING_CIRCUIT_12, REGISTER_SET_HEATING_CIRCUIT_13,
            REGISTER_SET_HEATING_CIRCUIT_14, REGISTER_SET_HEATING_CIRCUIT_15, REGISTER_SET_HEATING_CIRCUIT_16,
            REGISTER_SET_HEATING_CIRCUIT_17, REGISTER_SET_HEATING_CIRCUIT_18 };

    public static final Froeling3200Registers[] REGISTER_SET_BUFFER_1 = {
            Froeling3200Registers.BUFFER_1_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_1_MIDDLE_TEMPERATURE,
            Froeling3200Registers.BUFFER_1_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_1_PUMP_TARGET };
    public static final Froeling3200Registers[] REGISTER_SET_BUFFER_2 = {
            Froeling3200Registers.BUFFER_2_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_2_MIDDLE_TEMPERATURE,
            Froeling3200Registers.BUFFER_2_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_2_PUMP_TARGET };
    public static final Froeling3200Registers[] REGISTER_SET_BUFFER_3 = {
            Froeling3200Registers.BUFFER_3_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_3_MIDDLE_TEMPERATURE,
            Froeling3200Registers.BUFFER_3_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_3_PUMP_TARGET };
    public static final Froeling3200Registers[] REGISTER_SET_BUFFER_4 = {
            Froeling3200Registers.BUFFER_4_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_4_MIDDLE_TEMPERATURE,
            Froeling3200Registers.BUFFER_4_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_4_PUMP_TARGET };
    public static final Froeling3200Registers[] REGISTER_SET_STATE_RUNTIME = { Froeling3200Registers.STATE_RUNTIME_NOW,
            Froeling3200Registers.STATE_RUNTIME_MAX };

    public static final Froeling3200Registers[][] BUFFER_REGISTER_SETS = { REGISTER_SET_BUFFER_1, REGISTER_SET_BUFFER_2,
            REGISTER_SET_BUFFER_3, REGISTER_SET_BUFFER_4 };

    public static final List<Froeling3200Registers> WRITABLE_REGISTERS = Collections
            .unmodifiableList(new ArrayList<Froeling3200Registers>() {
                {
                    add(Froeling3200Registers.BOILER_SET_TARGET_TEMPERATURE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_1_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_2_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_3_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_4_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_5_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_6_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_7_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_8_TARGET_TEMPERATURE_SET);
                    add(Froeling3200Registers.BOILER_POWER_TARGET_ENABLE);
                    add(Froeling3200Registers.BOILER_POWER_TARGET_SET);
                    add(Froeling3200Registers.HEATING_CIRCUIT_1_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_2_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_3_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_4_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_5_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_6_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_7_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_8_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_9_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_10_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_11_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_12_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_13_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_14_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_15_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_16_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_17_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_18_REMOTE_ENABLE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_1_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_2_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_3_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_4_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_5_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_6_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_7_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_8_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_9_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_10_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_11_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_12_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_13_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_14_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_15_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_16_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_17_OPERATING_MODE);
                    add(Froeling3200Registers.HEATING_CIRCUIT_18_OPERATING_MODE);
                }
            });

}
