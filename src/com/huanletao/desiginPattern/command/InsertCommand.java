package com.huanletao.desiginPattern.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 23:33
 * Description:
 */
public class InsertCommand extends Command {
    Content content;
    String str = "www.huanletao.com";

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg+str;
    }

    @Override
    public void sudo() {
        content.msg = content.msg.substring(0,content.msg.length()-str.length());
    }
}
