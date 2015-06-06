/*******************************************************************************
 * Copyright (c) 2012 Pursuer (http://pursuer.me).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Pursuer - initial API and implementation
 ******************************************************************************/

package org.freshrss.easyrss.data.readersetting;

import org.freshrss.easyrss.data.DataMgr;
import org.freshrss.easyrss.data.Setting;

public class SettingSplitByHour extends AbsSetting<Boolean> {
    private static Boolean value;

    public SettingSplitByHour(final DataMgr dataMgr) {
        super(dataMgr);
    }

    @Override
    protected Boolean getDefault() {
        return true;
    }

    @Override
    protected String getName() {
        return Setting.SETTING_SPLIT_BY_HOUR;
    }

    @Override
    protected Boolean getStaticValue() {
        return value;
    }

    @Override
    protected void setStaticValue(final Boolean value) {
        SettingSplitByHour.value = value;
    }

    @Override
    protected void setStaticValue(final String value) {
        SettingSplitByHour.value = Boolean.valueOf(value);
    }
}
