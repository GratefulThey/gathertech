package com.springmvc.mybatis.mapper;

import com.springmvc.model.Products;

public interface ProductsMapper {

    int updateByPrimaryKey(Products record);

    /**
     * @param id
     * @return
     */
    int selectCountsById(String id);
}