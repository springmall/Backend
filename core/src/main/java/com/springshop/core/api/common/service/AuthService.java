package com.springshop.core.api.common.service;

import com.springshop.core.api.common.controller.form.LoginForm;
import com.springshop.core.api.common.controller.form.SignupForm;

public interface AuthService {
    Object login(LoginForm form) throws Exception;

    Object signup(SignupForm form) throws Exception;
}
