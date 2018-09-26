/*
 * @(#)ProductsDaoImpl.java 2018-8-16上午11:09:22 springmvc Copyright 2018
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.springmvc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.IProductsDao;
import com.springmvc.mybatis.mapper.ProductsMapper;

/**
 * ProductsDaoImpl
 * @author Administrator
 * @version 1.0
 *
 */
public class ProductsDaoImpl implements IProductsDao {

    @Autowired
    private ProductsMapper productsMapper;

    /** (non-Javadoc)
     * @see com.springmvc.dao.IProductsDao#selectCountsById(java.lang.String)
     */
    @Override
    public int selectCountsById(String id) {
        return productsMapper.selectCountsById(id);
    }

}
