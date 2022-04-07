package code016;

public abstract class AbstractClassDemo {

    private final String private_attribute = "private_attribute";
    protected String protected_attribute = "protected_attribute";
    public String public_attribute = "public_attribute";
    String default_attribute = "default_attribute";

    private void private_method(){
        System.out.println("private_method");
    }

    protected void protected_method(){
        System.out.println("protected_method");
    }

    public void public_method(){
        System.out.println("public_method");
    }

    void default_method(){
        System.out.println("default_method");
    }

    public abstract void abstract_method();
}
