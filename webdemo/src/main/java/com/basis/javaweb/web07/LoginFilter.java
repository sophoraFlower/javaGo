package com.basis.javaweb.web07;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(filterName = "loginFilter", urlPatterns =
        {"/user/*","/order/*"},initParams = {
        @WebInitParam(name = "encoding",value = "UTF-8"),
        @WebInitParam(name = "loginPage",value = "/basis/base08-login.jsp"),
})

public class LoginFilter implements Filter {

    private FilterConfig filterConfig;
    private String encoding;
    private String loginPage;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LoginFilter init~");
        this.filterConfig = filterConfig;
        this.encoding = filterConfig.getInitParameter("encoding");
        this.loginPage = filterConfig.getInitParameter("loginPage");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("LoginFilter doFilter~");
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        response.setContentType("text/html;charset=utf-8");
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;

        //session⾥里里⾯面有⽤用户信息
        if(httpServletRequest.getSession().getAttribute("loginUser") !=null)
        {
            chain.doFilter(request,response);
        }else {
            httpServletRequest.setAttribute("msg","⾮法访问，请登录");
            httpServletRequest.getRequestDispatcher(loginPage).forward(httpServletRequest, httpServletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("LoginFilter destroy~");
    }
}
