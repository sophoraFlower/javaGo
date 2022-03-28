package code015.todo01.learntoreadfile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadStringFromFileAppMain {
    private static final String SOURCE_FILE_NAME = "test001.txt";

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("." + File.separator + SOURCE_FILE_NAME);
        Scanner in = new Scanner(System.in);
        classicWay(sourceFile);
        coolerWay(sourceFile);
    }

    private static void classicWay(File sourceFile) {
        System.out.println("---------经典的处理方式-------------");
        try (
            // 建立从文件到程序的数据输入（input）流
            FileInputStream fis = new FileInputStream(sourceFile);
            // 用 InputStreamReader 将这个byte 流套一下，装饰一下，并指定字符编码，让它能够将读出的byte转为字符
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            // 增加缓存功能，输入输出效率更高，并且可以一次读取一行
            BufferedReader reader = new BufferedReader(isr);
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.trim().toUpperCase());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private static void coolerWay(File sourceFile) {
        System.out.println("---------666的处理方式-------------");
        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
        ) {
            reader.lines().map(String::trim).map(String::toUpperCase).forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
