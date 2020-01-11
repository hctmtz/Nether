/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: SystemPropertiesPanel.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.about;

/**
 *
 * @author Héctor-
 */
public class SystemPropertiesPanel extends javax.swing.JPanel {

    public SystemPropertiesPanel() {
        initComponents();
        fillInformationTextArea();
    }

    /**
     * Sets systems information in the About TextArea. It also sets its scroll
     * pane to top after adding the text.
     *
     */
    private void fillInformationTextArea() {
        propertiesText.setText(getSystemData());
        propertiesText.setSelectionStart(0);
        propertiesText.setSelectionEnd(0);
    }

    /**
     * Gets system and user information to show in the About dialog.
     *
     * @return System information string
     */
    private String getSystemData() {
        String information = null;
        String newLine = System.getProperty("line.separator");
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");
        String userLanguage = System.getProperty("user.language");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String javaVersion = System.getProperty("java.version");

        information = "ℹ Información de usuario" + newLine
                + "↪ Usuario del sistema: " + userName + newLine
                + "↪ Directorio de usuario: " + userHome + newLine
                + newLine
                + "ℹ Información de equipo" + newLine
                + "↪ Sistema Operativo: " + osName + newLine
                + "↪ Arquitectura: " + osArch + newLine
                + "↪ Versión: " + osVersion + newLine
                + "↪ Idioma: " + userLanguage + newLine
                + "↪ Versión de Java: " + javaVersion;

        return information;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        textScroll = new javax.swing.JScrollPane();
        propertiesText = new javax.swing.JTextArea();

        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/information.png"))); // NOI18N
        nameLabel.setText("Nether © Copyright");

        textScroll.setToolTipText("");

        propertiesText.setEditable(false);
        propertiesText.setColumns(20);
        propertiesText.setRows(5);
        textScroll.setViewportView(propertiesText);

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textScroll)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea propertiesText;
    private javax.swing.JScrollPane textScroll;
    // End of variables declaration//GEN-END:variables
}
