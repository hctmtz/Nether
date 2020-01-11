/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: MainFrameController.java
 *  Date: 12/11/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.main;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import nether.ui.about.AboutFrame;
import nether.ui.settings.SettingsFrame;
import nether.ui.systeminfo.SystemInfoFrame;
import nether.util.config.ConfigLoader;

/**
 * This class is intended to become the controller of the main ui.
 * 
 * @author Héctor
 */
public class MainFrameController extends MainFrameView {

    //private MainFrameView mainFrameView;
    private JPopupMenu textPopup;

    public MainFrameController() {
        init();
        addEvents();
        addTooltips();
    }

    /**
     * Initialises the properties and events of the class.
     * 
     */
    private void init() {
        ConfigLoader.setLookAndFeelTheme();
        //this = new MainFrameView();

        //Goes at last to prevent graphical artifacs appearing in the screen.
        this.setVisible(true);
    }

    /**
     * Adds events to the component.
     *
     */
    private void addEvents() {
        this.findButton.addActionListener((e) -> {
            findButtonActionPerformed(e);
        });

        this.closeAllTabsMenuItem.addActionListener((e) -> {
            closeAllTabsMenuItemActionPerformed(e);
        });

        this.closeTabButton.addActionListener((e) -> {
            closeCurrentTabMenuActionPerformed(e);
        });

        this.closeTabMenuItem.addActionListener((e) -> {
            closeCurrentTabMenuActionPerformed(e);
        });

        this.aboutMenuItem.addActionListener((e) -> {
            aboutMenuItemActionPerformed(e);
        });

        this.settingsMenuItem.addActionListener((e) -> {
            settingsMenuItemActionPerformed(e);
        });

        this.systemInfoMenuItem.addActionListener((e) -> {
            systemInfoMenuItemActionPerformed(e);
        });

        this.findMenuItem.addActionListener((e) -> {
            findMenuItemActionPerformed(e);
        });

        this.copyMenuItem.addActionListener((e) -> {
            copyMenuItemActionPerformed(e);
        });
    }

    /**
     * Adds tooltips to components.
     *
     */
    private void addTooltips() {
        this.closeTabButton.setToolTipText("Cerrar la pestaña actual.");
        this.copyButton.setToolTipText("Copiar el texto seleccionado.");
        this.cutButton.setToolTipText("Cortar el texto seleccionado.");
        this.pasteButton.setToolTipText("Pegar el texto seleccionado.");
        this.exitButton.setToolTipText("Salir de la aplicación.");
        this.findButton.setToolTipText("Buscar registros.");
        this.clockLabel.setToolTipText("Hora actual.");
    }

    /**
     * Adds a new find panel to the tabbed panel.
     *
     * @param e
     */
    private void findButtonActionPerformed(ActionEvent e) {
        SearchPanelView sp = new SearchPanelView();
        this.contentTabbed.addTab("Buscar", new ImageIcon(getClass().getResource("/nether/resources/icons/x16/binocular.png")), sp);
    }

    /**
     * Closes all tabs in a JTabbedPane.
     *
     * @param e
     */
    private void closeAllTabsMenuItemActionPerformed(ActionEvent e) {

        if (this.contentTabbed.getTabCount() >= 1) {
            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Cerrar todas las pestañas? Cualquier dato no guardado se perderá.",
                    "Cerrar pestaña", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirm == 0) {
                while (this.contentTabbed.getTabCount() >= 1) {
                    this.contentTabbed.removeAll();
                }
            }

        }

    }

    /**
     * Closes the selected tab.
     *
     * @param e
     */
    private void closeCurrentTabMenuActionPerformed(ActionEvent e) {
        int index = this.contentTabbed.getSelectedIndex();

        if (index != -1) {
            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Cerrar pestaña? Cualquier dato no guardado se perderá.",
                    "Cerrar pestaña", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirm == 0) {
                this.contentTabbed.remove(index);
            }

        }
    }

    /**
     * Creates a new AboutFrame object.
     *
     * @param e
     */
    private void aboutMenuItemActionPerformed(ActionEvent e) {
        new AboutFrame().setVisible(true);
    }

    /**
     * Creates a new SettingsFrame object.
     *
     * @param e
     */
    private void settingsMenuItemActionPerformed(ActionEvent e) {
        new SettingsFrame().setVisible(true);
    }

    /**
     * Creates a new SystemInfoFrame object.
     *
     * @param e
     */
    private void systemInfoMenuItemActionPerformed(ActionEvent e) {
        new SystemInfoFrame().setVisible(true);
    }

    /**
     * Adds a new find panel.
     *
     * @param e
     */
    private void findMenuItemActionPerformed(ActionEvent e) {
        SearchPanelView sp = new SearchPanelView();
        this.contentTabbed.addTab("Buscar", new ImageIcon(getClass().getResource("/nether/resources/icons/x16/binocular.png")), sp);
    }

    /**
     *
     *
     * @param e
     */
    private void copyMenuItemActionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object instanceof JTextField) {
            copySelectedText((JTextField) object);
        }
    }

    /**
     * Copies the selected text to clipboard.
     *
     * @param component
     */
    private void copySelectedText(JTextComponent component) {
        StringSelection stringSelection = new StringSelection(component.getSelectedText());

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    /**
     * Application main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrameController();
        });

    }
}
