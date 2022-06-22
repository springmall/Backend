package com.springshop.core.admin.common.api.form;

import com.springshop.core.common.controller.form.PageForm;
import com.springshop.core.common.entity.Customer;
import lombok.Data;

@Data
public class CustomerForm extends Customer implements PageForm {
    Integer pageNum;
    Integer pageStart;
}
