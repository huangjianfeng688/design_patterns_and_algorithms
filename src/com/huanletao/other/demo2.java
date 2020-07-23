package com.huanletao.other;

import com.huanletao.examples.Gain;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/21
 * @Time: 13:10
 * Description:
 */
public class demo2 {

    public static void main(String[] args) throws ClassNotFoundException {


        Animal<String> animal = new Animal<>();
        animal.setObj("name");
        String obj = animal.getObj();
        System.out.println(obj);
        Gain method = animal.method(new Gain());
        System.out.println("method = " + method);
    }

    //获取泛型方法参数的实际类型。
    public static <E> E print (E type){
        String typeName = type.getClass().getTypeName();
        System.out.println(typeName);
        return type;
    }
}

class M<T>{
    private T name;
    public String getNameType(){
        Type genericSuperclass = M.class.getGenericSuperclass();
        System.out.println(genericSuperclass.getTypeName());
        Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        for (Type type : types) {
            System.out.println("type = " + type);
        }
        System.out.println(name);
        return "";
    }
}
class Animal<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }


    public <E> E method(E e){
        System.out.println(e.getClass());
        return e;
    }

    public Class<?> method1(String name){
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}