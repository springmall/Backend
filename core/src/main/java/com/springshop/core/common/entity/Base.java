package com.springshop.core.common.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Base {
    Date createAt;
    Date updateAt;
    Date deleteAt;
    Long createUserId;
    Long updateUserId;
    Long deleteUserId;
}
