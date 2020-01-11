/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: RuntimeLookAndFeelLoader.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.laf;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Héctor
 */
public class RuntimeLookAndFeelLoader {

    public static void changeLookAndFeel(JFrame frame, String lookAndFeel) {
        if (lookAndFeel.equals("Metal")) {
            try {
                UIManager.setLookAndFeel(UIManager
                        .getCrossPlatformLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException
                    | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        }
        if (lookAndFeel.equals("Nimbus")) {
            try {
                UIManager
                        .setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException
                    | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        }
        if (lookAndFeel.equals("System")) {
            try {
                UIManager.setLookAndFeel(UIManager
                        .getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException
                    | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }

}
