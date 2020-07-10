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
public class contractYearMessage implements IMessageContainer {

    @Override
    public void save(Map message) {
        message.put("content", "合同年终考核流程完成");
        message.put("message_type", 12);
    }
}
