package com.huanletao.desiginPattern.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 23:31
 * Description: 设计模式之 命令模式
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        Command insert = new InsertCommand(content);
        insert.doit();
        System.out.println(content.msg);
        insert.sudo();
        System.out.println(content.msg);

        Command copy = new CopyCommand(content);
        copy.doit();
        System.out.println(content.msg);
        copy.sudo();
        System.out.println(content.msg);

        Command delete = new DeleteCommand(content);
        delete.doit();
        System.out.println(content.msg);
        delete.sudo();

        System.out.println(content.msg);

    }
}
