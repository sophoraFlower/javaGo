package com.example.webdemo5;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter02 implements Filter {

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
        PrintWriter out = response.getWriter();
        out.write("Hello MyFilter 02 Before <br />");
        chain.doFilter(request, response);
        out.write("<br />Hello MyFilter 02 After <br />");
    }
}
