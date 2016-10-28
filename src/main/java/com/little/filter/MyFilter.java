package com.little.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author pengx
 * @date 2016/10/28
 */
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("dofilter");
        chain.doFilter(request,response);
    }

    public void destroy() {
        System.out.println("filter destory ");
    }
}
