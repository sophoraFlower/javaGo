package com.example.webdemo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "downManagerServlet", value = "/download")
public class DownManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter print = resp.getWriter();
        // 获得referer头的值
        String referer = req.getHeader("referer");
        // 获取访问地址
        String sitePart = "https://" + req.getServerName();
        // 判断referer头是否为空，这个头的首地址是否以sitePart开始的
        if(referer != null && referer.startsWith(sitePart)){
            print.println("dealing downing ...");
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("/webdemo/download.jsp");
            rd.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
