package com.huanletao.desiginPattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 22:42
 * Description:
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food creatFood() {
        return new MagicBread();
    }

    @Override
    Vehicle createVehicle() {
        return new MagicCar();
    }
}
