package com.huanletao.examples;

import com.huanletao.examples.message.Person;
import com.huanletao.examples.message.Student;
import com.huanletao.examples.utils.BeanFactory;
import com.huanletao.examples.utils.BeanFactory.Builder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/17
 * @Time: 10:50
 * Description:
 */
public class demo5 {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap();
        map.put("id","124");
        map.put("name","任盈盈");
        map.put("age","25");
        list.add(map);
        map = new HashMap();
        map.put("id","12114");
        map.put("name","令狐冲");
        map.put("age","36");

        list.add(map);
        System.out.println(list);
        Builder builder = new Builder();
        BeanFactory factory = builder.build();
        List<Person> bean = factory.getBean(list, Person.class);
        System.out.println(bean);
    }
}
