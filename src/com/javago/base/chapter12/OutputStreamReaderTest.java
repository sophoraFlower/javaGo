package com.javago.base.chapter12;

import java.io.*;

public class OutputStreamReaderTest {

    public static void main(String[] args) throws IOException {
        test("/Users/houle/Desktop/test/test.txt");
    }

    public static void test(String path) throws IOException {
        OutputStream out = new FileOutputStream(path);
        // 默认字节编码：GBK
        OutputStreamWriter osr = new OutputStreamWriter(out);
        BufferedWriter bufw = new BufferedWriter(osr);

        String str = "新增内容";
        bufw.write(str);
        bufw.newLine();
        bufw.write(str);
        bufw.flush();
        bufw.close();
    }

}
