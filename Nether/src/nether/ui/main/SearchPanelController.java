/*
 *  23/01/2019
 */
package nether.ui.main;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

/**
 *
 * @author Héctor
 */
public class SearchPanelController extends SearchPanelView {

    public SearchPanelController() {
        init();
        addEvents();
    }

    /**
     *
     */
    private void init() {

    }

    /**
     *
     */
    private void addEvents() {

    }

    private void findButtonActionPerformed(MouseEvent e) {
        Object object = e.getSource();

        if (object instanceof JTextField) {

        }
    }

    private FocusListener getFocusListener() {
        return new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                System.out.println("action");
            }
        };
    }

}
