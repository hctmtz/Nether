/*
 *  02/11/2018
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

        boolean success = false;

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
