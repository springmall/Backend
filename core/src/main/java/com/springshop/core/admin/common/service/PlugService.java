package com.springshop.core.admin.common.service;

public interface PlugService {
    void install(String path);
    void uninstall(String id);
    void disable(String id);
    void enable(String id);
}
