package com.huanletao.examples.message;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 17:51
 * Description:
 */
public class HelloMessage implements IMessageContainer{
    @Override
    public void save(Map message) {
        message.put("name","赵云");
        message.put("depart","开发部");
        message.put("role","高级工程师");
    }
}
