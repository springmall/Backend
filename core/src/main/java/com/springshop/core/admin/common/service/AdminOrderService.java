package com.springshop.core.admin.common.service;

import com.springshop.core.admin.common.api.form.OrderForm;
import com.springshop.core.common.entity.Order;

public interface AdminOrderService {
    Object create(Order form);

    Object save(Order form);

    Object query(OrderForm form);

    Object delete(Order form);

    Object info(Order form);
}
