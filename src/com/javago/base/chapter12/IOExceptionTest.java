package com.javago.base.chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExceptionTest {

    public static void main(String[] args) {
        try (
                // 关闭顺序，由下到上
                FileInputStream fis = new FileInputStream("/Users/houle/Desktop/test/test.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("/Users/houle/Desktop/test/copy_test.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int size;
            byte[] buf = new byte[1024];
            while ((size = bis.read(buf)) != -1) {
                bos.write(buf, 0, size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
