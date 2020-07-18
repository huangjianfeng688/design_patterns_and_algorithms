package com.huanletao.desiginPattern.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 23:37
 * Description:
 */
public class CopyCommand extends Command {
    private Content content;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg+content.msg;
    }

    @Override
    public void sudo() {
        content.msg = content.msg.substring(0,content.msg.length()/2);
    }
}
