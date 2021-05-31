package com.javago.base.chapter7;

public class ExceptionTest2 {

    public static void main(String[] args) {

//        try {
//            int result = 30 / 0;
//            System.out.println("程序正常执行");  // 未执行
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("进入Exception块 开始");
//            e.printStackTrace();
//            System.out.println("进入Exception块 结束");
//        }
          test();
    }

    public static void test() {
        try {
            Student student = new Student();
            student.setAge(-1);
        } catch (Exception e) {
            System.out.println("出现异常");
            // e.printStackTrace();
        }
    }

}
