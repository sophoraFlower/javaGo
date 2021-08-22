package com.basis.javaweb.web05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/javaweb-session")
public class WebSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        if(name.equals("xdclass") && pwd.equals("123")){
            User user = new User();
            user.setId(121);
            user.setName(name);
            user.setHost("xdclass.net");
            req.getSession().setAttribute("loginUser",user);
            req.getRequestDispatcher("/basis/base05-user.jsp").forward(req,resp);
        }else{
            req.setAttribute("msg","账号密码错误");
            req.getRequestDispatcher("/basis/base06-login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
