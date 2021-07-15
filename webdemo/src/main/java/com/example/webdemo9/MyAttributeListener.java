package com.example.webdemo9;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyAttributeListener implements ServletContextAttributeListener, ServletRequestAttributeListener, HttpSessionAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        String name = event.getName();
        System.out.println("ServletContext 添加属性：" + name + "=" + event.getServletContext().getAttribute("name"));
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        String name = event.getName();
        System.out.println("ServletContext 删除属性：" + name);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        String name = event.getName();
        System.out.println("ServletContext 替换属性：" + name + "=" + event.getServletContext().getAttribute(name));
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("ServletRequest 添加属性：" + name + "=" + srae.getServletContext().getAttribute(name));
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("ServletRequest 删除属性：" + name);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("ServletRequest 添加属性：" + name + "=" + srae.getServletContext().getAttribute(name));

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        String name = event.getName();
        System.out.println("HttpSession 添加属性：" + name + "=" + event.getSession().getAttribute(name));

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        String name = event.getName();
        System.out.println("HttpSession 删除属性：" + name);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        String name = event.getName();
        System.out.println("HttpSession 替换属性：" + name + "=" + event.getSession().getAttribute(name));

    }
}
