package com.example.webdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="userLogin", urlPatterns = {"/user/login"})
public class UserLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String userName = req.getParameter("userName");
        String pwd = req.getParameter("pwd");
        if(userName.equals("root") && pwd.equals("123")){
            resp.getWriter().write("<div>登录成功</div>");
        }else {
            resp.getWriter().write("<div>账号密码错误</div>");
        }
    }
}
