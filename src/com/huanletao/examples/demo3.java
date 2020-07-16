package com.huanletao.examples;

import com.huanletao.examples.message.Person;
import com.huanletao.examples.message.Student;
import com.huanletao.examples.pojo.Message;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/15
 * @Time: 15:46
 * Description:
 */
public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap();
        map.put("sid","124");
        map.put("name","任盈盈");
        map.put("sex","女");
        list.add(map);
        map = new HashMap();
        map.put("sid","12114");
        map.put("name","令狐冲");
        map.put("sex","男");

        list.add(map);

        List<Student> students = getObject(list, Student.class);
        System.out.println(students);
    }

    public static <T> List<T> getObject(List<Map<String, String>> list,Class<T> tClass) {

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
