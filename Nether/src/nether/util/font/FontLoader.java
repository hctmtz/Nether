package nether.util.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JComponent;

/**
 *
 * @author Héctor-
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
