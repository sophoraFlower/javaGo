package com.basis.javaweb.web04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/javaweb-el")
public class WebELServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setName("houle");
        user.setHost("https://www.basis.javaweb.com");
        user.setId(1);
        req.setAttribute("user", user);
        req.setAttribute("name", "hahaha, houle~");
        req.getRequestDispatcher("/basis/base04.jsp").forward(req, resp);
    }
}