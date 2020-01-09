package nether.util.splash;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

public class GuiUtility {

    public static void centerOnScreen(Window window) {
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension splashSize = window.getPreferredSize();
        
        window.setLocation(screenSize.width / 2 - splashSize.width / 2,
        screenSize.height / 2 - splashSize.height / 2);
    }
}
