package nether.util.laf.themes;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Héctor-
 */
public class ExtraThemes {

    /**
     * Loads Darcula look and feel
     */
    public static void setThemeDarcula() {
        try {
            UIManager.setLookAndFeel(new DarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
        }
    }
}
