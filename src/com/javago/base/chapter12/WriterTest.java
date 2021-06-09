package com.javago.base.chapter12;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

    public static void main(String[] args) throws IOException {
        String dir = "/Users/houle/Desktop/test/test.txt";
        FileWriter writer = new FileWriter(dir, true);
        writer.write(1234);
        writer.write("I am chinese~");
        writer.write('a');
        writer.flush();
        writer.close();
    }

}
