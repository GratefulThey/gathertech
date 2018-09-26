/*
 * @(#)UserInfoController.java 2018-7-24上午10:00:13 springmvc Copyright 2018
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.UserInfo;

/**
 * UserInfoController
 * @author Administrator
 * @version 1.0
 *
 */
@Controller
public class UserInfoController {

    @RequestMapping(value = "/userinfo")
    public ModelAndView userInfo() {
        return new ModelAndView("userinfo", "command", new UserInfo());
    }

    /**
     * 使用RequestParam注解可以获取到值
     *    问题：@ModelAttribute("SpringWeb")如何使用？
     * @param name
     * @param pwd
     * @param model
     * @return
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam("username") String name, @RequestParam("password") String pwd, ModelMap model) {
        model.addAttribute("username", name);
        model.addAttribute("password", pwd);

        return new ModelAndView("result", "command", model);
    }

    /**
     * 注解@ModelAttribute的使用(一)
     * @return
     */
    @RequestMapping(value = "/visitUser", method = RequestMethod.GET)
    public ModelAndView getUser() {
        return new ModelAndView("userinfo", "command", new UserInfo());//这里的第一个参数userinfo会有一个对应的页面
    }

    /**
     * 该实现方式会有与请求路径中方法同名的addUserInfo.jsp页面与其对应
     * 页面中UserInfo属性所填信息会被返回带入到页面,页面使用 ${对象名.属性名} 来获取
     * 
     * 暴露@RequestMapping 方法返回值为模型数据：放在功能处理方法的返回值上时，是暴露功能处理方法的返回值为模型数据，用于视图页面展示时使用
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    public @ModelAttribute("userInfo")
    UserInfo addUserInfo(@ModelAttribute("userInfo") UserInfo userInfo) {
        //        ModelMap model
        //        model.addAttribute("name", userInfo.getName());
        //        model.addAttribute("age", userInfo.getAge());
        //        model.addAttribute("id", userInfo.getId());

        return userInfo;
    }

    /**
     * 注解@ModelAttribute的使用(二)
     * 
     * 访问getUser,会先调用findUser()方法 然后将返回的UserInfo对象传给helloUser()方法
     * 而在helloUser()方法中可对对象属性进行修改，最终helloUser方法不对返回信息产生任何影响
     * 其返回值仍由带注解@ModelAttribute("userInfo")的方法来决定
     * @return
     */

    //    @ModelAttribute("userInfo")
    //    public UserInfo findUser() {
    //        return new UserInfo("ID_rct", "tcr", 23, "000000");
    //    }
    //
    //    @RequestMapping(value = "/userinfo")
    //    public void helloUser(@ModelAttribute("userInfo") UserInfo userInfo) {
    //        userInfo.setAge(22);
    //        userInfo.setPwd("101010");
    //    }

    /**
     * 注解@ModelAttribute的使用(三)
     * @return
     */

    @RequestMapping(value = "/doubleAnnotation")
    @ModelAttribute("userInfo")
    public String doubleAnnotation() {
        System.out.println("hbsjdfnsj");
        return "userinfo";
    }

}
