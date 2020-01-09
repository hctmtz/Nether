package nether.ui.settings;

import javax.swing.ImageIcon;

/**
 * Application settings and cofiguration frame.
 *
 * @author Héctor
 */
public class SettingsFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Class constructor.
     *
     */
    public SettingsFrame() {
        initComponents();
        init();
    }

    /**
     * Properties and settings that can't or won't be a good idea to start
     * within the constructor.
     *
     */
    private void init() {
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
        settingsTabbedPane = new javax.swing.JTabbedPane();
        generalSettingsPanel1 = new nether.ui.settings.GeneralSettingsPanel();
        intefaceSettingsPanel1 = new nether.ui.settings.IntefaceSettingsPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración");
        setResizable(false);

        contentPane.setPreferredSize(new java.awt.Dimension(480, 300));

        settingsTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        settingsTabbedPane.setPreferredSize(new java.awt.Dimension(440, 260));
        settingsTabbedPane.addTab("General", new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/gear.png")), generalSettingsPanel1); // NOI18N
        settingsTabbedPane.addTab("Interfaz", new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/tie.png")), intefaceSettingsPanel1); // NOI18N

        org.jdesktop.layout.GroupLayout contentPaneLayout = new org.jdesktop.layout.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, settingsTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(settingsTabbedPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(contentPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .add(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, contentPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private nether.ui.settings.GeneralSettingsPanel generalSettingsPanel1;
    private nether.ui.settings.IntefaceSettingsPanel intefaceSettingsPanel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane settingsTabbedPane;
    // End of variables declaration//GEN-END:variables

}
