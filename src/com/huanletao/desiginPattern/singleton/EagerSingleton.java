package com.huanletao.desiginPattern.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: samsung
 * Date: 2019/10/31
 * Time: 12:30
 * Description:设计模式之 单例模式，饿汉式创建。
 */
public class EagerSingleton {
    //私有成员变量，同时一上来就创建，
    private final static EagerSingleton INSTANCE = new EagerSingleton();

    //私有构造方法
    private EagerSingleton(){}

    //提供一个给外界获取实例的方法
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
