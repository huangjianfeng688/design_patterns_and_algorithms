package com.huanletao.desiginPattern.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 23:39
 * Description:
 */
public class DeleteCommand extends Command {
    Content content;
    String deleStr;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        deleStr = content.msg.substring(0,5);
        content.msg = content.msg.substring(5,content.msg.length());
    }

    @Override
    public void sudo() {
        content.msg = deleStr+content.msg;
    }
}
