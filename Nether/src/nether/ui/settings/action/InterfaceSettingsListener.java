/*
 *  5/06/2018
 */
package nether.ui.settings.action;

import java.awt.event.ActionEvent;

/**
 * Listener class for the main ui {@code InterfaceSettingsPanel} class.
 *
 * @author Héctor
 */
public class InterfaceSettingsListener {

    private InterfaceSettingsAction interfaceSettingsPanelAction;

    public InterfaceSettingsListener() {

    }

    /**
     * Triggers the {@code ActionPerformed} event when the {@code JButton} is
     * pushed.
     *
     * @param e
     */
    public void saveButtonActionPerformed(ActionEvent e) {
        interfaceSettingsPanelAction.saveInterfaceSettings();
    }

    public void defaultCheckActionPerformed(ActionEvent e) {
        // InterfaceSettingsPanel p = new InterfaceSettingsPanel();
//        if (p.defaultCheck.isSelected()) {
//            p.themeCombo.setEnabled(false);
//            p.themeCombo.setSelectedItem("System");
//        } else {
//            p.themeCombo.setEnabled(true);
//        }
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        // new InterfaceSettingsAction().dispose(JComponent.);
    }

}
