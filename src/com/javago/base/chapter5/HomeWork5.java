package com.javago.base.chapter5;

public class HomeWork5 {

    public static void seasons(int number){
        switch (number){
            case 1:
                System.out.println("春");
                break;
            case 2:
                System.out.println("夏");
                break;
            case 3:
                System.out.println("秋");
                break;
            case 4:
                System.out.println("冬");
                break;
            default:
                System.out.println("哦吼～");
        }
    }

    public static void main(String[] args) {
        // 100个学生的分类和创建，面向对象编程思想
        NewStudent[] group1 = new NewStudent[60];
        int group1Index = 0;
        NewStudent[] group2 = new NewStudent[40];
        int group2Index = 0;
        for(int i=0; i<100; i++){
            int num = i+1;
            NewStudent students = new NewStudent();
            students.setId(num);
            if(num>60){
                group2[group2Index] = students;
                group2Index ++;
            } else {
                group1[group1Index] = students;
                group1Index ++;
            }
        }

        for(NewStudent s : group1){
            System.out.println(s.getId());
        }

        System.out.println("=================");

        for(NewStudent s : group2){
            System.out.println(s.getId());
        }

        seasons(2);

        Dog [] dogs = new Dog[5];
        for (int i=0; i<dogs.length; i++){
            Dog dog = new Dog();
            dog.setName("dog" + i);
            dogs[i] = dog;
        }
        System.out.println(Dog.getAge());  // 10
        Dog dog3 = dogs[2];
        dog3.changeAge();
        dog3.changeAge();
        for(Dog d : dogs){
            System.out.println(d.getName());
            System.out.println(d.getAge());  // 30
            System.out.println(Dog.getAge());  // 30
        }
    }
}