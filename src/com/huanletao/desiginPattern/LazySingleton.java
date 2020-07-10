package com.huanletao.desiginPattern;

/**
 * Created with IntelliJ IDEA.
 * User: samsung
 * Date: 2019/10/31
 * Time: 12:25
 * Description: 设计模式之 单例模式，懒汉式创建，
 */
public class LazySingleton {
    //定义成员变量
    private static  LazySingleton instance = null;

    //构造方法私有
    private LazySingleton(){}

    //提供一个外界获取实例的方法，
    public static  LazySingleton getInstance(){
        if (instance != null) return instance;
        else {
            instance = new LazySingleton();
            return instance;
        }
    }
}
