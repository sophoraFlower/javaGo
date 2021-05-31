package com.javago.base.chapter7;

public class ExceptionTest3 {

    public static void main(String[] args) {
        int result1 = divide(25, 5);
        System.out.println("最终结果：" + result1);
        int result2 = divide(25, 0);
        System.out.println("最终结果：" + result2);
    }

    public static int divide(int num1, int num2){
        try {
            int result = num1 / num2;
            return result;
        } catch (Exception e) {
            System.out.println("出异常了");
        } finally {
            System.out.println("finally执行了");
        }
        return -1;
    }

}
