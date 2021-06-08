package com.javago.base.chapter11;

import java.io.*;

public class InputStreamTest {

    public static void main(String[] args) throws IOException {

        String dir = "/Users/houle/IdeaProjects/javaGo/src/com/javago/base/chapter11";
        String name = "test.txt";
        File file = new File(dir, name);
        InputStream inputStream = new FileInputStream(file);
        testRead(inputStream);
    }

    public static void testRead(InputStream inputStream) throws IOException{
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
    }

}
