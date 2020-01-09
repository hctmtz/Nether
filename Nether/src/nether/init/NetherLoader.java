package nether.init;

import java.awt.Color;
import nether.ui.main.MainFrameController;
import nether.util.splash.JSplash;

/**
 * Application entry point. This class is intendeed to be the main
 * executable/launcher.
 *
 * @author Héctor-
 */
public class NetherLoader {

    /**
     * Property fields.
     */
    private static final String APP_SPLASH = nether.ui.IconConstants.APP_SPLASH;
    private static final String APP_NAME = nether.system.SystemInfo.APP_NAME;
    private static final String APP_VERSION = nether.system.SystemInfo.APP_VERSION;

    /**
     * Loads the application splash screen.
     */
    private static void loadSplashScreen() {
        try {
            JSplash splash = new JSplash(
                    NetherLoader.class.getResource(APP_SPLASH), true, true,
                    false, APP_NAME + APP_VERSION, null,
                    Color.BLACK, Color.BLACK);
            
            splash.splashOn();

            for (int i = 0; i < 100; i++) {
                splash.setProgress(i, "Cargando");
                Thread.sleep(20);
            }

            splash.splashOff();

        } catch (InterruptedException e) {

        }
    }

    public static void main(String args[]) {
        loadSplashScreen();
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrameController();
        });
    }

}
