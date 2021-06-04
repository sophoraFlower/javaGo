package com.javago.base.chapter10;

import java.io.File;
import java.io.IOException;

public class PracticeWork {

    public static void main(String[] args) throws IOException {

        String path = "/Users/houle/Desktop";
        createDirectoryAndFile(path);
    }

    private static void createDirectoryAndFile(String path) throws IOException {
        File mkdirFile = new File(path + "/test");
        if (!mkdirFile.exists()) {
            mkdirFile.mkdir();
        }


        for(int i=1; i<=10; i++){
            File mkdirFiles = new File(path + "/test/" + i);
            if (!mkdirFiles.exists()) {
                mkdirFiles.mkdir();
                File newFile = new File(path + "/test/" + i + "/" + i + ".txt");
                if (!newFile.exists()) {
                    newFile.createNewFile();
                }
            }
        }
    }
}
