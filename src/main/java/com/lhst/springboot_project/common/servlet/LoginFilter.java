package com.lhst.springboot_project.common.servlet;

import com.lhst.springboot_project.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginFilter implements Filter {

    @Autowired
    RedisUtil redisUtil;


    @Override
    public void init(FilterConfig filterConfig) {
        if (redisUtil == null) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(filterConfig.getServletContext());
            redisUtil = (RedisUtil) context.getBean("redisUtil");
        }

    }
    @Override
    public void doFilter(ServletRequest res, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) res;
        HttpServletResponse response = (HttpServletResponse) resp;
        String token = request.getHeader("token");
//       if(request.getDispatcherType().toString().contains("/user/login"))
        boolean contains = request.getRequestURL().toString().contains("/user/login");
        if(StringUtils.isEmpty(token)&&!contains){
            response.getWriter().write("请登录");
            return;
        }

        if(StringUtils.isEmpty(token)&&contains){
            chain.doFilter(res,resp);
        }

        if(!StringUtils.isEmpty(token)){
            Boolean haskey = redisUtil.haskey(token);

            if(!haskey&&!contains){
                response.getWriter().write("用户不存在");
            }
            chain.doFilter(res,resp);
        }
    }

    @Override
    public void destroy() {

    }
}
