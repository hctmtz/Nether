/*
 *  Copyright (C) 2017-2020
 *  This file is part of Nether.
 * 
 *  Unauthorized copying of this file, via any medium is strictly prohibited.
 *  This piece of code is proprietary and confidential. Nether can not be
 *  copied and/or distributed without the express permission of Héctor Martínez.
 * 
 *  Project: Nether
 *  File: package-info.java
 *  Date: 02/11/2018 10:00:00
 *  Author: Héctor Martínez <hector.mtz.grc@gmail.com>
 */
package nether.util.io;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Héctor
 */
public final class FileUtilsApache {

    private FileUtilsApache() {

    }

    public static boolean copyDirectory(String source, String target) {

        boolean success;

        File sourceLocation = new File(source);
        File targetLocation = new File(target);

        try {
            FileUtils.copyDirectory(sourceLocation, targetLocation);
            success = true;
        } catch (IOException e) {
            success = false;
        }

        return success;
    }

    public static void main(String[] args) throws IOException {

    }
}
