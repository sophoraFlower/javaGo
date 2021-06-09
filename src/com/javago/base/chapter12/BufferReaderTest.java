package com.javago.base.chapter12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/houle/Desktop/test/test.txt"));
        if(!reader.ready()){
            System.out.println("文件流暂时无法读取");
            return;
        }
        int size;
        char [] cbuf = new char[1024];
        while ((size = reader.read(cbuf, 0, cbuf.length)) != -1) {
            System.out.println(new String(cbuf, 0, size));
        }
        reader.close();
    }
}
