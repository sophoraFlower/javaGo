package code013.todo04;

public @interface MyFirstAnnotation {

    // element name.
    public String name();

    // Element description, default value "".
    public String description() default "my first annotation~";

}
