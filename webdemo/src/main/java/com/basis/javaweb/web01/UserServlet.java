package com.basis.javaweb.web01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/javaweb-servlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向浏览器输出内容
        resp.setContentType("text/html;charset=utf-8");
        // PrintWriter是基于Writer的输出，字符流，以char为单位
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> 勿忘历史，振兴中华～ </div>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<div> 请求方式为 post </div>");
        printWriter.write("<div> 勿忘历史，振兴中华～ </div>");
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");
    }

}
