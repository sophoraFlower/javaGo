package com.javago.base.intelligenceRobot;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字符串：");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("886")) {
                System.out.println("拜拜～");
                break;
            } else {
                System.out.println("你输入的是：" + input);
            }
        }
        scanner.close();
    }
    
}
