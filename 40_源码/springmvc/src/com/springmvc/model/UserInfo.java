/*
 * @(#)UserInfo.java 2018-7-23下午4:20:51 springmvc Copyright 2018 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.springmvc.model;

import java.io.Serializable;

/**
 * UserInfo
 * @author Administrator
 * @version 1.0
 *
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private Integer age;

    private String pwd;

    public UserInfo() {
    }

    public UserInfo(String name) {
        this.name = name;
    }

    public UserInfo(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public UserInfo(String id, String name, Integer age, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pwd = pwd;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
