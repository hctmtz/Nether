/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: MainFrameView.java
 *  Date: 30/10/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.main;

import javax.swing.ImageIcon;
import nether.util.config.ConfigLoader;

/**
 * Main frame and application start point.
 *
 * @author Héctor
 */
public class MainFrameView extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainFrameView() {
        initComponents();
        init();
    }

    private void init() {

        this.setIconImage(new ImageIcon(getClass()
                .getResource(nether.ui.IconConstants.APP_ICON))
                .getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        ConfigLoader.setLookAndFeelTheme();

        statusProgressBar.setVisible(false);
        statusLabel.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        findButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        copyButton = new javax.swing.JButton();
        cutButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        exitButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        closeTabButton = new javax.swing.JButton();
        contentTabbed = new javax.swing.JTabbedPane();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        statusProgressBar = new javax.swing.JProgressBar();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        clockLabel = new nether.ui.component.ClockLabel();
        fillLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        closeTabMenuItem = new javax.swing.JMenuItem();
        closeAllTabsMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        copyMenuItem = new javax.swing.JMenuItem();
        cutMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        findMenuItem = new javax.swing.JMenuItem();
        toolsMenu = new javax.swing.JMenu();
        addPatientMenuItem = new javax.swing.JMenuItem();
        addConsultationMenuItem = new javax.swing.JMenuItem();
        addAppointmentMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        settingsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        systemInfoMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nether");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(450, 390));
        setSize(new java.awt.Dimension(450, 390));

        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        findButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/binocular.png"))); // NOI18N
        findButton.setFocusable(false);
        findButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(findButton);
        toolBar.add(jSeparator1);

        copyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/document-copy.png"))); // NOI18N
        copyButton.setFocusable(false);
        copyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(copyButton);

        cutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/scissors.png"))); // NOI18N
        cutButton.setFocusable(false);
        cutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(cutButton);

        pasteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/clipboard-paste.png"))); // NOI18N
        pasteButton.setFocusable(false);
        pasteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pasteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(pasteButton);
        toolBar.add(jSeparator2);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/door-open-out.png"))); // NOI18N
        exitButton.setFocusable(false);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(exitButton);
        toolBar.add(filler1);

        closeTabButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/cross-small.png"))); // NOI18N
        closeTabButton.setFocusable(false);
        closeTabButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeTabButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(closeTabButton);

        statusPanel.setLayout(new javax.swing.BoxLayout(statusPanel, javax.swing.BoxLayout.LINE_AXIS));

        statusLabel.setText("<Barra de estado>");
        statusPanel.add(statusLabel);
        statusPanel.add(filler2);

        statusProgressBar.setIndeterminate(true);
        statusPanel.add(statusProgressBar);
        statusPanel.add(filler3);
        statusPanel.add(clockLabel);

        fillLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/clock-small.png"))); // NOI18N
        statusPanel.add(fillLabel);

        fileMenu.setText("Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/document.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        fileMenu.add(jMenuItem1);
        fileMenu.add(jSeparator6);

        closeTabMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        closeTabMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/cross.png"))); // NOI18N
        closeTabMenuItem.setText("Cerrar pestaña actual");
        fileMenu.add(closeTabMenuItem);

        closeAllTabsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        closeAllTabsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/minus-circle.png"))); // NOI18N
        closeAllTabsMenuItem.setText("Cerrar todas las pestañas");
        fileMenu.add(closeAllTabsMenuItem);
        fileMenu.add(jSeparator3);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/door-open-out.png"))); // NOI18N
        exitMenuItem.setText("Salir");
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Editar");

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/document-copy.png"))); // NOI18N
        copyMenuItem.setText("Copiar");
        editMenu.add(copyMenuItem);

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/scissors.png"))); // NOI18N
        cutMenuItem.setText("Cortar");
        editMenu.add(cutMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/clipboard-paste.png"))); // NOI18N
        pasteMenuItem.setText("Pegar");
        editMenu.add(pasteMenuItem);
        editMenu.add(jSeparator5);

        findMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        findMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/binocular.png"))); // NOI18N
        findMenuItem.setText("Buscar");
        editMenu.add(findMenuItem);

        menuBar.add(editMenu);

        toolsMenu.setText("Herramientas");

        addPatientMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/users.png"))); // NOI18N
        addPatientMenuItem.setText("Registrar paciente");
        toolsMenu.add(addPatientMenuItem);

        addConsultationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/document--plus.png"))); // NOI18N
        addConsultationMenuItem.setText("Registrar consulta");
        toolsMenu.add(addConsultationMenuItem);

        addAppointmentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/calendar.png"))); // NOI18N
        addAppointmentMenuItem.setText("Registrar cita");
        toolsMenu.add(addAppointmentMenuItem);
        toolsMenu.add(jSeparator4);

        settingsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/gear.png"))); // NOI18N
        settingsMenuItem.setText("Configuración de la aplicación");
        toolsMenu.add(settingsMenuItem);

        menuBar.add(toolsMenu);

        helpMenu.setText("Ayuda");

        systemInfoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/application-monitor.png"))); // NOI18N
        systemInfoMenuItem.setText("Propiedades del sistema");
        helpMenu.add(systemInfoMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nether/resources/icons/x16/light-bulb.png"))); // NOI18N
        aboutMenuItem.setText("Acerca de la aplicación");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentTabbed)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentTabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenuItem aboutMenuItem;
    protected javax.swing.JMenuItem addAppointmentMenuItem;
    protected javax.swing.JMenuItem addConsultationMenuItem;
    protected javax.swing.JMenuItem addPatientMenuItem;
    protected nether.ui.component.ClockLabel clockLabel;
    protected javax.swing.JMenuItem closeAllTabsMenuItem;
    protected javax.swing.JButton closeTabButton;
    protected javax.swing.JMenuItem closeTabMenuItem;
    protected javax.swing.JTabbedPane contentTabbed;
    protected javax.swing.JButton copyButton;
    protected javax.swing.JMenuItem copyMenuItem;
    protected javax.swing.JButton cutButton;
    protected javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenu editMenu;
    protected javax.swing.JButton exitButton;
    protected javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel fillLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    protected javax.swing.JButton findButton;
    protected javax.swing.JMenuItem findMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuBar menuBar;
    protected javax.swing.JButton pasteButton;
    protected javax.swing.JMenuItem pasteMenuItem;
    protected javax.swing.JMenuItem settingsMenuItem;
    protected javax.swing.JLabel statusLabel;
    protected javax.swing.JPanel statusPanel;
    protected javax.swing.JProgressBar statusProgressBar;
    protected javax.swing.JMenuItem systemInfoMenuItem;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JMenu toolsMenu;
    // End of variables declaration//GEN-END:variables
}
