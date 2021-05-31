package com.javago.base.chapter7;

public class ExceptionTest4 {

    public static void main(String[] args) {
        try {
            int result = divide(25, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("main 异常～");  // main 异常～
        }
    }

    public static int divide (int num1, int num2) throws Exception {
        try {
            int result = num1 / num2;
            return result;
        } catch (Exception e) {
            System.out.println("出异常了");  // 出异常了
            throw new Exception("参数异常");  // 不输出
        }
    }
}
