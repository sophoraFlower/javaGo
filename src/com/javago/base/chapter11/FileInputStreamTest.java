package com.javago.base.chapter11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {

        String dir = "/Users/houle/IdeaProjects/javaGo/src/com/javago/base/chapter11";
        String name = "test.txt";
        File file = new File(dir, name);
        InputStream inputStream = new FileInputStream(file);

        // testRead(inputStream);
        // skipTest(inputStream);
        testReadByteArr(inputStream);
    }

    public static void testRead(InputStream inputStream) throws IOException{
        // 对于汉字等unicode中的字符不能正常读取，只能以乱码的形式显示
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
    }

    public static void skipTest(InputStream inputStream) throws IOException {
        long skipSize = inputStream.skip(2);
        System.out.println(skipSize);
        int read = inputStream.read();
        System.out.println(read);
        System.out.println((char)read);
    }

    public static void testReadByteArr(InputStream inputStream) throws IOException {
        // 如果buffer的长度为0，则不读取任何字节并返回0；每次读取的字节数最多等于buffer的长度
        byte[] buffer = new byte[64];
        int length;
        while ((length=inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer, 0 , length));
        }
    }
}
