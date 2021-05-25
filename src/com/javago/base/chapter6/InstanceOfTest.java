package com.javago.base.chapter6;

public class InstanceOfTest {
    public static void main(String[] args) {

        Student student = new Student();
        boolean result = student instanceof Person;
        System.out.println(result);

        Person person1 = new Student();
        Person person2 = new Teacher();

        // 强制类型转换
        if(person1 instanceof Student){
            Student student1 = (Student) person1;
            student1.talk();  // student talking~
        }

        if(person2 instanceof Teacher){
            Teacher teacher1 = (Teacher) person2;
            teacher1.talk();  // teacher talking~
        }

    }
}
