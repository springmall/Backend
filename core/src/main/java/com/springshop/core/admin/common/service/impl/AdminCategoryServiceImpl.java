package com.springshop.core.admin.common.service.impl;

import com.springshop.core.admin.common.api.form.CategoryForm;
import com.springshop.core.admin.common.service.AdminCategoryService;
import com.springshop.core.common.entity.Category;
import com.springshop.core.common.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public Category create(Category form) {
        categoryMapper.insert(form);
        return null;
    }

    @Override
    public Category save(Category form) {
        categoryMapper.updateByPrimaryKey(form);
        return form;
    }

    @Override
    public List<Category> query(CategoryForm form) {
        return categoryMapper.selectByExample(form);
    }

    @Override
    public Boolean delete(Category form) {
        categoryMapper.deleteByPrimaryKey(form);
        return true;
    }

    @Override
    public Object info(Category form) {
        return categoryMapper.selectByPrimaryKey(form);
    }
}
