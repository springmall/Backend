package com.springshop.core.common.mapper;


import com.springshop.core.common.entity.Product;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ProductMapper extends tk.mybatis.mapper.common.Mapper<Product> {

}