package com.huanletao.examples;

import com.huanletao.examples.message.Person;
import com.huanletao.examples.message.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/13
 * @Time: 16:56
 * Description:
 */
public class demo2 {

    public static void main(String[] args) {
        GerenateObject<Person> gerenat = new GerenateObject<>();
        Person person = gerenat.getObject("person");

        GerenateObject<Student> studentGerenateObject = new GerenateObject<>();
        Student student = studentGerenateObject.getObject("student");
        System.out.println(student);
        System.out.println("hello world");
        System.out.println("person = " + person);

        Map<String,String> map = new HashMap<>();
        map.entrySet().iterator();

    }
}
