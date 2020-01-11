/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: SearchPanelController.java
 *  Date: 23/01/2019 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
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
