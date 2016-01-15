package com.manolovn.cssdroid.util;

import java.io.File;

/**
 * File utils
 */
public class FileUtils {

    private FileUtils() {

    }

    public static String removeExtension(File file) {
        return file.getName().substring(0, file.getName().lastIndexOf('.'));
    }
}
