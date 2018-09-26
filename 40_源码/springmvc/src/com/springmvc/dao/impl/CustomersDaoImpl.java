/*
 * @(#)CustomersDaoImpl.java 2018-8-14下午4:40:36 springmvc Copyright 2018
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.springmvc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.ICustomersDao;
import com.springmvc.mybatis.mapper.CustomersMapper;

/**
 * CustomersDaoImpl
 * @author Administrator
 * @version 1.0
 *
 */
public class CustomersDaoImpl implements ICustomersDao {

    @Autowired
    private CustomersMapper customersMapper;

    /** (non-Javadoc)
     * @see com.springmvc.dao.ICustomersDao#selectCountById()
     */
    @Override
    public int selectCountById() {
        return customersMapper.selectCountById();
    }

}
