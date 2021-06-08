package com.javago.base.chapter11;

import java.io.*;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        String dir = "/Users/houle/IdeaProjects/javaGo/src/com/javago/base/chapter11";
        String name = "test.txt";
        String target = "target.txt";
        File file = new File(dir, name);
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(dir + File.separator + target);

        // testOut(inputStream, outputStream);
        testOutBuffer(inputStream, outputStream);
    }

    // 单个字节读取，中文可能会有问题
    public static void testOut(InputStream inputStream, OutputStream outputStream) throws IOException{
        int value = 0;
        while (value != -1) {
            value = inputStream.read();
            outputStream.write(value);
        }
        inputStream.close();
        outputStream.close();
    }

    // 多字节读取
    public static void testOutBuffer(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte [] buffer = new byte[64];
        int length;
        while ((length = inputStream.read(buffer)) != -1){
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

}
