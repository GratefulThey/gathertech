/*
 * @(#)WebController.java 2018-7-24下午1:45:43 springmvc Copyright 2018 Thuisoft,
 * Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springmvc.service.ICustomersService;
import com.springmvc.service.IProductsService;

/**
 * WebController
 * @author Administrator
 * @version 1.0
 *
 */
@Controller
public class WebController {

    @Autowired
    private ICustomersService customersService;

    @Autowired
    private IProductsService productsService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index() {
        //System.out.println("start");
        int n = customersService.selectCountById();
        int m = productsService.selectCountsById("1");
        System.out.println(n);
        return "test";
    }

    /**
     * 静态页面跳转问题
     * 对静态资源的访问,处理方式:
     * 配置文件中加====== <mvc:default-servlet-handler/> 和  <mvc:annotation-driven></mvc:annotation-driven>
     */

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        int n = customersService.selectCountById();//测试连接数据库成功
        System.out.println(n);
        return "redirect:/resources/html/final.html";
    }

    /**
     * SpringMVC 重定向问题
     * @param request
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect(HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        request.setAttribute("username", userName);
        request.setAttribute("password", password);
        //重定向传递参数的两种方法
        redirectAttributes.addAttribute("username", userName);
        redirectAttributes.addFlashAttribute("password", password);

        return "redirect:/finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(HttpServletRequest request) {
        String userName = request.getParameter("username");
        request.setAttribute("username", userName);

        return "final";
    }
}
