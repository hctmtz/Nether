/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: ConfigReader.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class reads config files.
 * 
 * @author Héctor
 */
public class ConfigReader {

    /**
     * Gets the General config file vales and check if the values are not null.
     * In case of being null, sets the values to default.
     *
     * @return Properties object with settings values.
     */
    public static Properties getConfig() {

        Properties properties;

        properties = readConfig();

        if (properties.isEmpty() || properties == null) {
            properties = setDefaultConfig();
        }

        return properties;
    }

    /**
     * Creates a settings file with the default values.
     *
     * @return Properties object with default settings.
     */
    private static Properties setDefaultConfig() {

        Properties properties = new Properties();

        InputStream inputStream = null;

        ConfigBuilder.createDefaultSettingsFile();

        try {
            inputStream = new FileInputStream(ConfigConstants.CONFIG_FILE);
            properties.load(inputStream);
        } catch (IOException ex) {
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }

        return properties;
    }

    /**
     * Reads the General config file where the settings for UI are saved.
     *
     * @return Properties object with settings values.
     */
    private static Properties readConfig() {
        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(ConfigConstants.CONFIG_FILE);
            properties.load(inputStream);
        } catch (IOException ex) {
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        return properties;
    }

    public static void main(String[] args) {
        System.out.println(readConfig());
    }

}
