package com.huanletao.desiginPattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 22:43
 * Description:
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food creatFood() {
        return new ModernBread();
    }

    @Override
    Vehicle createVehicle() {
        return new ModernCar();
    }
}
