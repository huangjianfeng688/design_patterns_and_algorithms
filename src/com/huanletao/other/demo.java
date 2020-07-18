package com.huanletao.other;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 16:31
 * Description:
 */
public class demo {
    public static void main(String[] args) {
        String s = "103,614586376564795,测试银行,212312312312,1,1,103,1";

        String substring = s.substring(s.indexOf(",")+1);

        String substring1 = substring.substring(0,substring.indexOf(","));

        System.out.println(substring1);

        System.out.println(substring);
        System.out.println(s);

    }
}
