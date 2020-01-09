package nether.ui.settings.action;

import java.awt.Component;
import java.awt.Window;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hmartinez
 */
public class GeneralSettingsPanelAction {

    public static final String DEFAULT_DB_FILE = "/data/bank.db";
    public static final String DEFAULT_DB_PATH = "jdbc:sqlite:" + DEFAULT_DB_FILE;

    public void disposeFrame(Component component) {
        Component comp = SwingUtilities.getRoot(component);
        ((Window) comp).dispose();
    }

}
