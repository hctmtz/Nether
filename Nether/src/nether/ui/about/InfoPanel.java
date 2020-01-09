package nether.ui.about;

/**
 *
 * @author Héctor-
 */
public class InfoPanel extends javax.swing.JPanel {

    public InfoPanel() {
        initComponents();
        fillTextArea();
    }

    private void fillTextArea() {
        propertiesText.setText(setSystemAboutInfo());
    }

    private String setSystemAboutInfo() {
        String i = null;
        i = "💬 Nether es un sistema de aplicaciones de uso múltiple."
                + System.getProperty("line.separator")
                + "Fue diseñado para tener una gran facilidad de uso y utilidad."
                + System.getProperty("line.separator");

        return i;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        propertiesPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        propertiesText = new javax.swing.JTextArea();

        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/information.png"))); // NOI18N
        nameLabel.setText("Acerca");

        propertiesPane.setFocusTraversalPolicyProvider(true);

        propertiesText.setEditable(false);
        propertiesText.setColumns(20);
        propertiesText.setRows(5);
        jScrollPane1.setViewportView(propertiesText);

        javax.swing.GroupLayout propertiesPaneLayout = new javax.swing.GroupLayout(propertiesPane);
        propertiesPane.setLayout(propertiesPaneLayout);
        propertiesPaneLayout.setHorizontalGroup(
            propertiesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        propertiesPaneLayout.setVerticalGroup(
            propertiesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertiesPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propertiesPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel propertiesPane;
    private javax.swing.JTextArea propertiesText;
    // End of variables declaration//GEN-END:variables
}
