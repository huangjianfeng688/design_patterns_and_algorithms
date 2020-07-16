package com.huanletao.examples;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/15
 * @Time: 15:25
 * Description:
 */
public class Session {

    public <T> void add(T t){
        System.out.println("insert into" + t + "("+t.getClass()+")");
    }
}
