package com.javago.base.chapter9;

import java.util.Objects;

public class EqualsOverrideTest {

    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Houle";
        user1.age = 28;

        User user2 = new User();
        user1.name = "Houle";
        user1.age = 28;

        User user3 = user1;

        System.out.println(user1.equals(user2));  // false
        System.out.println(user1.equals(user3));  // true
    }

    static class User {
        private String name;
        private int age;

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public boolean equals(Object obj) {
            // 判断地址是否一致
            if (this == obj) return true;
            // 非空判断和class类型判断
            if (obj == null || getClass() != obj.getClass()) return false;
            // 强制转换
            User user = (User) obj;
            // 对象里边的字段一一匹配
            return age == user.age && name.equals(user.name);
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
    }

}
