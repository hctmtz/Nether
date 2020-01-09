package nether.util.config;

import java.util.Properties;
import nether.util.laf.themes.SubstanceThemes;
import nether.util.laf.themes.SystemThemes;

/**
 *
 * @author Héctor-
 */
public class ConfigLoader {

    private static Properties properties;

    /**
     * Gets the default SQLite database file path that was set in the properties
     * file.
     *
     * @return look and feel value
     */
    public static String getDefaultDb() {

        properties = ConfigReader.getConfig();

        String defaultDb = properties.getProperty(ConfigConstants.PROPERTY_GENERAL_DEFAULT_DB_PATH);

        return defaultDb;
    }

    /**
     * Gets the value of system default look and feel (true or false) saved to
     * the properties file
     *
     * @return Value of system look and feel (true or false)
     */
    public static String isSystemLookAndFeelEnabled() {

        properties = ConfigReader.getConfig();

        String lookAndFeel = properties.getProperty(ConfigConstants.PROPERTY_UI_SYSTEM_LOOK_AND_FEEL);

        return lookAndFeel;
    }

    /**
     * Gets the look and feel that was set in the properties file
     *
     * @return look and feel value
     */
    public static String getLookAndFeelTheme() {

        properties = ConfigReader.getConfig();

        String lookAndFeel = properties.getProperty(ConfigConstants.PROPERTY_UI_LOOK_AND_FEEL_THEME);

        return lookAndFeel;
    }

    /**
     * Sets the look and feel saved to the properties file. Uses the method
     * getLookAndFeelTheme() located in this class.
     *
     * @see SubstanceThemes
     */
    public static void setLookAndFeelTheme() {

        String lookAndFeel = getLookAndFeelTheme();

        switch (lookAndFeel) {
            case "Autumn":
                SubstanceThemes.setThemeSubstanceAutumn();
                break;
            case "Bussines":
                SubstanceThemes.setThemeSubstanceBussines();
                break;
            case "Bussines BlackSteel":
                SubstanceThemes.setThemeSubstanceBussinesBlackSteel();
                break;
            case "Bussines BlueSteel":
                SubstanceThemes.setThemeSubstanceBussinesBlueSteel();
                break;
            case "Cerulean":
                SubstanceThemes.setThemeSubstanceCerulean();
                break;
            case "Creme":
                SubstanceThemes.setThemeSubstanceCreme();
                break;
            case "Creme Coffee":
                SubstanceThemes.setThemeSubstanceCremeCoffee();
                break;
            case "Dust":
                SubstanceThemes.setThemeSubstanceDust();
                break;
            case "Dust Coffee":
                SubstanceThemes.setThemeSubstanceDustCoffee();
                break;
            case "Gemini":
                SubstanceThemes.setThemeSubstanceGemini();
                break;
            case "Graphite":
                SubstanceThemes.setThemeSubstanceGraphite();
                break;
            case "Graphite Aqua":
                SubstanceThemes.setThemeSubstanceGraphiteAqua();
                break;
            case "Graphite Gold":
                SubstanceThemes.setThemeSubstanceGraphiteGold();
                break;
            case "Magellan":
                SubstanceThemes.setThemeSubstanceMagellan();
                break;
            case "Mariner":
                SubstanceThemes.setThemeSubstanceMariner();
                break;
            case "Mist Aqua":
                SubstanceThemes.setThemeSubstanceMistAqua();
                break;
            case "Mist Silver":
                SubstanceThemes.setThemeSubstanceMistSilver();
                break;
            case "Moderate":
                SubstanceThemes.setThemeSubstanceModerate();
                break;
            case "Nebula":
                SubstanceThemes.setThemeSubstanceNebula();
                break;
            case "Raven":
                SubstanceThemes.setThemeSubstanceRaven();
                break;
            case "Office 2007 Black":
                SubstanceThemes.setThemeSubstanceOffice2007Black();
                break;
            case "Office 2007 Blue":
                SubstanceThemes.setThemeSubstanceOffice2007Blue();
                break;
            case "Office 2007 Silver":
                SubstanceThemes.setThemeSubstanceOffice2007Silver();
                break;
            case "Sahara":
                SubstanceThemes.setThemeSubstanceSahara();
                break;
            case "Twilight":
                SubstanceThemes.setThemeSubstanceTwilight();
                break;
            case "System":
                SystemThemes.setThemeSystemDefault();
                break;
            case "Metal":
                SystemThemes.setThemeMetal();
                break;
            default:
                SystemThemes.setThemeSystemDefault();
                break;
        }
    }

    /**
     * Prints the look and feel saved to the properties file. This is for
     * testing porpouses only.
     *
     * @param args -
     */
    public static void main(String[] args) {

        ConfigBuilder.createDefaultSettingsFile();
        System.out.println(getLookAndFeelTheme());
    }

}
