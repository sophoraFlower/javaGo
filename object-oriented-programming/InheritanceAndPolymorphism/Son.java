package InheritanceAndPolymorphism;

public class Son extends Father{
    public Son(String name, String phone) {
        super(name, phone);
    }

    public Son(String name, String phone, String name1, int age){
        super(name, phone);
        this.name = name1;
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
