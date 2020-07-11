package com.huanletao.Algorithms.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: master huang
 * Date: 2019/10/31
 * Time: 11:38
 * Description: 十大经典排序算法 --- 插入排序算法，
 *     算法思想：
 *     对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *     插入排序在实现上，在从后向前扫描过程中，
 *     需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 *
 *
 */
public class InsertSort {

    /**
     * 插入排序算法
     * @param array  为进行排序的数组集合
     */
    public static void startSort(int[] array){

        //遍历所有的元素集合，从第一个开始，
        for (int i = 1; i < array.length; i++) {

            //比较排序好的元素，进行对比。
            for (int j = i; j > 0; j--) {

                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(array));
    }
}
