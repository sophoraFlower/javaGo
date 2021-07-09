package com.example.webdemo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name="lastAccessServlet", value="/last-access")
public class LastAccessServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Content-Type", "text/html;charset=utf-8");
        String lastAccessTime = null;
        Cookie[] cookies = req.getCookies();
        for(int i=0; cookies!=null && i<cookies.length; i++){
            if("lastAccess".equals(cookies[i].getName())) {
                lastAccessTime = cookies[i].getValue();
                break;
            }
        }
        if(lastAccessTime == null) {
            resp.getWriter().println("首次访问～ <br />");
            Cookie[] newCookies = req.getCookies();
            for(int j=0; newCookies!=null && j<cookies.length; j++){
                resp.getWriter().println("cookie：" + newCookies[j].getName() + ": " + newCookies[j].getValue() + "<br />");
            }
            String currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
            Cookie cookie = new Cookie("lastAccess", URLEncoder.encode(currentTime,"utf-8"));
            // cookie.setMaxAge(60*60);
            resp.addCookie(cookie);
        } else {
            resp.getWriter().println("上次访问的时间是： " + URLDecoder.decode(lastAccessTime, "utf-8"));
            Cookie[] newCookies = req.getCookies();
            for(int j=0; newCookies!=null && j<cookies.length; j++){
                resp.getWriter().println("cookie：" + newCookies[j].getName() + ": " + URLDecoder.decode(newCookies[j].getValue(), "utf-8") + "<br />");
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
