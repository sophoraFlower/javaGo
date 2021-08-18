package com.basis.javaweb.web03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@WebServlet("/javaweb-response-servlet")
public class WebResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-Type", "text/html;charset=utf-8");
        resp.addHeader("header_name1", "header_value1");
        resp.addHeader("header_name2", "header_value2");
        resp.setHeader("header_name3", "header_value3");
        // resp.setStatus(250);
        String data = "灰灰爱喵喵～";
        OutputStream outputStream = resp.getOutputStream();
        byte [] dataByteArr = data.getBytes(StandardCharsets.UTF_8);
        outputStream.write(dataByteArr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
