package code012.todo06.exception;

import code012.todo06.exception.myexceptions.MyException;

public class Caller1 {
    Caller2 caller2 = new Caller2();

    // 以在调用链的任何一个地方，通过catch语句来捕获异常，阻止异常的传递
    public void call2RTException() {
        System.out.println("Caller1.call2RTException开始");
        caller2.call3RTException();
        System.out.println("Caller1.call2RTException结束");
    }

    public void call2Exception() throws ClassNotFoundException, MyException {
        System.out.println("Caller1.call2Exception开始");
        caller2.call3Exception();
        System.out.println("Caller1.call2Exception结束");
    }

}
