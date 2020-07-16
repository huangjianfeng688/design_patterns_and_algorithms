package com.huanletao.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/15
 * @Time: 15:09
 * Description: 使用泛型 实现一个basedao，的抽象类。
 */
public abstract class BaseDao<T> {

    private Session session;
    private Class clazz;

    public BaseDao(Session session){
        try {
            Class clazz1 = this.getClass();
            ParameterizedType pt = (ParameterizedType) clazz1.getGenericSuperclass();
            clazz = (Class) pt.getActualTypeArguments()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(clazz);

        this.session = session;
    }

    public void add(T t){
        session.add(t);
    }


}
