package com.springshop.core.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class OrderItem extends Base{
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    Long id;
    /**
     * 对应的订单号
     */
    String orderId;
    /**
     * 数量
     */
    Long quantity;
    /**
     * 总价
     */
    Long totalPrice;
    /**
     *快照id
     */
    Long snapshotId;
}
