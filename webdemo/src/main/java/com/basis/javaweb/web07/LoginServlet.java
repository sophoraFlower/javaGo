package com.basis.javaweb.web07;

import com.basis.javaweb.web05.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/javaweb-login-servlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");

        if(name.equals("hole") && pwd.equals("123456")){
            User user = new User();
            user.setId(121);
            user.setName(name);
            user.setHost("xdclass.net");
            req.getSession().setAttribute("loginUser",user);
            req.getRequestDispatcher("/basis/base07-user.jsp").forward(req,resp);
        } else {
            req.setAttribute("msg","账号密码错误");
            req.getRequestDispatcher("/basis/base08-login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
