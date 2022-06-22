package com.springshop.core.admin.common.api.form;

import com.springshop.core.common.controller.form.PageForm;
import com.springshop.core.common.entity.Order;
import lombok.Data;

@Data
public class OrderForm extends Order implements PageForm {
    Integer pageNum;
    Integer pageStart;
}
