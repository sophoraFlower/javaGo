package code016;

public class InterfaceImplementClass implements InterfaceDemo{
    @Override
    public void default_method() {
        InterfaceDemo.super.default_method();
        System.out.println("default method ~~");
    }

    @Override
    public void abstract_method() {
        System.out.println("abstract_method()");
    }

    public static void main(String[] args) {
        InterfaceImplementClass interfaceImplementClass = new InterfaceImplementClass();
        System.out.println(InterfaceImplementClass.default_attribute);
        System.out.println(InterfaceImplementClass.public_attribute);
        interfaceImplementClass.default_method();
        interfaceImplementClass.abstract_method();

        InterfaceDemo.static_method();
    }
}
