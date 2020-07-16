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
 * Description:bean util 生成javabean 对象实例
 */
public class BeanUtil {

    public static <T> List<T> getObject(List<Map<String, String>> list, Class<T> tClass) {

        List<T> returnList = new ArrayList<>();

        Field[] declaredFields = tClass.getDeclaredFields();

        for (int i = 0; i < list.size(); i++) {
            T student = null;
            try {
                student = tClass.newInstance();
            } catch (Exception e) {
                System.out.println("create instance error,");
            }
            for (int j = 0; j < declaredFields.length; j++) {

                String name = declaredFields[j].getName();
                declaredFields[j].setAccessible(true);
                Type genericType = declaredFields[j].getGenericType();
                String typeName = genericType.getTypeName();

                try {
                    if (typeName.equals("int")){
                        declaredFields[j].setInt(student,Integer.parseInt(list.get(i).get(name)));
                    }else if (typeName.equals("float")){
                        //declaredFields[j].setFloat(student);
                    }else if (typeName.equals("double")){
                        //                    declaredFields[j].setDouble();
                    }else if (typeName.equals("java.lang.String")){
                        declaredFields[j].set(student,list.get(i).get(name));
                    }else if (typeName.equals("")){
                        //                    declaredFields[j].setBoolean(student,);
                    }else{
                        //
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("set Fields error case:"+e.getMessage());
                }
            }
            returnList.add(student);
        }
        return returnList;
    }
}
