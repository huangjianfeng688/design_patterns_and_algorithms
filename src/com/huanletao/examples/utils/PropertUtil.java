package com.huanletao.examples.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 15:55
 * Description: 读取配置文件工具类。
 */
public class PropertUtil {
    private static Properties prop;

    static {
        prop = new Properties();
        try {
            prop.load(PropertUtil.class.getClassLoader().getResourceAsStream("com/huanletao/examples/IntelliJ IDEA 使用技巧"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *读取配置文件内容。
     */
    public static String readProperty(String key){
        return (String) prop.get(key);
    }

}
