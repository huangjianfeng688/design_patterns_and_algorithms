package com.huanletao.examples.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/16
 * @Time: 18:06
 * Description:bean util 生成javabean 对象实例, 使用构造器。单例模式
 */
public class BeanFactory {

    private static final BeanFactory INSTANCE = new BeanFactory();

    private BeanFactory(){

    }

    public <E> E getBean(Class<E> tClass){

        return null;
    }

    public <T> List<T> getBean(List<Map<String, String>> list, Class<T> tClass) {

        List<T> beanList = new ArrayList<>() ;

        Field[] declaredFields = tClass.getDeclaredFields();

        for (int i = 0; i < list.size(); i++) {
            T object = null;
            try {
                object = tClass.newInstance();
            } catch (Exception e) {
                System.out.println("create instance error,");
            }
            for (int j = 0; j < declaredFields.length; j++) {

                setBeanFields(list.get(i), declaredFields[j], object);
            }
            beanList.add(object);
        }
        return beanList;
    }

    private <T> void setBeanFields(Map<String, String> map, Field declaredField, T student) {
        String name = declaredField.getName();
        declaredField.setAccessible(true);
        Type genericType = declaredField.getGenericType();
        String typeName = genericType.getTypeName();

        try {
            if (typeName.equals("int")){
                declaredField.setInt(student,Integer.parseInt(map.get(name)));
            }else if (typeName.equals("float")){
                //declaredFields[j].setFloat(student);
            }else if (typeName.equals("double")){
                //                    declaredFields[j].setDouble();
            }else if (typeName.equals("java.lang.String")){
                declaredField.set(student, map.get(name));
            }else if (typeName.equals("")){
                //declaredFields[j].setBoolean(student,);
            }else{
                //
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("set Fields error case:"+e.getMessage());
        }
    }


    //静态内部类。
    public static class Builder{
        public BeanFactory build(){
            return INSTANCE;
        }
    }
}
