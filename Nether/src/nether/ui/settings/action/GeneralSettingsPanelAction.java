/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: GeneralSettingsPanelAction.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.settings.action;

import java.awt.Component;
import java.awt.Window;
import javax.swing.SwingUtilities;

/**
 *
 * @author Héctor
 */
public class GeneralSettingsPanelAction {

    public static final String DEFAULT_DB_FILE = "/data/bank.db";
    public static final String DEFAULT_DB_PATH = "jdbc:sqlite:" + DEFAULT_DB_FILE;

    public void disposeFrame(Component component) {
        Component comp = SwingUtilities.getRoot(component);
        ((Window) comp).dispose();
    }

}
