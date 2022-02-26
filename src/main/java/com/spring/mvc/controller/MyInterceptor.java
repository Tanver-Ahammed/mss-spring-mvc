package com.spring.mvc.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("This is prehandle method.........");
        String interceptorValue = request.getParameter("interceptorValue");

        if (interceptorValue.startsWith("Tanver")) {
            response.setContentType("text/html");
            response.getWriter().print("<h1>INVALID Name!!!!!!</h1>");
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("This is posthandle method.........");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println("This is afterhandle method.........");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}

