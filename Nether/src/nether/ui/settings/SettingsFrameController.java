/*
 *  13/11/2018
 */
package nether.ui.settings;

/**
 * Controlador de la vista SettingsFrame
 * 
 * @author Héctor
 */
public class SettingsFrameController {

    private static SettingsFrameController settingsFrameController;

    /**
     * Private constructor for single isntance.
     *
     */
    public SettingsFrameController() {
        init();
    }

    /**
     * Returns class instance.
     *
     * @return Class instance.
     */
    public static SettingsFrameController getInstance() {
        if (settingsFrameController == null) {
            settingsFrameController = new SettingsFrameController();
        }
        return settingsFrameController;
    }

    /**
     * Initialices components and properties that should not go in the class
     * constructor.
     *
     */
    private void init() {

    }
}
