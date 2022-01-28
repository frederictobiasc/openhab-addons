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

import static org.openhab.binding.modbus.froeling3200.internal.Froeling3200BindingConstants.EMPTY_FROELING3200_CONTROL;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link Froeling3200Configuration} class contains configuration parameters.
 *
 * @author Frédéric Tobias Christ - Initial contribution
 */
@NonNullByDefault
public class Froeling3200Configuration {
    public String control;
    public List<String> heatingCircuits = new ArrayList<>();
    public List<String> buffers = new ArrayList<>();
    public int pollInterval;
    public boolean enableRC;

    public Froeling3200Configuration() {
        this.control = EMPTY_FROELING3200_CONTROL;
    }

}
