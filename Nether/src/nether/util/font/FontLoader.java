/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: FontLoader.java
 *  Date: 2/01/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JComponent;

/**
 *
 * @author Héctor
 */
public class FontLoader {

    public static void CargarFuenteBold(JComponent component) {
        try {
            InputStream is = FontLoader.class.getResourceAsStream("/com/banco/resources/fonts/NotoSans-Bold.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            Font sizedFont = font.deriveFont(12f);
            component.setFont(sizedFont);
        } catch (FontFormatException | IOException e) {
        }

    }

    public static void CargarFuenteRegular(JComponent component) {
        try {
            InputStream is = FontLoader.class.getResourceAsStream("/com/banco/resources/fonts/NotoSans-Regular.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            Font sizedFont = font.deriveFont(12f);
            component.setFont(sizedFont);
        } catch (FontFormatException | IOException e) {
        }

    }
}
