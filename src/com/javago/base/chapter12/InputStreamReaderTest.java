package com.javago.base.chapter12;

import java.io.*;

public class InputStreamReaderTest {

    public static void main(String[] args) throws IOException {
        test1("/Users/houle/Desktop/test/test.txt");
    }

    public static void test1(String path) throws IOException {
        // 读取字节流
        InputStream in = new FileInputStream(path);
        // 字节流 > 字符流，默认UTF-8格式
        InputStreamReader isr = new InputStreamReader(in);
        // 缓冲字节流
        BufferedReader reader = new BufferedReader(isr);

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        isr.close();
        reader.close();
    }

}
