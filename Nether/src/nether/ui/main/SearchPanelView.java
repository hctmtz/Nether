package nether.ui.main;

import nether.ui.main.action.SearchPanelAction;

/**
 *
 * @author Héctor
 */
public class SearchPanelView extends javax.swing.JPanel {

    SearchPanelAction sp = new SearchPanelAction();

    public SearchPanelView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsPane = new javax.swing.JPanel();
        searchCombo = new javax.swing.JComboBox();
        searchField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        tablePane = new javax.swing.JPanel();
        tableScrollpane = new javax.swing.JScrollPane(dataTable);
        dataTable = new javax.swing.JTable();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(400, 224));
        setVerifyInputWhenFocusTarget(false);

        fieldsPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fieldsPane.setMinimumSize(new java.awt.Dimension(370, 130));
        fieldsPane.setName(""); // NOI18N
        fieldsPane.setPreferredSize(new java.awt.Dimension(370, 130));

        searchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paciente" }));

        searchField.setPreferredSize(new java.awt.Dimension(100, 20));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/magnifier.png"))); // NOI18N

        javax.swing.GroupLayout fieldsPaneLayout = new javax.swing.GroupLayout(fieldsPane);
        fieldsPane.setLayout(fieldsPaneLayout);
        fieldsPaneLayout.setHorizontalGroup(
            fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fieldsPaneLayout.setVerticalGroup(
            fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPaneLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(fieldsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fieldsPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {searchCombo, searchField});

        tablePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablePane.setPreferredSize(new java.awt.Dimension(480, 200));
        tablePane.setLayout(new java.awt.BorderLayout());

        tableScrollpane.setMinimumSize(new java.awt.Dimension(452, 300));
        tableScrollpane.setPreferredSize(new java.awt.Dimension(452, 352));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "Género"
            }
        ));
        tableScrollpane.setViewportView(dataTable);

        tablePane.add(tableScrollpane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(fieldsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        sp.findByConcept(dataTable, searchField.getText());
    }//GEN-LAST:event_searchFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel fieldsPane;
    private javax.swing.JComboBox searchCombo;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel tablePane;
    private javax.swing.JScrollPane tableScrollpane;
    // End of variables declaration//GEN-END:variables
}
