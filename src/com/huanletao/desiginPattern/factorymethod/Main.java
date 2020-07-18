package com.huanletao.desiginPattern.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:56
 * Description:
 */
public class Main {
    public static void main(String[] args) {

        Moveable m = new Broom();
        m.go();
    }
}
