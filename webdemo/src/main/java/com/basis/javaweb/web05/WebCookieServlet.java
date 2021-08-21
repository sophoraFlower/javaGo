package com.basis.javaweb.web05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/javaweb-cookie")
public class WebCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取cookie
        // Cookie [] cookies = req.getCookies();
        // for(Cookie cookie: cookies){
        //     cookie.getDomain();
        // }

        // 生成cookie
        Cookie cookie = new Cookie("token", "adsfsdvdsvdfsvsadfvadf");
        cookie.setMaxAge(20);

        resp.addCookie(cookie);
        req.getRequestDispatcher("/basis/base03.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
