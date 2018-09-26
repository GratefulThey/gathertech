/*
 * @(#)IProductsDao.java 2018-8-16上午11:08:58 springmvc Copyright 2018 Thuisoft,
 * Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.springmvc.dao;

/**
 * IProductsDao
 * @author Administrator
 * @version 1.0
 *
 */
public interface IProductsDao {

    /**
     * @param id
     * @return
     */
    int selectCountsById(String id);

}
