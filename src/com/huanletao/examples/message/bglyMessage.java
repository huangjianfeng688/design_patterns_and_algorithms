package com.huanletao.examples.message;



import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 16:12
 * Description:
 */
class bglyMessage implements IMessageContainer {
    @Override
    public void save(Map message) {
        message.put("content", "办公用品申请流程完成");
        message.put("message_type", 1);
    }
}
