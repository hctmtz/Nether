/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: GeneralSettingsPanelModel.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.settings.model;

/**
 *
 * @author Héctor
 */
public class GeneralSettingsPanelModel {

    private static boolean defaultDb;
    private static String defaultDbPath;
    private static String defaultLang;

    public static boolean isDefaultDb() {
        return defaultDb;
    }

    public static void setDefaultDb(boolean db) {
        defaultDb = db;
    }

    public static String getDefaultDbPath() {
        return defaultDbPath;
    }

    public static void setDefaultDbPath(String dbPath) {
        defaultDbPath = dbPath;
    }

    public static String getDefaultLang() {
        return defaultLang;
    }

    public static void setDefaultLang(String lang) {
        defaultLang = lang;
    }
}
