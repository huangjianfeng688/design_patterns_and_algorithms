package com.huanletao.desiginPattern.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 21:31
 * Description:
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Address add;

    private Person(){

    }

    public static class PersonBuilder{
        private Person person = new Person();

        public PersonBuilder baseInfo(int id,String name,int age){
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(double weight){
            person.weight = weight;
            return this;
        }

        public PersonBuilder socre(int socre){
            person.score = socre;
            return this;
        }

        public PersonBuilder address(String street,int roomNo){
            person.add = new Address(street,roomNo);
            return this;
        }

        public Person build(){
            return person;
        }

    }

}

class Address{
    String street;
    int roomNo;

    public Address(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
