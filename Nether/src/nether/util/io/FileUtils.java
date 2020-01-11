/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: FileUtils.java
 *  Date: 01/11/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Utility class to copy files and directories.
 *
 * https://www.javadevjournal.com/java/java-copy-file-directory/
 *
 * @author Héctor
 */
public final class FileUtils {

    /**
     * Left here for testing purposes only. Main method should not be left in
     * the final release.
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    private FileUtils() {

    }

    /**
     * Copies a directory.
     *
     * @param source Directory source path to copy.
     * @param target Directory target path to copy.
     * @return true if it operation is successful otherwise, false.
     */
    public static boolean copyDirectory(String source, String target) {
        Path sourceDirectory = Paths.get(source);
        Path targetDirectory = Paths.get(target);

        boolean success = false;

        try {
            Files.copy(sourceDirectory, targetDirectory);
            success = true;
        } catch (IOException e) {
            success = false;
        }

        return success;
    }

    /**
     * Copies a file.
     *
     * @param source File source path to copy.
     * @param target File target path to copy.
     * @return true if it operation is successful otherwise, false.
     */
    public static boolean copyFile(String source, String target) {
        Path sourceDirectory = Paths.get(source);
        Path targetDirectory = Paths.get(target);

        boolean success = false;

        try {
            Files.copy(sourceDirectory, targetDirectory);
            success = true;
        } catch (IOException e) {
            success = false;
        }

        return success;
    }

}
