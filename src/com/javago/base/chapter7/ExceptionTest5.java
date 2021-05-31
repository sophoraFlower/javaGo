package com.javago.base.chapter7;

public class ExceptionTest5 {

    public static void main(String[] args) {
        try {
            test();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (BaseException e) {
            System.out.println(e.getErrCode() +  " " +e.getErrMessage());
        }
    }

    public static void test() throws BaseException{
        throw new BaseException("404", "客户端请求参数异常");
    }

}
