package com.huanletao.Algorithms.recursion;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/11
 * @Time: 14:02
 * Description: 递归 实现数字阶乘
 *
 *          3=3*2*1
 *
 */
public class demo2 {

    public static void main(String[] args) {
        System.out.println(factorial(2));
    }

    /**
     *    递归实现阶乘
     * @param number
     * @return
     */
    public static int factorial(int number){
        if (number == 1) return 1;
        else{
            return factorial(number - 1) * number;
        }

    }
}
