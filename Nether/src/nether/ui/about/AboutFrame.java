package nether.ui.about;

import javax.swing.ImageIcon;

/**
 *
 * @author Héctor-
 */
public class AboutFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public AboutFrame() {
        initComponents();
        init();
    }
    
    private void init(){
        System.setProperty("file.encoding", "UTF-8");
        setVisible(true);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource(nether.ui.IconConstants.APP_ICON)).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        contentPane = new javax.swing.JPanel();
        logoPane = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        InfoTabbed = new javax.swing.JTabbedPane();
        infoPanel1 = new nether.ui.about.InfoPanel();
        systemPropertiesPanel2 = new nether.ui.about.SystemPropertiesPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de Banco");
        setResizable(false);

        logoPane.setLayout(new java.awt.GridBagLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(nether.ui.IconConstants.APP_BANNER)));
        logoPane.add(logoLabel, new java.awt.GridBagConstraints());

        InfoTabbed.addTab("Acerca de", new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/gear.png")), infoPanel1); // NOI18N
        InfoTabbed.addTab("Información del sistema", new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/application-monitor.png")), systemPropertiesPanel2); // NOI18N

        org.jdesktop.layout.GroupLayout contentPaneLayout = new org.jdesktop.layout.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(logoPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .add(InfoTabbed)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                .add(logoPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(InfoTabbed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(contentPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(contentPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AboutFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane InfoTabbed;
    private javax.swing.JPanel contentPane;
    private nether.ui.about.InfoPanel infoPanel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPane;
    private nether.ui.about.SystemPropertiesPanel systemPropertiesPanel2;
    // End of variables declaration//GEN-END:variables

}
