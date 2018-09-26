/*
 * @(#)ProductsServiceImpl.java 2018-8-16上午11:10:17 springmvc Copyright 2018
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.IProductsDao;
import com.springmvc.service.IProductsService;

/**
 * ProductsServiceImpl
 * @author Administrator
 * @version 1.0
 *
 */
@Service
public class ProductsServiceImpl implements IProductsService {

    @Autowired
    private IProductsDao productsDao;

    /**
     * @param productsDao the productsDao to set
     */
    //    public void setProductsDao(IProductsDao productsDao) {
    //        this.productsDao = productsDao;
    //    }

    /** (non-Javadoc)
     * @see com.springmvc.service.IProductsService#selectCountsById(java.lang.String)
     */
    @Override
    public int selectCountsById(String id) {
        return productsDao.selectCountsById(id);
    }
}
