package com.springshop.core.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class CategoryAttr extends Base{
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    Long id;

    Long categoryId;
    //属性名称
    String name;
    //属性值
    String value;
}
