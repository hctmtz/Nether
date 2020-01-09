/*
 *  23/02/2018
 */
package nether.ui.systeminfo;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Héctor
 */
public class SystemInfoFrame extends javax.swing.JFrame {

    /**
     * Creates a new instance of SystemInfoFrame class.
     */
    public SystemInfoFrame() {
        initComponents();
        init();
    }

    /**
     * Describes the jtable column names.
     */
    private final String[] columnNames = {"Atributo", "Valor"};

    private void init() {
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource(nether.ui.IconConstants.APP_ICON)).getImage());

    }

    /**
     * Describes the default system properties.
     */
    private final Object[][] systemInfo = {
        {"java.version", System.getProperty("java.version")},
        {"java.vendor", System.getProperty("java.vendor")},
        {"java.vendor.url", System.getProperty("java.vendor.url")},
        {"java.home", System.getProperty("java.home")},
        {"java.vm.specification.version", System.getProperty("java.vm.specification.version")},
        {"java.vm.specification.vendor", System.getProperty("java.vm.specification.vendor")},
        {"java.vm.specification.name", System.getProperty("java.vm.specification.name")},
        {"java.vm.version", System.getProperty("java.vm.version")},
        {"java.vm.vendor", System.getProperty("java.vm.vendor")},
        {"java.vm.name", System.getProperty("java.vm.name")},
        {"java.specification.version", System.getProperty("java.specification.version")},
        {"java.specification.vendor", System.getProperty("java.specification.vendor")},
        {"java.specification.name", System.getProperty("java.specification.name")},
        {"java.class.version", System.getProperty("java.class.version")},
        {"java.class.path", System.getProperty("java.class.path")},
        {"java.library.path", System.getProperty("java.library.path")},
        {"java.io.tmpdir", System.getProperty("java.io.tmpdir")},
        {"java.compiler", System.getProperty("java.compiler")},
        {"java.ext.dirs", System.getProperty("java.ext.dirs")},
        {"os.name", System.getProperty("os.name")},
        {"os.arch", System.getProperty("os.arch")},
        {"os.version", System.getProperty("os.version")},
        {"user.name", System.getProperty("user.name")},
        {"user.home", System.getProperty("user.home")},
        {"user.dir", System.getProperty("user.dir")},
        {"user.country", System.getProperty("user.country")}
    };

    private final DefaultTableModel tableModel = new DefaultTableModel(systemInfo, 0);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePane = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        contentPane = new javax.swing.JPanel();
        tablePane = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable(systemInfo,columnNames);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información del sistema");
        setMinimumSize(new java.awt.Dimension(450, 300));
        setPreferredSize(new java.awt.Dimension(450, 300));

        titlePane.setPreferredSize(new java.awt.Dimension(400, 90));

        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/wrench-screwdriver.png"))); // NOI18N
        titleLabel.setText("Propiedades avanzadas del sistema");

        javax.swing.GroupLayout titlePaneLayout = new javax.swing.GroupLayout(titlePane);
        titlePane.setLayout(titlePaneLayout);
        titlePaneLayout.setHorizontalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePaneLayout.setVerticalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tablePane.setLayout(new java.awt.BorderLayout());

        tableScroll.setViewportView(infoTable);

        tablePane.add(tableScroll, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePane, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePane, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SystemInfoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private javax.swing.JTable infoTable;
    private javax.swing.JPanel tablePane;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePane;
    // End of variables declaration//GEN-END:variables
}
