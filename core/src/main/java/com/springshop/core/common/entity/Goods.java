package com.springshop.core.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Goods extends Base{
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    Long id;
    /**
     * 商品的名称
     */
    String name;
    /**
     * 商品的描述信息
     */
    String description;
}
