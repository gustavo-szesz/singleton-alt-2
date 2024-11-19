package org.example;

import java.util.HashMap;
import java.util.Map;

public class GlobalConfigSingleton {
    private static  GlobalConfigSingleton instance;
    private Map<String, String> configs;

    private GlobalConfigSingleton() {
        configs = new HashMap<>();
    }

    public static GlobalConfigSingleton getInstance() {
        if (instance == null) {
            instance = new GlobalConfigSingleton();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configs.get(key);
    }

    public void setConfig(String key, String value) {
        configs.put(key, value);
    }
}