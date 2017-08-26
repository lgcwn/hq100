package com.up72.hq.conf;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public final class SystemConfig {

    /**
     * 调试变量，用以打印调试错误信息
     */
    public static boolean DEBUG = false;
    /**
     * 系统配置文件名称
     */
    private final static String SYSTEM_CONFIG = "system.properties";
    /**
     * 单子模式实例
     */
    private static SystemConfig config;
    /**
     * map
     */
    private static Map<String, String> params;

    private SystemConfig() {
        load();
    }

    /**
     * 单子模式实例方法
     *
     * @return
     */
    public static SystemConfig instants() {
        if (null == config) {
            config = new SystemConfig();
        }
        return config;
    }

    /**
     * 重新载入资源文件
     */
    public void reload() {
        load();
    }

    /*
     * 载入properties资源文件
     */
    @SuppressWarnings({"unchecked"})
    private void load() {
        if (null == this.params) {
            this.params = new HashMap<String, String>();
        } else {
            this.params.clear();
        }
        Properties properties = new Properties();
        InputStream inputStream = this.getClass().getClassLoader()
                .getResourceAsStream(SYSTEM_CONFIG);
        try {
            properties.load(inputStream);
            Iterator it = properties.keySet().iterator();
            while (it.hasNext()) {
                Object key = it.next();
                if (null != key && !key.toString().equals("")) {
                    String value = properties.getProperty(key.toString());
                    params.put(key.toString().trim(), value.trim());
                }
            }
        } catch (IOException e) {
            if (DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获得资源文件中指定key的的value值
     */
    public static String getValue(String key) {
        return params.get(key);
    }
}
