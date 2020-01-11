/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: SettingsFrameController.java
 *  Date: 13/11/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.settings;

/**
 * Controlador de la vista SettingsFrame
 * 
 * @author Héctor
 */
public class SettingsFrameController {

    private static SettingsFrameController settingsFrameController;

    /**
     * Private constructor for single isntance.
     *
     */
    public SettingsFrameController() {
        init();
    }

    /**
     * Returns class instance.
     *
     * @return Class instance.
     */
    public static SettingsFrameController getInstance() {
        if (settingsFrameController == null) {
            settingsFrameController = new SettingsFrameController();
        }
        return settingsFrameController;
    }

    /**
     * Initialices components and properties that should not go in the class
     * constructor.
     *
     */
    private void init() {

    }
}
