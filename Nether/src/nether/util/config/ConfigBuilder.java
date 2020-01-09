package nether.util.config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Utility class to create a settings file.
 *
 * @author Héctor-
 */
public class ConfigBuilder {

    private final static String LANGUAGE = "Spanish(Español)";
    private final static String DEFAULT_DB = "data/data.dll";
    private final static Object IS_DEFAULT_DB = "true";
    private final static Object SYSTEM_LOOK_AND_FEEL = "false";
    private final static String LOOK_AND_FEEL_THEME = "Creme Coffee";

    /**
     * Creates a settings file with the given values. If any param is null or
     * empty, sets the default value.
     *
     * @param lang Application language.
     * @param defaultDb Default database path.
     * @param isDefaultDb True if default database will be used otherwise,
     * False.
     * @param systemLookAndFeel True if system look and feel will be used
     * otherwise, False.
     * @param lookAndFeelTheme Look and feel class name.
     */
    public static void createSettingsFile(String lang, String defaultDb,
            Object isDefaultDb, Object systemLookAndFeel, String lookAndFeelTheme) {

        String language
                = (lang == null || lang.isEmpty()) ? LANGUAGE : lang;
        String defaultDatabase
                = (defaultDb == null || defaultDb.isEmpty()) ? DEFAULT_DB : defaultDb;
        Object isDefaultDatabase
                = (isDefaultDb == null || isDefaultDb.toString().isEmpty()) ? IS_DEFAULT_DB : isDefaultDb;
        Object systemLook
                = (systemLookAndFeel == null || systemLookAndFeel.toString().isEmpty()) ? SYSTEM_LOOK_AND_FEEL : systemLookAndFeel;
        String lookTheme
                = (lookAndFeelTheme == null || lookAndFeelTheme.isEmpty()) ? LOOK_AND_FEEL_THEME : lookAndFeelTheme;

        Properties properties = getDefaultSettings(language, defaultDatabase, isDefaultDatabase, systemLook, lookTheme);
        OutputStream outputStream = null;

        createSettingsDirectory();

        try {

            outputStream = new FileOutputStream(ConfigConstants.CONFIG_FILE);

            //Save properties to project root folder
            properties.store(outputStream, null);

        } catch (IOException io) {
            io.getMessage();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }

    }

    /**
     * Creates a Properties file with default settings.
     *
     */
    public static void createDefaultSettingsFile() {

        createSettingsFile(LANGUAGE, DEFAULT_DB, IS_DEFAULT_DB, SYSTEM_LOOK_AND_FEEL, LOOK_AND_FEEL_THEME);

    }

    /**
     * Creates a Properties object with default settings.
     *
     * @return Default properties settings.
     */
    private static Properties getDefaultSettings(String lang, String defaultDb, Object isDefaultDb, Object systemLookAndFeel, String lookAndFeelTheme) {

        Properties properties = new Properties();

        properties.setProperty(ConfigConstants.PROPERTY_GENERAL_LANG, lang);
        properties.setProperty(ConfigConstants.PROPERTY_GENERAL_DEFAULT_DB_PATH, defaultDb);
        properties.setProperty(ConfigConstants.PROPERTY_GENERAL_IS_DEFAULT_DB, isDefaultDb.toString());
        properties.setProperty(ConfigConstants.PROPERTY_UI_SYSTEM_LOOK_AND_FEEL, systemLookAndFeel.toString());
        properties.setProperty(ConfigConstants.PROPERTY_UI_LOOK_AND_FEEL_THEME, lookAndFeelTheme);

        return properties;
    }

    /**
     * Creates a directory to save the settings file. In case it already exists,
     * then does nothing.
     *
     */
    private static void createSettingsDirectory() {
        File dir = new File(ConfigConstants.CONFIG_DIRECTORY);

        if (!dir.exists()) {
            boolean isDirectoryCreated = dir.mkdir();
            if (isDirectoryCreated) {
                System.out.println("Config directory created");
            } else {
                System.out.println("Failed to create config directory");
            }

        }
    }

}
