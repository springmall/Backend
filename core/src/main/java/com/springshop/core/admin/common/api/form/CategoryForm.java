package com.springshop.core.admin.common.api.form;

import com.springshop.core.common.controller.form.PageForm;
import com.springshop.core.common.entity.Category;
import lombok.Data;

@Data
public class CategoryForm extends Category implements PageForm {
    Integer pageNum;
    Integer pageStart;
}
