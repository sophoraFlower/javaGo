package com.example.webdemo5;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter03 implements Filter {

    private String characterEncoding;
    FilterConfig fc;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        characterEncoding = fc.getInitParameter("encoding");
        System.out.println("encoding初始化的参数的值为：" + characterEncoding);
        chain.doFilter(request, response);
    }
}
