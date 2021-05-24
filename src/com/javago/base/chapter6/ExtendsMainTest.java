package com.javago.base.chapter6;

public class ExtendsMainTest {

    public static void main(String[] args) {
        Animals animal = new Animals();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.sleep();  // sleeping!
        cat.sleep();  // a cat is sleeping!
        dog.sleep();  // a dog is sleeping!

        cat.eat();  // cat eating mouse!
        dog.eat();  // dog eating bone!

        cat.property = "Cat";
        dog.property = "Dog";

        System.out.println(animal.property);  // null
        System.out.println(cat.property);  // Cat
        System.out.println(dog.property);  // Dog

        animal.run();  // animal run~
        cat.run();  // animal run~
        dog.run();  // animal run~
    }
}
