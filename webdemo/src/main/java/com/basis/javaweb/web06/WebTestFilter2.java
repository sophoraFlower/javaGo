package com.basis.javaweb.web06;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "hole", servletNames = {"*"}, initParams = {
        @WebInitParam(name = "encoding", value = "utf-8"),
        @WebInitParam(name = "basePage", value = "/basis/base03.jsp"),
}, dispatcherTypes = {DispatcherType.FORWARD})

public class WebTestFilter2 implements Filter {
    private FilterConfig filterConfig;
    private String encoding;
    private String basePage;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");
        this.filterConfig = filterConfig;

        String filterName = filterConfig.getFilterName();
        System.out.println("filterName = " + filterName);
        this.encoding = filterConfig.getInitParameter("encoding");
        this.basePage = filterConfig.getInitParameter("basePage");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter doFilter");

        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        response.setContentType("text/html;charset=utf-8");

        // 让请求继续往下走
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy");
    }
}
