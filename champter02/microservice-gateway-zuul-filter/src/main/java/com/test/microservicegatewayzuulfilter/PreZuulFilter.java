package com.test.microservicegatewayzuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Component
public class PreZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest request= RequestContext.getCurrentContext().getRequest();
        String host=request.getRemoteHost();
        System.out.println("请求的host:"+host);
        return null;
    }
}
