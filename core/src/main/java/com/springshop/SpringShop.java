package com.springshop;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@MapperScan("com.springshop.core.admin.*.mapper," +
        "com.springshop.core.api.*.mapper," +
        "com.springshop.core.common.*.mapper")
@EnableScheduling
@EnableTransactionManagement
@EnableWebMvc
@EnableAspectJAutoProxy
public class SpringShop {
    public static void main(String[] args) {
        SpringApplication.run(SpringShop.class, args);
    }

}
