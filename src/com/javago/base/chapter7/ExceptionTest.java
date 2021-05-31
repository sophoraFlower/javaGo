package com.javago.base.chapter7;

public class ExceptionTest {

    public static void main(String[] args) {
        try{
            int result = 25 / 0;
            System.out.println(result);
        } catch (Exception e){
            String msg = e.getMessage();  // / by zero
            System.out.println(msg);
            StackTraceElement [] arr = e.getStackTrace();
            for(StackTraceElement stackTranceElement : arr){
                System.out.println(stackTranceElement);
            }
            e.printStackTrace();
        }
    }

}
