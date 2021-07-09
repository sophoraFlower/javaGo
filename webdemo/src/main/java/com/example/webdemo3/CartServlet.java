package com.example.webdemo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CartServlet")
public class CartServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        List<Book> cart = null;
        boolean purFlag = true;
        HttpSession session = req.getSession(false);
        if (session == null) {
            purFlag = false;
        } else {
            cart = (List) session.getAttribute("cart");
            if (cart == null) {
                purFlag = false;
            }
        }
        if (!purFlag) {
            out.write("对不起，你暂未购买任何商品～");
        } else {
            out.write("你购买的图书有：<br />");
            double price = 0;
            for (Book book : cart) {
                out.write(book.getName() + "<br />");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}