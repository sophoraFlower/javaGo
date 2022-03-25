package code012.todo08.exception;

import java.io.IOException;

public class CatchMultiException {

    public static void main(String[] args) {
        try {
            catchMultiOld();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            catchMultiNew();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            catchMultiTypeMultiMatch();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void catchMultiOld() {
        try {
            throwMultiException(1);
            // 如果一个方法抛出多种异常，可以针对多个类型有多种catch语语句
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void catchMultiTypeMultiMatch() {
        try {
            throwMultiException(3);
            // catch的类型不能有多种匹配可能，否则会出错
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("catchMultiTypeMultiMatch finally~");
        }
    }

    private static void catchMultiNew() {
        try {
            throwMultiException(2);
            // 如果捕获了不同类型的异常，但是处理方式一样，可以用简化模式
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void throwMultiException(int i) throws ClassNotFoundException, IOException {

        switch (i) {
            case 1:
                throw new NullPointerException("demo 1");
            case 2:
                throw new ClassNotFoundException("demo 2");
            case 3:
                throw new IOException("demo 3");
        }

    }

}
