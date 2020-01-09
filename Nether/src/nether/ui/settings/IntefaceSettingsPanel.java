package nether.ui.settings;

import nether.ui.settings.action.InterfaceSettingsAction;
import nether.util.config.ConfigLoader;

/**
 * Interface settings panel, saves and edits the application appearance
 * settings.
 *
 * @author Héctor-
 */
public class IntefaceSettingsPanel extends javax.swing.JPanel {

    InterfaceSettingsAction is;

    public static String getThemeComboValue() {
        return themeCombo.getSelectedItem().toString();
    }

    public static void setThemeComboValue(Object value) {
        themeCombo.setSelectedItem(value);
    }

    public static Boolean isDefaultCheck() {
        return defaultCheck.isSelected();
    }

    /**
     * Loads settings saved in the application properties settings file.
     */
    private void loadSettings() {
        Boolean checkValue = Boolean.parseBoolean(ConfigLoader.isSystemLookAndFeelEnabled());

        defaultCheck.setSelected(checkValue);
        themeCombo.setSelectedItem(ConfigLoader.getLookAndFeelTheme());
        themeCombo.setEnabled(!checkValue);
    }

    public IntefaceSettingsPanel() {
        initComponents();
        loadSettings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsPanel = new javax.swing.JPanel();
        defaultCheck = new javax.swing.JCheckBox();
        themeCombo = new javax.swing.JComboBox<>();
        themeLabel = new javax.swing.JLabel();
        hintLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        buttonsPane = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(440, 260));

        fieldsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración apariencia"));

        defaultCheck.setText("Usar el tema por defecto del sistema");
        defaultCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultCheckActionPerformed(evt);
            }
        });

        themeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(nether.ui.settings.ThemesEnum.toArray()));

        themeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/tie.png"))); // NOI18N
        themeLabel.setText("Cargar el siguiente tema perzonalizado:");

        hintLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/exclamation-circle.png"))); // NOI18N
        hintLabel.setText("Estos cambios no se verán reflejados hasta reiniciar");

        javax.swing.GroupLayout fieldsPanelLayout = new javax.swing.GroupLayout(fieldsPanel);
        fieldsPanel.setLayout(fieldsPanelLayout);
        fieldsPanelLayout.setHorizontalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defaultCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(themeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fieldsPanelLayout.setVerticalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaultCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(themeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(themeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hintLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addContainerGap())
        );

        buttonsPane.setLayout(new javax.swing.BoxLayout(buttonsPane, javax.swing.BoxLayout.LINE_AXIS));
        buttonsPane.add(filler1);

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/cross-circle.png"))); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonsPane.add(cancelButton);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/disk.png"))); // NOI18N
        saveButton.setText("Aplicar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        buttonsPane.add(saveButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(fieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void defaultCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultCheckActionPerformed
        if (defaultCheck.isSelected()) {
            themeCombo.setEnabled(false);
            themeCombo.setSelectedItem("System");
        } else {
            themeCombo.setEnabled(true);
        }
    }//GEN-LAST:event_defaultCheckActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        new InterfaceSettingsAction().dispose(this);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        is = new InterfaceSettingsAction();
        is.saveInterfaceSettings();
        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/information.png")));
        infoLabel.setText("Configuración guardada");
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JButton cancelButton;
    private static javax.swing.JCheckBox defaultCheck;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton saveButton;
    private static javax.swing.JComboBox<String> themeCombo;
    private javax.swing.JLabel themeLabel;
    // End of variables declaration//GEN-END:variables
}
