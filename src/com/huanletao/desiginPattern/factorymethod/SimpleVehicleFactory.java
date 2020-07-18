package com.huanletao.desiginPattern.factorymethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 22:03
 * Description: 简单工厂扩展性不强。
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }

}
