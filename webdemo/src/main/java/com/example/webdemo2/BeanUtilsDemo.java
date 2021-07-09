package com.example.webdemo2;

import org.apache.commons.beanutils.BeanUtils;
import java.util.HashMap;
import java.util.Map;

public class BeanUtilsDemo {

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        BeanUtils.setProperty(p, "name", "Jack");
        BeanUtils.setProperty(p, "age", 19);
        String name = BeanUtils.getProperty(p,"name");
        String age = BeanUtils.getProperty(p,"age");
        System.out.println("我的名字是 " + name + "，我今年" + age + "岁啦～");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "张三");
        map.put("age", 18);
        BeanUtils.populate(p, map);
        System.out.println("姓名：" + p.getName() + "，年龄：" + p.getAge());
    }

}
