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

import java.util.Objects;

import org.openhab.core.io.transport.modbus.ModbusReadFunctionCode;

/**
 * The {@link Froeling3200ReadUID} class provides a data type as unique identifier
 * for a modbus register block to be polled.
 *
 * @author Frédéric Tobias Christ
 *
 */
public class Froeling3200ReadUID {
    private ModbusReadFunctionCode functionCode;
    private int startAdress;

    public ModbusReadFunctionCode getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(ModbusReadFunctionCode functionCode) {
        this.functionCode = functionCode;
    }

    public int getStartAdress() {
        return startAdress;
    }

    public void setStartAdress(int startAdress) {
        this.startAdress = startAdress;
    }

    public Froeling3200ReadUID(ModbusReadFunctionCode functionCode, int startAdress) {
        this.functionCode = functionCode;
        this.startAdress = startAdress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionCode, startAdress);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Froeling3200ReadUID readUid = (Froeling3200ReadUID) obj;
        return Objects.equals(functionCode, readUid.getFunctionCode())
                && Objects.equals(startAdress, readUid.getStartAdress());

    }

}
