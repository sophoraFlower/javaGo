package InheritanceAndPolymorphism;

public class FatherAndSonTest {
    public static void main(String[] args) {
        Father father = new Father("father_name", "father_phone");
        Son son = new Son("son_name", "son_phone");
        Son son1 = new Son("son_name", "son_phone", "son_name_", 18);

        System.out.println(father.getName() + " " + father.getPhone());  // father_name father_phone
        System.out.println(son.getName() + " " + son.getPhone());  // null son_phone
        System.out.println(son1.getName() + " " + son1.getPhone());  // son_name_ son_phone

        son.setName("son_self_name");
        son.setAge(18);
        System.out.println(son.getName() + " " + son.getPhone());  // son_self_name son_phone
        // son_self_name son_phone 18
        System.out.println(son.getName() + " " + son.getPhone() + " " + son.getAge());

        // 向上造型
        // Son son2 = father;  错误
        // Casting 'father' to 'Son' will produce 'ClassCastException' for any non-null value
        Son son2 = (Son) father;  // 可编译，相当于将father看成Son型来使用
        System.out.println(son2.getName() + " " + son2.getPhone());  // 运行报错
    }
}
