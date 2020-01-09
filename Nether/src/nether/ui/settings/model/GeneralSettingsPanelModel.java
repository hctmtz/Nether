package nether.ui.settings.model;

/**
 *
 * @author Hmartinez
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
