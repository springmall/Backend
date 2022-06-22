package com.springshop.core.admin.common.service;

import com.springshop.core.admin.common.api.form.ProductForm;
import com.springshop.core.common.entity.Product;

public interface AdminProductService {
    Object create(Product form);

    Object save(Product form);

    Object query(ProductForm form);

    Object delete(Product form);

    Object info(Product form);
}
