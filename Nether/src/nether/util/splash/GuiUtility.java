/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: GuiUtility.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.splash;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

public class GuiUtility {

    public static void centerOnScreen(Window window) {
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension splashSize = window.getPreferredSize();
        
        window.setLocation(screenSize.width / 2 - splashSize.width / 2,
        screenSize.height / 2 - splashSize.height / 2);
    }
}
