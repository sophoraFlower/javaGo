package com.javago.base.chapter11;

import java.io.*;

public class FilesCopy {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/houle/Desktop/test/test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("/Users/houle/Desktop/test/test_copy.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int size;
            byte [] buffer = new byte[1024];

            while((size = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer, 0, size);
            }

            bufferedOutputStream.flush();

            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
