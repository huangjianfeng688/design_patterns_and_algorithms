package com.huanletao.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/9
 * @Time: 17:46
 * Description: 消除 大量的 case 。 使用（map+策略模式）原来的代码如下。之前的代码。
 */
public class before {
    public static void main(String[] args) {
       Map<String,Object> messageMap = new HashMap();
        String key = "";
        switch (key) {
            case "bgly":
                messageMap.put("content", "办公用品申请流程完成");
                messageMap.put("message_type", 1);

                break;
            case "contract":
                messageMap.put("content", "合同审核流程完成");
                messageMap.put("message_type", 8);
                break;
            case "gys":
                messageMap.put("content", "供应商审核流程完成");
                messageMap.put("message_type", 9);

                break;
            case "bgxd":
                messageMap.put("content", "办公用品采购流程完成");
                messageMap.put("message_type", 2);
                break;
            case "wdbgly":
                messageMap.put("content", "网点办公用品采购流程完成");
                messageMap.put("message_type", 3);
                break;
            case "xcs":
                messageMap.put("content", "宣传水申请流程完成");
                messageMap.put("message_type", 4);

                break;
            case "xcsxd":
                messageMap.put("content", "宣传水采购流程完成");
                messageMap.put("message_type", 5);

                break;
            case "ysly":
                messageMap.put("content", "印刷品采购流程完成");
                messageMap.put("message_type", 7);

                break;
            case "symp":
                messageMap.put("content", "申应名片流程完成");
                messageMap.put("message_type", 10);

                break;
            case "wdxcs":
                messageMap.put("content", "网点宣传水采购流程完成");
                messageMap.put("message_type", 6);

                break;
            case "gzbx":
                messageMap.put("content", "故障报修流程完成");
                messageMap.put("message_type", 11);

                break;
            case "contract_year":
                messageMap.put("content", "合同年终考核流程完成");
                messageMap.put("message_type", 12);
                break;
        }
    }
}
