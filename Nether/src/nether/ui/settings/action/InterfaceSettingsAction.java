package nether.ui.settings.action;

import java.awt.Component;
import java.awt.Window;
import javax.swing.SwingUtilities;
import nether.ui.settings.IntefaceSettingsPanel;
import nether.util.config.ConfigBuilder;

/**
 * Controller class for Interface settings.
 *
 * @author Héctor
 */
public class InterfaceSettingsAction {

    public InterfaceSettingsAction() {
    }

    /**
     * Saves given settings to interface settings file.
     *
     */
    public void saveInterfaceSettings() {
        Boolean checkValue = IntefaceSettingsPanel.isDefaultCheck();
        String comboValue = IntefaceSettingsPanel.getThemeComboValue();

        ConfigBuilder.createSettingsFile(null, null, null, checkValue.toString(), comboValue);
    }

    /**
     * Disposes the current open <code>Component</code>.
     *
     * @param c Component to close or dispose.
     */
    public void dispose(Component c) {
        Component component = SwingUtilities.getRoot(c);
        ((Window) component).dispose();
    }
}
