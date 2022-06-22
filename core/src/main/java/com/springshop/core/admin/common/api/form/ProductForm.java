package com.springshop.core.admin.common.api.form;

import com.springshop.core.common.controller.form.PageForm;
import com.springshop.core.common.entity.Product;
import lombok.Data;

@Data
public class ProductForm extends Product implements PageForm {
    Integer pageNum;
    Integer pageStart;
}
