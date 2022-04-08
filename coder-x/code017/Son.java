package code017;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Son extends Parent{

    static {
        System.out.println("Son 静态代码块");
    }

    Son() {
        System.out.println("Son 构造方法");
    }

    @Override
    public Number doSomething(int a, Integer b, Object c) throws SQLClientInfoException {
        if(a == 0) {
            throw new SQLClientInfoException();
        }
        // return new Integer(18);
        return 18;
    }

    public void overloadMethod(){
        System.out.println("无参");
    }

    public void overloadMethod(int param){
        System.out.println("int param");
    }

    public void overloadMethod(Integer param){
        System.out.println("Integer param");
    }

    public void overloadMethod(Object param){
        System.out.println("Object param");
    }

    public void overloadMethod(Integer... param){
        System.out.println("Integer... param");
    }


    public static void main(String[] args) {
        Son son1 = new Son();
        Son son2 = new Son();
        son1.overloadMethod(13, 13);  // Integer... param
        // 自动装箱 > 向上转型 > Object
        son1.overloadMethod(7.0);  // Object param
        // 向上转型
        son1.overloadMethod(7.0f);  // Float param
        son2.overloadMethod(new Float(7.0));  // Float param
        son1.overloadMethod(new Integer(7));  // Integer param
        son2.overloadMethod(7);  // int param

    }

}
