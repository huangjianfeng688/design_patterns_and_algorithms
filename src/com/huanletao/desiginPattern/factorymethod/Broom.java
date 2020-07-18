package com.huanletao.desiginPattern.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 22:00
 * Description:
 */
public class Broom implements Moveable {
    @Override
    public void go() {
        System.out.println("broom flying ....");
    }
}
