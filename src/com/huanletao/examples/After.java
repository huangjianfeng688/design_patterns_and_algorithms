package com.huanletao.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/9
 * @Time: 17:50
 * Description:消除大量的 case 。 使用（map+策略模式）原来的代码如下。之后的代码。
 *             后面想增加新的选择功能，继续实现接口即可。
 *
 *              （面向扩展开放，对修改关闭。oo编程思想）
 */
public class After {

    public static void main(String[] args) {
        Gain gain = new Gain();
        String key = "contract_year";

        Map<String,Object> message = new HashMap();

        MessageContainer contract_year = new contractYearMessage();

        gain.add("contract_year",contract_year);

        System.out.println(gain.getMessage(key, message));

    }
}

class Gain{

    private static Map<String,MessageContainer> containerMap = new HashMap<>();

    public Gain(){
        containerMap.put("gzbx",new gzbxMessage());
        containerMap.put("bgly",new bglyMessage());
        containerMap.put("contract",new contractMessage());
    }

    public void add(String key,MessageContainer message){
       containerMap.put(key,message);
    }

    public Map getMessage(String key,Map message){
        MessageContainer messageContainer = containerMap.get(key);
        messageContainer.save(message);
        return message;
    }
}

interface MessageContainer{
    void save(Map message);
}

class gzbxMessage implements MessageContainer {

    @Override
    public void save(Map message) {
        message.put("content", "故障报修流程完成");
        message.put("message_type", 11);

    }
}

class bglyMessage implements MessageContainer{
    @Override
    public void save(Map message) {
        message.put("content", "办公用品申请流程完成");
        message.put("message_type", 1);
    }
}

class contractMessage implements MessageContainer{
    @Override
    public void save(Map message) {
        message.put("content", "合同审核流程完成");
        message.put("message_type", 8);
    }
}

class gysMessage implements MessageContainer{
    @Override
    public void save(Map message) {
        message.put("content", "供应商审核流程完成");
        message.put("message_type", 9);
    }
}

class contractYearMessage implements MessageContainer{

    @Override
    public void save(Map message) {
        message.put("content", "合同年终考核流程完成");
        message.put("message_type", 12);
    }
}