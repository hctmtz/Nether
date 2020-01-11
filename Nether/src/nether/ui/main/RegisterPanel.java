/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: RegisterPanel.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.main;

import nether.ui.main.action.RegisterPanelAction;
import java.time.LocalDate;
import javax.swing.JTextField;

/**
 *
 * @author Héctor-
 */
public class RegisterPanel extends javax.swing.JPanel {

    public RegisterPanel() {
        initComponents();
    }

    public static void setTypeFieldValue(Object value) {
        typeCombo.setSelectedItem(value);
    }

    public static void setDescriptionFieldValue(String value) {
        descriptionField.setText(value);
    }

    public static void setConceptFieldValue(String value) {
        conceptField.setText(value);
    }

    public static void setDateFieldValue(LocalDate value) {
        dateDate.setDate(value);
    }

    public static String getTypeFieldValue() {
        String type;
        type = typeCombo.getSelectedItem().toString();
        return type;
    }

    public static String getDescriptionFieldValue() {
        String description;
        description = descriptionField.getText();
        return description;
    }

    public static String getConceptFieldValue() {
        String concept;
        concept = conceptField.getText();
        return concept;
    }

    public static String getDateFieldValue() {
        String date;
        date = dateDate.getDate().toString();
        return date;
    }

    public boolean isValidText(JTextField field) {
        return field.getText() != null
                && !field.getText().trim().isEmpty();
    }

    public void enableFields() {
        if (isValidText(conceptField)
                && isValidText(descriptionField)) {
            registerButton.setEnabled(true);
            editButton.setEnabled(true);
            deleteButton.setEnabled(true);
        } else {
            registerButton.setEnabled(false);
            editButton.setEnabled(false);
            deleteButton.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsPane = new javax.swing.JPanel();
        conceptLabel = new javax.swing.JLabel();
        conceptField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox();
        dateLabel = new javax.swing.JLabel();
        dateDate = new com.github.lgooddatepicker.components.DatePicker();
        hintLabel = new javax.swing.JLabel();
        tablePane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonsPane = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        registerButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(480, 330));
        setPreferredSize(new java.awt.Dimension(480, 330));

        fieldsPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fieldsPane.setPreferredSize(new java.awt.Dimension(360, 130));

        conceptLabel.setText("Concepto:");

        conceptField.setMinimumSize(new java.awt.Dimension(4, 24));
        conceptField.setPreferredSize(new java.awt.Dimension(100, 24));
        conceptField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                conceptFieldKeyReleased(evt);
            }
        });

        descriptionLabel.setText("Descripción:");

        descriptionField.setMinimumSize(new java.awt.Dimension(30, 24));
        descriptionField.setPreferredSize(new java.awt.Dimension(120, 24));
        descriptionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionFieldKeyReleased(evt);
            }
        });

        typeLabel.setText("Tipo:");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingreso", "Egreso" }));
        typeCombo.setPreferredSize(new java.awt.Dimension(100, 24));

        dateLabel.setText("Fecha:");

        dateDate.setToolTipText("");

        tablePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablePane.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripción", "Tipo", "Fecha", "Concepto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        tablePane.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout fieldsPaneLayout = new javax.swing.GroupLayout(fieldsPane);
        fieldsPane.setLayout(fieldsPaneLayout);
        fieldsPaneLayout.setHorizontalGroup(
            fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fieldsPaneLayout.createSequentialGroup()
                        .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldsPaneLayout.createSequentialGroup()
                                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conceptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(typeCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conceptField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        fieldsPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {conceptLabel, dateLabel, descriptionLabel, typeLabel});

        fieldsPaneLayout.setVerticalGroup(
            fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conceptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conceptLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addGap(23, 23, 23)
                .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(hintLabel)
                .addContainerGap())
        );

        fieldsPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {conceptLabel, dateLabel, descriptionLabel, typeLabel});

        buttonsPane.setPreferredSize(new java.awt.Dimension(120, 130));
        buttonsPane.setLayout(new javax.swing.BoxLayout(buttonsPane, javax.swing.BoxLayout.LINE_AXIS));
        buttonsPane.add(filler1);

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/database-insert.png"))); // NOI18N
        registerButton.setText("Agregar");
        registerButton.setEnabled(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        buttonsPane.add(registerButton);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/database-delete.png"))); // NOI18N
        deleteButton.setText("Eliminar");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonsPane.add(deleteButton);

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/database--pencil.png"))); // NOI18N
        editButton.setText("Editar");
        editButton.setEnabled(false);
        buttonsPane.add(editButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        RegisterPanelAction rp = new RegisterPanelAction();
        rp.addNewRegistry();
        rp.clearFields();
        hintLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/dialog-information.png")));
        hintLabel.setText("Registro agregado");

    }//GEN-LAST:event_registerButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        hintLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/dialog-information.png")));
        hintLabel.setText("Alv");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void descriptionFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionFieldKeyReleased
        enableFields();
    }//GEN-LAST:event_descriptionFieldKeyReleased

    private void conceptFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conceptFieldKeyReleased
        enableFields();
    }//GEN-LAST:event_conceptFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPane;
    private static javax.swing.JTextField conceptField;
    private javax.swing.JLabel conceptLabel;
    private static com.github.lgooddatepicker.components.DatePicker dateDate;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private static javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel fieldsPane;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel tablePane;
    private static javax.swing.JComboBox typeCombo;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
