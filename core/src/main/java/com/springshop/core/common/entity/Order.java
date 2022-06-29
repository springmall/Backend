package com.springshop.core.common.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class Order extends Base {
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    Long id;
    /**
     * 订单的号码
     */
    String orderId;
    /**
     * 购买的总价格
     */
    Long totalPrice;
    /**
     * 购买的总数量
     */
    Long totalAmount;
    /**
     * 狗买订单的用户
     */
    String customerId;
}
