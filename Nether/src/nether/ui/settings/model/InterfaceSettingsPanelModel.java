/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: InterfaceSettingsPanelModel.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.settings.model;

/**
 *
 * @author Héctor
 */
public class InterfaceSettingsPanelModel {

    private static boolean defaultTheme;
    private static String themeName;

    public static boolean isDefaultTheme() {
        return defaultTheme;
    }

    public static void setDefaultTheme(boolean theme) {
        defaultTheme = theme;
    }

    public static String getThemeName() {
        return themeName;
    }

    public static void setThemeName(String name) {
        themeName = name;
    }
}
