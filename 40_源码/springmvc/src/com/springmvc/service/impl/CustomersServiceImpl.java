/*
 * @(#)CustomersServiceImpl.java 2018-8-14下午5:06:16 springmvc Copyright 2018
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.springmvc.service.impl;

import org.springframework.stereotype.Service;

import com.springmvc.dao.ICustomersDao;
import com.springmvc.service.ICustomersService;

/**
 * CustomersServiceImpl
 * @author Administrator
 * @version 1.0
 */
@Service
public class CustomersServiceImpl implements ICustomersService {

    //@Autowired
    private ICustomersDao customersDao;

    /**
     * @param customersDao the customersDao to set
     */
    public void setCustomersDao(ICustomersDao customersDao) {
        this.customersDao = customersDao;
    }

    /** (non-Javadoc)
     * @see com.springmvc.service.ICustomersService#selectCountById()
     */
    @Override
    public int selectCountById() {
        return customersDao.selectCountById();
    }

}
