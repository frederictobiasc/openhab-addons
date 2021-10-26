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
    /*
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_1 = {
     * Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_1_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_2 = {
     * Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_2_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_3 = {
     * Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_3_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_4 = {
     * Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_4_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_5 = {
     * Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_5_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_6 = {
     * Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_6_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_7 = {
     * Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_7_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_8 = {
     * Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_8_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_9 = {
     * Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_9_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_10 = {
     * Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_10_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_11 = {
     * Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_11_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_12 = {
     * Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_12_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_13 = {
     * Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_13_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_14 = {
     * Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_14_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_15 = {
     * Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_15_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_16 = {
     * Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_16_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_17 = {
     * Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_17_FLOW_ROOM_TEMPERATURE };
     * public static final Froeling3200Registers[] REGISTER_SET_HEATING_CIRCUIT_18 = {
     * Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_IS_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_TARGET_TEMPERATURE,
     * Froeling3200Registers.HEATING_CIRCUIT_18_FLOW_ROOM_TEMPERATURE };
     * 
     * public static final Froeling3200Registers[] REGISTER_SET_BUFFER_1 = {
     * Froeling3200Registers.BUFFER_1_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_1_MIDDLE_TEMPERATURE,
     * Froeling3200Registers.BUFFER_1_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_1_PUMP_TARGET };
     * public static final Froeling3200Registers[] REGISTER_SET_BUFFER_2 = {
     * Froeling3200Registers.BUFFER_2_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_2_MIDDLE_TEMPERATURE,
     * Froeling3200Registers.BUFFER_2_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_2_PUMP_TARGET };
     * public static final Froeling3200Registers[] REGISTER_SET_BUFFER_3 = {
     * Froeling3200Registers.BUFFER_3_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_3_MIDDLE_TEMPERATURE,
     * Froeling3200Registers.BUFFER_3_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_3_PUMP_TARGET };
     * public static final Froeling3200Registers[] REGISTER_SET_BUFFER_4 = {
     * Froeling3200Registers.BUFFER_4_TOP_TEMPERATURE, Froeling3200Registers.BUFFER_4_MIDDLE_TEMPERATURE,
     * Froeling3200Registers.BUFFER_4_BOTTOM_TEMPERATURE, Froeling3200Registers.BUFFER_4_PUMP_TARGET };
     */
}
