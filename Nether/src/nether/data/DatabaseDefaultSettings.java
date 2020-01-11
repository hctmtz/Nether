/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: DatabaseDefaultSettings.java
 *  Date: 29/12/2017 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.data;

/**
 * This class stores the essential settings to create a default SQLite database
 * file used in the application. Any value within this class must be a constant.
 *
 * @author Héctor
 */
public final class DatabaseDefaultSettings {

    /**
     * Default directory where the default database file would be stored.
     *
     */
    public static final String DB_DEFAULT_DIRECTORY
            = System.getProperty("user.dir")
            + System.getProperty("file.separator")
            + "data";

    /**
     * File name and path to default database file.
     *
     */
    public static final String DB_DEFAULT_FILE = DB_DEFAULT_DIRECTORY
            + System.getProperty("file.separator")
            + "Data.System.db";
}
