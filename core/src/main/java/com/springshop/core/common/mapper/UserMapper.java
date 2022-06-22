package com.springshop.core.common.mapper;


import com.springshop.core.common.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper  extends tk.mybatis.mapper.common.Mapper<User> {

}