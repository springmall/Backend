package com.springshop.core.admin.common.api.form;

import com.springshop.core.common.controller.form.PageForm;
import com.springshop.core.common.entity.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class UserForm extends Product implements PageForm {
    Integer pageNum;
    Integer pageStart;
}
