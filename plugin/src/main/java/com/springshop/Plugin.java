package com.springshop;

public interface Plugin {
    //安装插件
    void install();
    //卸载插件
    void uninstall();
    //禁用插件
    void disable();
    //启用插件
    void enable();
}
