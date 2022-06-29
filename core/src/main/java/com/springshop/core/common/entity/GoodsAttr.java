package com.springshop.core.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class GoodsAttr extends Base{
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    Long id;
    //产品id
    Long goodsId;
    //产品id
    Long productId;
    //属性名称
    String name;
    //属性值
    String value;
}
