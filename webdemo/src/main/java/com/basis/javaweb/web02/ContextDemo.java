package com.basis.javaweb.web02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context-demo")
public class ContextDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("ServletContext 生命周期");

        ServletContext servletContext = req.getServletContext();
        printWriter.write("ServletContext.getContextPath() = " + servletContext.getContextPath());
        System.out.println(servletContext.getContextPath());

        servletContext.setAttribute("appInfo", "basis.javaweb");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
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
