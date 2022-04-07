package code016;

public interface InterfaceDemo {

    // private final String private_attribute = "private_attribute";
    // protected String protected_attribute = "protected_attribute";
    // unnecessary public，均默认 public static final
    public String public_attribute = "public_attribute";  // public static final
    String default_attribute = "default_attribute";  // public static final

    // private void private_method(){
    //     System.out.println("private_method");
    // }

    // protected void protected_method(){
    //     System.out.println("protected_method");
    // }

    // public void public_method(){
    //     System.out.println("public_method");
    // }

    // void default_method(){
    //     System.out.println("default_method");
    // }

    default void default_method(){
        System.out.println("default_method");
    }

    static void static_method(){
        System.out.println("static_method");
    }

    public abstract void abstract_method();

}
