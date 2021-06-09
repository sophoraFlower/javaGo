package com.javago.base.chapter11;

import java.io.*;

public class ImagesCopy {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/houle/Desktop/图片精选/");
        File [] files = file.listFiles();
        for (File filePer : files) {
            String filename = filePer.getName();
            copy(filePer.getAbsolutePath(), "/Users/houle/Desktop/test/" + filename);
        }
    }


    // "/Users/houle/Desktop/图片精选/"
    public static void copy(String from, String to) throws IOException {

        try {
            File targetDir = new File(new File(to).getParent());
            if(!targetDir.exists()){
                targetDir.mkdirs();
            }

            FileInputStream fileInputStream = new FileInputStream(from);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(to);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int size;
            byte [] buffer = new byte[1024];
            while ((size = bufferedInputStream.read(buffer)) != -1) {
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
