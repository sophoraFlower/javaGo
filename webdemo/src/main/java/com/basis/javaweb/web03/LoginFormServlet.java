package com.basis.javaweb.web03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/javaweb-login-form-servlet")
public class LoginFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String userName = req.getParameter("userName");
        String pwd = req.getParameter("pwd");

        if(userName.equals("houle") && pwd.equals("123456")){
            resp.getWriter().write("登录成功～");
        } else {
            resp.getWriter().write("账号密码错误～");
        }
    }
}
