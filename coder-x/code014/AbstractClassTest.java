package code014;

public abstract class AbstractClassTest {

    private String abstract_para_01;
    public String abstract_para_02;

    public void abstract_method_01(){
        System.out.println("abstract public method~");
    }
    public abstract void abstract_method_02();

    protected void abstract_method_03(){
        System.out.println("abstract protected method~");
    };
    protected abstract void abstract_method_04();

    // private abstract 如此搭配，毫无意义
    // final abstract、 static abstract 同理
    private void abstract_method_05(){
        System.out.println("abstract private method~");
    };
    // private abstract void abstract_method_06();

}
