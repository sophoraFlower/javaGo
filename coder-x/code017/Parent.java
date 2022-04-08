package code017;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class Parent {

    static {
        System.out.println("Parent 静态代码块");
    }

    public Parent() {
        System.out.println("Parent 构造方法");
    }

    protected Number doSomething(int a, Integer b, Object c) throws SQLException {
        System.out.println("Father's doSomething~");
        return new Integer(8);
    }

    public void overloadMethod(Float param){
        System.out.println("Float param");
    }

}
