package com.springmvc.mybatis.mapper;

import com.springmvc.model.Orders;

public interface OrdersMapper {

    int updateByPrimaryKey(Orders record);
}