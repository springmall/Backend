package com.springshop.core.admin.common.service;

import com.springshop.core.admin.common.api.form.CustomerForm;
import com.springshop.core.common.entity.Customer;

public interface AdminCustomerService {
    Object create(Customer form);

    Object save(Customer form);

    Object query(CustomerForm form);

    Object delete(Customer form);

    Object info(Customer form);
}
