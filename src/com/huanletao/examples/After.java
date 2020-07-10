package com.huanletao.examples;

import com.huanletao.examples.message.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/9
 * @Time: 17:50
 * Description:消除大量的 case 。 使用（配置文件+map+策略模式）原来的代码如下。之后的代码。
 *             后面想增加新的选择功能，继续实现接口即可。
 *
 *              （面向扩展开放，对修改关闭。oo编程思想）
 *              使用配置文件进行扩展。 实现高扩展。当需要添加新的功能时，
 *              只需要添加新的class 实现接口，同时在Message.xml 中配置即可。
 */
public class After {

    public static void main(String[] args) {
        Gain gain = new Gain();
        String[] keys = new String[3];
        keys[0] = "contract_year";
        keys[1] = "gzbx";
        keys[2] = "hello";

        Map<String,Object> message = new HashMap();

        for (String key : keys) {
            System.out.println(gain.getMessage(key, message));
        }
    }
}

