/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 * Copyright (C) 2011-2012 Eugene Fradkin (eugene.fradkin@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.internal;

import org.eclipse.osgi.util.NLS;

public class UIConnectionMessages extends NLS {

    static final String BUNDLE_NAME = "org.jkiss.dbeaver.ui.internal.UIConnectionMessages"; //$NON-NLS-1$

    public static String dialog_connection_edit_wizard_conn_conf_general_link;
    public static String dialog_connection_edit_wizard_conn_conf_network_link;
    public static String dialog_connection_edit_connection_settings_variables_hint_label;
    public static String dialog_connection_advanced_settings;
    public static String dialog_connection_env_variables_hint;

    public static String dialog_connection_driver;
    public static String dialog_connection_edit_driver_button;

    public static String dialog_connection_wizard_final_checkbox_save_password_locally;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, UIConnectionMessages.class);
    }

    private UIConnectionMessages() {
    }
}
