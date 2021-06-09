package com.javago.base.chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

    public static void main(String[] args) throws IOException {
        String dir = "/Users/houle/Desktop/test/test.txt";
        File file = new File(dir);
        Reader input = new FileReader(file);

        int ch;
        while ((ch = input.read()) != -1) {
            System.out.println((char)ch);
        }
        input.close();
    }

}
