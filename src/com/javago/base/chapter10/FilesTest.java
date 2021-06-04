package com.javago.base.chapter10;

import java.io.File;
import java.io.IOException;

public class FilesTest {

    public static void main(String[] args) {
        String dir = "/Users/houle/IdeaProjects/javaGo";
        String name = "info.txt";

        File file = new File(dir, name);
        System.out.println(file.getPath());  // /Users/houle/IdeaProjects/javaGo/info.txt

        // 文件的查询和判断
        System.out.println(File.separator);
        System.out.println("基本路径 getPath()= " + file.getPath());
        System.out.println("文件名 getName()= " + file.getName());
        System.out.println("绝对路径 getAbsolutePath = " + file.getAbsolutePath());
        System.out.println("父路径名 getParent() = " + file.getParent());
        System.out.println("是否是绝对路径 isAbsolute() = " + file.isAbsolute());
        System.out.println("是否是一个目录 isDirectory() = " + file.isDirectory());
        System.out.println("是否是一个文件 isFile() = " + file.isFile());
        System.out.println("文件或目录是否存在 exists() = " + file.exists());
        System.out.println("目录中的文件和目录的名称所组成字符串数组 list() ");
        String[] arr = file.list();
        for (String temp : arr) {
            System.out.println(temp);
        }

        // 创建指定的目录
        File mkdirFile = new File(dir + "/testdir");
        mkdirFile.mkdir();

        //创建多个层级的目录
        File mkdirsFile = new File(dir + "/testdirs/test/dd");
        mkdirsFile.mkdirs();
        // 创建一个新的文件
        File newFile = new File(dir + "/testdir/newfile1.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 删除文件
        newFile.delete();
    }

}
