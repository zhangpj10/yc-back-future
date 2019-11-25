package com.yc.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 zhangpj
 * @创建时间 2017/11/29
 * @描述
 **/
public class FilterSecurity extends HttpServlet implements Filter {

    private static final long serialVersionUID = 37806129411164456L;

    private FilterConfig filterConfig;

    private Map<String, String> noFilter;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;

        //不过滤的uri
        noFilter = new HashMap<>();
        noFilter.put("/login", "/login");
        noFilter.put("/leshuo", "/leshuo");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        // 请求的uri
        String reqURL = req.getRequestURI();

        if(reqURL.indexOf("login") == -1) {
            boolean doFilter = true;
            if(noFilter.containsKey(reqURL.substring(0, reqURL.lastIndexOf("/"))))
            {
                chain.doFilter(req, resp);
                doFilter = false;
            }
            if(isAssets(reqURL))
            {
                chain.doFilter(req, resp);
                doFilter = false;
            }
            if(doFilter) {
                Object obj = req.getSession().getAttribute("usersInfo");
                if(null == obj) {
                    resp.sendRedirect("../login/index");
                } else {
                    chain.doFilter(req,resp);
                }
            }
        } else if(reqURL.equals("/login") || reqURL.equals("/")) {
            chain.doFilter(req, resp);
        } else {
            chain.doFilter(req, resp);
        }
    }

    /**
     * 是否资源文件
     * @param reqURL
     * @return
     */
    private String RESOURE_REGEX = ".*/.+\\.(js|css|map)$";
    private boolean isAssets(String reqURL) {
        if (reqURL.indexOf("/static") != -1 || reqURL.indexOf("/img/") != -1) {
            return true;
        }
        return reqURL.matches(RESOURE_REGEX);
    }
}
