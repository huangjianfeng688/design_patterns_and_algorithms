package com.huanletao.desiginPattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:56
 * Description: 设计模之抽象工厂，由具体的工厂继承，不同类的工厂可以create 不同的产品。
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();

        Vehicle vehicle = factory.createVehicle();

        Food food = factory.creatFood();

        vehicle.go();

        food.printName();
    }
}
