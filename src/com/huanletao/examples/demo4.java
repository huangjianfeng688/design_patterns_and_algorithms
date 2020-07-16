package com.huanletao.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/16
 * @Time: 17:55
 * Description:
 */
public class demo4 {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

        map.put("userid","1002");
        map.put("username2","岳不群");
        map.put("password","1234567");
        list.add(map);
        List<User> users = demo3.getObject(list,User.class);
        System.out.println(users);
    }
}
