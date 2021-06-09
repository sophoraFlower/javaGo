package com.javago.base.chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/houle/Desktop/test/test.txt"));
        char ch = 'A';
        // 写入一个字符
        writer.write(ch);
        String other = "我是中国人～";
        // 写入一个字符数组
        writer.write(other.toCharArray(), 0, other.length());
        // 写入换行符
        writer.newLine();
        String newLine = "学习java架构课程";
        // 写入一个字符串。
        writer.write(newLine);
        writer.flush();
        writer.close();
    }

}
