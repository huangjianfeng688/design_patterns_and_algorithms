package com.huanletao.Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: master huang
 * Date: 2019/10/31
 * Time: 9:16
 * Description:十大经典排序算法---选择排序算法
 *      算法描述： 从给定排序的数组中，找出最小的元素放在第一个位置，
 *        接下来再从剩余的元素中找出最小元素放在第二个位置，
 */
public class SelectionSort {
    /**
     * 开始排序的方法。
     * @param array 传进来排序的原始数组
     * @return 返回排序好的数组。
     */
    public static int[] startSort(int[] array){
        //循环遍历 , 找出最小的元素，  -- 外层遍历除了第一个以外的所有元素，
        for (int i = 0; i < array.length; i++) {

            //先标记最小元素
            int min = array[i];
            int index = i;
            // 内层循环 -- 与它之后的每一个元素进行比对，找出最小元素。
            for (int j = i + 1; j < array.length; j++) {

                //开始对比。 如果出现比最小元素还小，就标记它为最小元素。
                if (min > array[j]){
                    index = j ;  // 同时记录下标
                    min = array[j];
                }
            }
            //判断是否找到有比自己更小的元素，如果没有，就不替换位置，有就替换位置，
            if (i != index) {
                //开始替换位置，
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }

        //返回排序的结果
        return array;
    }



}
