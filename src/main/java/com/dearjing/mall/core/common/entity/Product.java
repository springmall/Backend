package com.dearjing.mall.core.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class Product extends Base{
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    Integer id;
    /**
     * 商品的名称
     */
    String name;
    /**
     * 商品的描述信息
     */
    String description;
    /**
     * 销售价格
     */
    Integer salePrice;
}
