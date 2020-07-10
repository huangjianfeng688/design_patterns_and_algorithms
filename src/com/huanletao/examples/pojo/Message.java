package com.huanletao.examples.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 17:12
 * Description:
 */
public class Message {
    private String key;
    private String zlass;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getZlass() {
        return zlass;
    }

    public void setZlass(String zlass) {
        this.zlass = zlass;
    }

    @Override
    public String toString() {
        return "Message{" +
                "key='" + key + '\'' +
                ", zlass='" + zlass + '\'' +
                '}';
    }
}
