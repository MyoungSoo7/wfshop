package org.welfare.wfshop.util.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.welfare.wfshop.exception.Errors;

@Slf4j
public class Interceptor implements HandlerInterceptor {
    @Value("${client.servlet.url}")
    protected String clientUrl;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof ResourceHttpRequestHandler) {
            return true;
        }
        if(handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod)handler;
            if(hm.getBean() != null && hm.getBean() instanceof Errors) {

                return true;
            }
        }
        //관리자는 무조건 로그인 체크
        return true;
    }


}
