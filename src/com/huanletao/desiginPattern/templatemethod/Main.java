package com.huanletao.desiginPattern.templatemethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 23:56
 * Description: 设计模式 之 模板方法（钩子函数）
 */
public class Main {
    public static void main(String[] args) {
        Father c1 = new C1();
        c1.m();
    }
}

class C1 extends Father{

    @Override
    public void op1() {
        System.out.println("op1 被调用");
    }

    @Override
    public void op2() {
        System.out.println("op2 被调用");
    }
}

abstract class Father{
    void m(){
        op1();
        op2();
    }

     abstract void op1();
     abstract void op2();
}