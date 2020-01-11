/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: ConfigConstants.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.config;

/**
 * Constant values used by com.banco.util.config package.
 *
 * @author Héctor
 */
public class ConfigConstants {

    /**
     * Settings directory where *.properties files should be stored.
     */
    public static final String CONFIG_DIRECTORY
            = System.getProperty("user.dir")
            + System.getProperty("file.separator")
            + "config";

    /**
     * File name for General settings tab.
     */
    public static final String CONFIG_FILE
            = CONFIG_DIRECTORY
            + System.getProperty("file.separator")
            + "SystemSettings.properties";

    /**
     * Settings fields namnes.
     *
     */
    public static final String PROPERTY_GENERAL_LANG
            = "System.Lang";

    public static final String PROPERTY_GENERAL_IS_DEFAULT_DB
            = "System.DefaultDb";

    public static final String PROPERTY_GENERAL_DEFAULT_DB_PATH
            = "System.DefaultDbPath";

    public static final String PROPERTY_RECENT_LAST_DB
            = "System.LastDb";

    public static final String PROPERTY_UI_SYSTEM_LOOK_AND_FEEL
            = "System.LookAndFeel.System";

    public static final String PROPERTY_UI_LOOK_AND_FEEL_THEME
            = "System.LookAndFeel.Theme";
}
