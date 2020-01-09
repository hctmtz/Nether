package nether.util.laf.themes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceAutumnLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlueSteelLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCeruleanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCremeCoffeeLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCremeLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceDustLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGeminiLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteAquaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteGoldLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMagellanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMarinerLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMistAquaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMistSilverLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceModerateLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceNebulaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceOfficeBlack2007LookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceOfficeBlue2007LookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceOfficeSilver2007LookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceRavenLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceSaharaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceTwilightLookAndFeel;

/**
 *
 * @author Héctor-
 */
public class SubstanceThemes {

    public static void setThemeSubstanceAutumn() {
        try {
            UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceBussines() {
        try {
            UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceBussinesBlackSteel() {
        try {
            UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceBussinesBlueSteel() {
        try {
            UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceCerulean() {
        try {
            UIManager.setLookAndFeel(new SubstanceCeruleanLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceCreme() {
        try {
            UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceCremeCoffee() {
        try {
            UIManager.setLookAndFeel(new SubstanceCremeCoffeeLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceDust() {
        try {
            UIManager.setLookAndFeel(new SubstanceDustLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceDustCoffee() {
        try {
            UIManager.setLookAndFeel(new SubstanceDustCoffeeLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceGemini() {
        try {
            UIManager.setLookAndFeel(new SubstanceGeminiLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceGraphite() {
        try {
            UIManager.setLookAndFeel(new SubstanceGraphiteLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceGraphiteAqua() {
        try {
            UIManager.setLookAndFeel(new SubstanceGraphiteAquaLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceGraphiteGold() {
        try {
            UIManager.setLookAndFeel(new SubstanceGraphiteGoldLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceMagellan() {
        try {
            UIManager.setLookAndFeel(new SubstanceMagellanLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceMariner() {
        try {
            UIManager.setLookAndFeel(new SubstanceMarinerLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceMistAqua() {
        try {
            UIManager.setLookAndFeel(new SubstanceMistAquaLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceMistSilver() {
        try {
            UIManager.setLookAndFeel(new SubstanceMistSilverLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceModerate() {
        try {
            UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceNebula() {
        try {
            UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceRaven() {
        try {
            UIManager.setLookAndFeel(new SubstanceRavenLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceOffice2007Black() {
        try {
            UIManager.setLookAndFeel(new SubstanceOfficeBlack2007LookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);

        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceOffice2007Blue() {
        try {
            UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceOffice2007Silver() {
        try {
            UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceSahara() {
        try {
            UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    public static void setThemeSubstanceTwilight() {
        try {
            UIManager.setLookAndFeel(new SubstanceTwilightLookAndFeel());
            SubstanceCortex.GlobalScope.setButtonIgnoreMinimumSize(Boolean.TRUE);
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

}
