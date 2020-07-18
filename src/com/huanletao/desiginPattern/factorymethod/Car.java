package com.huanletao.desiginPattern.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:56
 * Description:
 */
public class Car implements Moveable {
    @Override
    public void go() {
        System.out.println("car runing ....");
    }
}
