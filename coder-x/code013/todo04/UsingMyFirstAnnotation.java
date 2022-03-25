package code013.todo04;


@MyFirstAnnotation(name = "Some name", description = "Some description")
public class UsingMyFirstAnnotation {

    // Annotation on Constructor.
    @MyFirstAnnotation(name = "John", description = "@")
    public UsingMyFirstAnnotation() {

    }

    @MyFirstAnnotation(name = "Tom")
    public void someMethod() {

    }

    // An Annotation on parameter of method.
    public void todo(@MyFirstAnnotation(name = "none") String job) {

        // An annotation on local variable.
        @MyFirstAnnotation(name = "Some name")
        int localVariable = 0;

    }

    public static void main(String[] args) {

        UsingMyFirstAnnotation usingMyFirstAnnotation = new UsingMyFirstAnnotation();
        usingMyFirstAnnotation.someMethod();
    }

}
