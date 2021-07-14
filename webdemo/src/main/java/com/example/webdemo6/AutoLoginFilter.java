package com.example.webdemo6;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AutoLoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        Cookie[] cookies = req.getCookies();
        String autologin = null;
        for (int i=0; cookies!=null && i<cookies.length; i++) {
            if("autologin".equals(cookies[i].getName())) {
                autologin = cookies[i].getValue();
                break;
            }
        }
        if(autologin != null) {
            String[] parts = autologin.split("-");
            String username = parts[0];
            String password = parts[1];
            if(("houle").equals(username) && ("123456").equals(password)){
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                req.getSession().setAttribute("user", user);
            }
        }
        // 放行
        chain.doFilter(request, response);
    }
}
