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
