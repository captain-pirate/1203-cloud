package com.qy105.aaa.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qy105.aaa.ZuulApplication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author AI
 * @title: CustomZuulFilter
 * @projectName 1203-cloud
 * @description: TODO
 * @date 2019/12/315:34
 */
@Component
public class CustomZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //前置过滤器
        return "pre";
    }

    @Override
    public int filterOrder() {
        //数字越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否开启过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        System.out.println("token===============");
        if (null!=token) {
            //对该请求路由3
            currentContext.setSendZuulResponse(true);
            currentContext.setResponseStatusCode(200);
            //设值，让下一个filter看到上一个filter的状态
            currentContext.set("isSuccess",true);
        } else {
            //过滤该请求，不进行路由
            currentContext.setSendZuulResponse(false);
            //返回错误码
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.getResponse().getWriter().write("token null");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //return的值没有意义，zuul框架没有使用返回值
        return null;
    }
}
