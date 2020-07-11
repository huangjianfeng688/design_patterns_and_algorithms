package com.huanletao.Algorithms.recursion;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/11
 * @Time: 13:51
 * Description: 递归经典问题 -->斐波那契数列
 *
 *
 *
 */
public class demo1 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }

    public static int Fibonacci(int num){

        if (num == 0) return 0;
        else if (num == 1) return 1;
        else {
            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }
    }
}
