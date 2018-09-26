package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.UserInfo;

@Controller
public class ViewController {
    final Logger logger = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping("/index")
    public ModelAndView view(HttpServletRequest request) {

        String path = request.getParameter("path") + "";
        ModelAndView mav = new ModelAndView();

        String contextPath = request.getContextPath();
        mav.addObject("contextPath", contextPath);

        mav.setViewName(path);
        return mav;

    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        //给页面设置值
        model.addAttribute("greeting", "Hello Spring MVC");
        logger.info("hello访问加载登录页面00");
        logger.debug("hello访问加载登录页面11");
        logger.error("hello访问加载登录页面22");
        return "helloworld";
    }

    /**
     * 用户登陆
     * 通过mvc对象类中的方法来处理请求过来的参数
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView login(String username, String password) {
        //验证传递过来的参数是否正确，否则返回到登陆页面
        if (this.checkParams(new String[] { username, password })) {
            //指定要返回的页面success.jsp
            ModelAndView mav = new ModelAndView("success");
            //将参数返回给页面
            mav.addObject("username", username);
            mav.addObject("password", password);
            return mav;
        }
        return new ModelAndView("helloworld");
    }

    /**
     * 验证参数是否为空
     * @param params
     * @return
     */
    public boolean checkParams(String[] params) {
        for (String param : params) {
            if (StringUtils.isEmpty(param)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 另一种参数传递的形式
     * 通过原始的request来处理请求过来的参数_支持get/post方式提交
     * @param username
     * @param password
     * @param request
     * @return
     */
    @RequestMapping(value = "loginOther", method = RequestMethod.GET)
    public ModelAndView login(String username, String password, HttpServletRequest request) {
        //jsp页面上的值
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        return new ModelAndView("success");
    }

    // ???? @PathVariable的使用
    @RequestMapping(value = "/hello/{username}", method = RequestMethod.POST)
    public ModelAndView getUserInJSON(@PathVariable(value = "username") String name) {
        UserInfo ui = new UserInfo(name);
        ModelAndView mv = new ModelAndView();
        mv.addObject(ui);
        return mv;
    }

    /**
     * showEmplyee
     */
    @RequestMapping(value = "/showEmployee", method = RequestMethod.POST)
    public ModelAndView showEmplyee(Model model) {
        model.addAttribute("empName", "ABC");
        model.addAttribute("empPwd", "1111");
        return new ModelAndView("success", "employee", model);
    }
}
