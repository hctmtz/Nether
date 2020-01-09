package nether.ui.settings;

import nether.ui.settings.action.GeneralSettingsPanelAction;

/**
 *
 * @author Héctor-
 */
public class GeneralSettingsPanel extends javax.swing.JPanel {

    public GeneralSettingsPanel() {
        initComponents();
    }

    private String[] lang = {
        "Spanish (Español)",
        "English (English)"
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsPanel = new javax.swing.JPanel();
        defaultCheck = new javax.swing.JCheckBox();
        hintLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        defaultDbTextField = new javax.swing.JTextField();
        buttonsPane = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(440, 260));

        fieldsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración general"));

        defaultCheck.setText("Usar bitácora por defecto");
        defaultCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultCheckActionPerformed(evt);
            }
        });

        hintLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/exclamation-circle.png"))); // NOI18N
        hintLabel.setText("Estos cambios no se verán reflejados hasta reiniciar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/locale.png"))); // NOI18N
        jLabel1.setText("Idioma:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(lang));

        defaultDbTextField.setEnabled(false);

        javax.swing.GroupLayout fieldsPanelLayout = new javax.swing.GroupLayout(fieldsPanel);
        fieldsPanel.setLayout(fieldsPanelLayout);
        fieldsPanelLayout.setHorizontalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defaultCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defaultDbTextField))
                .addContainerGap())
        );
        fieldsPanelLayout.setVerticalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaultCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defaultDbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hintLabel)
                .addContainerGap(63, Short.MAX_VALUE))
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
                    .addComponent(buttonsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        new GeneralSettingsPanelAction().disposeFrame(this);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

    }//GEN-LAST:event_saveButtonActionPerformed

    private void defaultCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultCheckActionPerformed
        if (defaultCheck.isSelected()) {
            defaultDbTextField.setEnabled(true);
            defaultDbTextField.setText(GeneralSettingsPanelAction.DEFAULT_DB_FILE);
        } else {
            defaultDbTextField.setText(null);
            defaultDbTextField.setEnabled(false);
        }
    }//GEN-LAST:event_defaultCheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox defaultCheck;
    private javax.swing.JTextField defaultDbTextField;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
