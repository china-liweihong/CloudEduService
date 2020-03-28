package com.cloudedu.serviceutil.config;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Properties;

/**
 * 配置文件读取类
 */
@Slf4j
public class ConfigUtil {

    private ConfigUtil() {
    }

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
            log.warn("当前环境配置为：{}", getProperty("env"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getProperty(String keyName) {
        return properties.getProperty(keyName, "").trim();
    }

}
