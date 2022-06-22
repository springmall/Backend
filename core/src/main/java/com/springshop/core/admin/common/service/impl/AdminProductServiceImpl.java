package com.springshop.core.admin.common.service.impl;

import com.springshop.core.admin.common.api.form.ProductForm;
import com.springshop.core.admin.common.service.AdminProductService;
import com.springshop.core.common.entity.Product;
import com.springshop.core.common.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminProductServiceImpl implements AdminProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public Object create(Product form) {
        productMapper.insert(form);
        return form;
    }

    @Override
    public Object save(Product form) {
        return null;
    }

    @Override
    public Object query(ProductForm form) {
        return null;
    }

    @Override
    public Object delete(Product form) {
        return null;
    }

    @Override
    public Object info(Product form) {
        return null;
    }
}
