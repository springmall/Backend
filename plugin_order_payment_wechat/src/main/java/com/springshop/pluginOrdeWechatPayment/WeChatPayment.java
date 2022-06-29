package com.springshop.pluginOrdeWechatPayment;


import com.springshop.Plugin;
import lombok.Data;

@Data
public class WeChatPayment implements Plugin {
    String name="微信支付";
    String desc="微信支付插件";
    String version="v0.0.1";

    @Override
    public void install() {

    }

    @Override
    public void uninstall() {

    }

    @Override
    public void disable() {

    }

    @Override
    public void enable() {

    }
}
