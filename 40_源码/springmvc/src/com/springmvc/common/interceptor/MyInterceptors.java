/*
 * @(#)MyInterceptors.java 2018-7-10上午11:09:47 springmvc Copyright 2018
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.springmvc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * SpringMVC拦截器
 * MyInterceptors
 * @author Administrator
 * @version 1.0
 *
 */
public class MyInterceptors implements HandlerInterceptor {

    /**
     * 可以考虑作权限，日志，事务等等 
     * 该方法在目标方法调用之前被调用； 
     * 若返回TURE,则继续调用后续的拦截器和目标方法 
     * 若返回FALSE,则不会调用后续的拦截器和目标方法 
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println("MyInterceptors preHandle 调用方法名：" + handlerMethod.getMethod().getName());
        /*
         * 写一个日记类和Service，将需要的属性保存到数据库
         */
        return true;
    }

    /** 
     * 该方法在目标方法调用之后，渲染视图之前被调用； 
     * 可以对请求域中的属性或视图做出修改 
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptors postHandle");
    }

    /** 
     * 在渲染视图之后被调用； 
     * 可以用来释放资源 
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptors afterCompletion");
    }

}
