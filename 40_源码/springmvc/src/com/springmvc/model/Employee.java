/*
 * @(#)Employee.java 2018-8-9下午2:38:17 springmvc Copyright 2018 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.springmvc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Employee
 * @author Administrator
 * @version 1.0
 *
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String empName;

    private String empPwd;

    private String sex;

    private String email;

    private String city;

    private String hobby;

    private Date birth;

    public Employee() {
    }

    public Employee(String id, String empName, String empPwd, String sex, String email, String city, String hobby, Date birth) {
        super();
        this.id = id;
        this.empName = empName;
        this.empPwd = empPwd;
        this.sex = sex;
        this.email = email;
        this.city = city;
        this.hobby = hobby;
        this.birth = birth;
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

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return the empPwd
     */
    public String getEmpPwd() {
        return empPwd;
    }

    /**
     * @param empPwd the empPwd to set
     */
    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * @return the birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [id=" + id + ", empName=" + empName + ", empPwd=" + empPwd + ", sex=" + sex + ", email=" + email + ", city="
                + city + ", hobby=" + hobby + ", birth=" + birth + "]";
    }

}
