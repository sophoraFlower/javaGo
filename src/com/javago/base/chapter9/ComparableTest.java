package com.javago.base.chapter9;

import java.util.*;

public class ComparableTest {

    public static void main(String[] args) {
        // 获取最大元素
        List<Student> list = new ArrayList<>();
        list.add(new Student("jack", 18));
        list.add(new Student("tom", 20));
        list.add(new Student("tony", 33));
        list.add(new Student("jany", 49));
        list.add(new Student("hole", 28));

        System.out.println(list.toString());
        // 年龄最大的学生
        Student student = Collections.max(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.age - o2.age;
            }
        });
        System.out.println(student);  // Student{name='jany', age=49}

        // 年龄最小的学生
        Student studentMin = Collections.min(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.age - o2.age;
            }
        });
        System.out.println(studentMin);  // Student{name='jack', age=18}

        // 创建不可变集合
        List<String> list2 = new ArrayList<>();
        list2.add("SpringBoot课程");
        list2.add("架构课程");
        list2.add("微服务SpringCloud课程");
        //设置为只读List集合
        list2 = Collections.unmodifiableList(list2);
        System.out.println(list2);  // [SpringBoot课程, 架构课程, 微服务SpringCloud课程]
        Set<String> set = new HashSet<>();
        set.add("Mysql教程");
        set.add("Linux服务器器器器教程");
        set.add("Git教程");
        //设置为只读Set集合
        set = Collections.unmodifiableSet(set);
        System.out.println(set);  // [Git教程, Mysql教程, Linux服务器器器器教程]
        Map<String, String> map = new HashMap<>();
        map.put("key1", "课程1");
        map.put("key2", "课程2");
        //设置为只读Map集合
        map = Collections.unmodifiableMap(map);
        System.out.println(map);  // {key1=课程1, key2=课程2}
    }

    static class Student {
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
    }

}
