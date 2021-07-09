package com.example.webdemo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/PurchaseServlet")
public class PurchaseServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        if(id == null){
            String url = "ListBookServlet";
            resp.sendRedirect(url);
            return;
        }
        Book book = BookDB.getBook(id);
        HttpSession session = req.getSession();
        List<Book> cart = (List) session.getAttribute("cart");
        if(cart == null){
            cart = new ArrayList<Book>();
            session.setAttribute("cart", cart);
        }
        cart.add(book);
        Cookie cookie = new Cookie("JSESSIONID", URLEncoder.encode(session.getId(), "utf-8"));
        cookie.setMaxAge(60*60);
        cookie.setPath("/");
        resp.addCookie(cookie);
        String url = "CartServlet";
        resp.sendRedirect(url);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}