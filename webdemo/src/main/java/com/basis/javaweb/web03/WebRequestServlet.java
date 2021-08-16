package com.basis.javaweb.web03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/web-request-servlet")
public class WebRequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 重点记忆～～
        //客户端请求信息
        System.out.println("应⽤上下⽂路径 getContextPath= " + req.getContextPath());
        System.out.println("客户端发出请求时的完整URL getRequestURL= " + req.getRequestURL());
        System.out.println("请求⾏中的资源名部分 getRequestURI= " + req.getRequestURI());
        System.out.println("请求⾏中的参数部分 getQueryString= " + req.getQueryString());
        System.out.println("发出请求的客户机的IP地址 getRemoteAddr= " + req.getRemoteAddr());
        System.out.println("客户机发请求使⽤的⽹络端⼝号 getRemotePort= " + req.getRemotePort());
        //获取请求头
        System.out.println("获取请求头 getHeader(Accept)= " + req.getHeader("Accept"));
        //获取请求参数
        System.out.println("客户端请求参数 getParameter= " + req.getParameter("userName"));
        String[] sport = req.getParameterValues("sport");
        System.out.println("客户端请求参数列表,多个值 getParameterValues= " + sport.toString());
        Map<String,String[]> map = req.getParameterMap();
        System.out.println("客户端请求参数封装成的map类型 getParameterMap= " + map.toString());
    }
}
