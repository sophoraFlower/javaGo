package com.example.webdemo4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("check_code");
        String savedCode = (String) req.getSession().getAttribute("check_code");

        PrintWriter pw = resp.getWriter();
        if (("root").equals(username) && ("123456").equals(password) && checkCode.equals(savedCode)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("/webdemo/IndexServlet");
        } else if (checkCode.equals(savedCode)) {
            pw.write("用户名或者密码错误，登陆失败～");
        } else {
            pw.write("验证码错误");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
