package xyz.ieden.base.config.component.properties;

import org.springframework.beans.BeansException;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author gavin
 * @date 2018/7/29 1:16
 */
public class PropertiesListenerConfig {
    private static Map<String, String> propertiesMap = new HashMap<>();

    public static void processProperties(String propertyFileName) throws BeansException, IOException {
        Properties properties = PropertiesLoaderUtils.loadAllProperties(propertyFileName);
        for (Object key : properties.keySet()) {
            String keyStr = key.toString();
            try {
                // PropertiesLoaderUtils的默认编码是ISO-8859-1,在这里转码一下
                propertiesMap.put(keyStr, new String(properties.getProperty(keyStr).getBytes("ISO-8859-1"), "utf-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String name) {
        return propertiesMap.get(name).toString();
    }

    public static Map<String, String> getAllProperty() {
        return propertiesMap;
    }
}
