/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: ThemesEnum.java
 *  Date: 29/12/2017 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.ui.settings;

/**
 * This class contains an enum of the look and feel themes used in the
 * application. It is intended to be used with the interface settings UI to show
 * the available look and feel themes.
 *
 * @author Héctor
 */
public enum ThemesEnum {

    AUTUMN("Autumn"),
    BUSSINES("Bussines"),
    BUSSINES_BLACKSTEEL("Bussines BlackSteel"),
    BUSSINES_BLUESTEEL("Bussines BlueSteel"),
    CERULEAN("Cerulean"),
    CREME("Creme"),
    CREME_COFFEE("Creme Coffee"),
    DUST("Dust"),
    DUST_COFFEE("Dust Coffee"),
    GEMINI("Gemini"),
    GRAPHITE("Graphite"),
    GRAPHITE_AQUA("Graphite Aqua"),
    GRAPHITE_GOLD("Graphite Gold"),
    MAGELLAN("Magellan"),
    MARINER("Mariner"),
    MIST_AQUA("Mist Aqua"),
    MIST_SILVER("Mist Silver"),
    MODERATE("Moderate"),
    NEBULA("Nebula"),
    RAVEN("Raven"),
    OFFICE_2007_BLACK("Office 2007 Black"),
    OFFICE_2007_BLUE("Office 2007 Blue"),
    OFFICE_2007_SILVER("Office 2007 Silver"),
    SAHARA("Sahara"),
    TWILIGHT("Twilight"),
    METAL("Metal"),
    SYSTEM("System");

    /**
     * This field is required to have the {@code toString()} method within the
     * enum.
     */
    private final String themeString;

    /**
     * Class constructor required to have enum items with String values. This
     * constructor is mandatory in order to have the mentioned values above.
     *
     * @param enumValue Enum item string value.
     */
    ThemesEnum(String enumValue) {
        this.themeString = enumValue;
    }

    /**
     * Gets the string (user friendly) value of the enum field.
     *
     * @return String of enum item value.
     */
    @Override
    public String toString() {
        return themeString;
    }

    /**
     * Gets the string values of this enum and sets them to a string array.
     *
     * @return String array of user friendly look and feel themes.
     */
    public static String[] toArray() {

        String[] themesArray;

        themesArray = new String[ThemesEnum.values().length];

        for (ThemesEnum value : ThemesEnum.values()) {
            themesArray[value.ordinal()] = value.toString();
        }

        return themesArray;
    }

    /**
     * This main method was left here for testing.
     *
     * @param args
     */
//    public static void main(String[] args) {
//        for (String str : ThemesEnum.toArray()) {
//            System.out.println(str);
//        }
//        System.out.println(ThemesEnum.CREME_COFFEE.toString());
//    }
}
