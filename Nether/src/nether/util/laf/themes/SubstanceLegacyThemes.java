/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: SubstanceLegacyThemes.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.laf.themes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.jvnet.substance.skin.SubstanceCremeCoffeeLookAndFeel;
import org.jvnet.substance.skin.SubstanceFieldOfWheatLookAndFeel;

/**
 *
 * @author Héctor
 */
public class SubstanceLegacyThemes {

    public static void setThemeSubstanceBusinessBlackSteelLegacy() {
        try {
            UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
            UIManager.put(SubstanceLookAndFeel.BUTTON_NO_MIN_SIZE_PROPERTY, Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceCremeCoffeeLegacy() {
        try {
            UIManager.setLookAndFeel(new SubstanceCremeCoffeeLookAndFeel());
            UIManager.put(SubstanceLookAndFeel.BUTTON_NO_MIN_SIZE_PROPERTY, Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceFieldOfWheatLegacy() {
        try {
            UIManager.setLookAndFeel(new SubstanceFieldOfWheatLookAndFeel());
            UIManager.put(SubstanceLookAndFeel.BUTTON_NO_MIN_SIZE_PROPERTY, Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

}
