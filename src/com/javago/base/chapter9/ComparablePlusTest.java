package com.javago.base.chapter9;

import java.util.Set;
import java.util.TreeSet;

public class ComparablePlusTest {

    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("jack",32));
        studentSet.add(new Student("tom",22));
        studentSet.add(new Student("mary",35));
        studentSet.add(new Student("tim",11));
        studentSet.add(new Student("tony",49));
        studentSet.add(new Student("dd",30));
        // 升序排序
        System.out.println(studentSet);
    }

    static class Student implements Comparable {
        private String name;
        private int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            if(o instanceof Student){
                Student student = (Student)o;
                return this.age - student.age;
            }
            //返回的数是0代表两个对象相同
            return 0;
        }
    }

}
