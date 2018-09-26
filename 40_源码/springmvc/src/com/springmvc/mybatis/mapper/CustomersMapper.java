package com.springmvc.mybatis.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomersMapper {

    int selectCountById();
}