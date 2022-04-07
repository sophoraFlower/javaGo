package code016;

public class ExtendAbstractClass extends AbstractClassDemo{

    @Override
    public void abstract_method() {
        System.out.println("extend abstract method implementation~");
    }

    public static void main(String[] args) {
        ExtendAbstractClass extendAbstractClass = new ExtendAbstractClass();
        System.out.println(extendAbstractClass.default_attribute);
        System.out.println(extendAbstractClass.protected_attribute);
        System.out.println(extendAbstractClass.public_attribute);

        extendAbstractClass.default_method();
        extendAbstractClass.protected_method();
        extendAbstractClass.public_method();
        extendAbstractClass.abstract_method();
    }

}
