package com.huanletao.desiginPattern.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 22:06
 * Description:
 */
public class CarFactory {

    public Moveable createCar(){
        System.out.println("create car ...");
        return new Car();
    }
}
