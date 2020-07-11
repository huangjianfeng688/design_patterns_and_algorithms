package com.huanletao.Algorithms.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: master huang
 * Date: 2019/10/31
 * Time: 8:56
 * Description:十大经典排序算法---冒泡排序算法
 *      分析：每第一个和第二个进行比较，如果第二个小于第一个，就换位置，
 *      比较的轮数：n-1；
 *     每轮 比较的次数：n-n-1;
 */
public class BubbleSort {
    //定义未进行排序的原始数组。
    private static int[] array = {12,45,7,25,8,79,36,54,97,14};

    //开始排序
    public static void startSort(){
        //循环遍历数组的长度，  ------- 外层控制轮数
        for (int i = 0; i < array.length - 1; i++) {

            //内层控制的数每轮循环比较的次数  ------- 内层比较的次数
            for (int j = 0; j < array.length - i - 1; j++) {

                //开始比较， 如果前面的大于后面的，就替换位置。
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        //打印输出结果。
        System.out.println("使用冒泡排序算法:"+Arrays.toString(array));
    }
}
