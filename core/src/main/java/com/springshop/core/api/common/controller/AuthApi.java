package com.springshop.core.api.common.controller;

import com.springshop.core.api.common.controller.form.LoginForm;
import com.springshop.core.api.common.controller.form.SignupForm;
import com.springshop.core.api.common.service.AuthService;
import com.springshop.core.common.dto.ResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@Slf4j
public class AuthApi {

    @Autowired
    AuthService authService;

    @RequestMapping(method = RequestMethod.POST, value = "/auth/login")
    public ResDto<?> login(@RequestBody LoginForm form) throws Exception {
        return new ResDto(authService.login(form));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/auth/signup")
    public ResDto<?> signup(@RequestBody SignupForm form) throws Exception {
        return new ResDto(authService.signup(form));
    }
}
