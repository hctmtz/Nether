/*
 *  17/01/2018
 */
package com.banco.features;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Héctor
 */
public class FileChooser1 {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter filter = new FileNameExtensionFilter("My mp3 description", "mp3");

        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);
        //int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());

        }

    }

}
