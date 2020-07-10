package com.huanletao.examples.message;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 18:01
 * Description:
 */
public class WdxcsMessage implements IMessageContainer{
    @Override
    public void save(Map message) {
        message.put("content", "网点宣传水采购流程完成");
        message.put("message_type", 6);
    }
}
