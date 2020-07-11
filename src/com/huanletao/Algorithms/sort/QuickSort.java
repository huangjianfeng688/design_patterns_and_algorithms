package com.huanletao.Algorithms.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: master huang
 * Date: 2019/10/31
 * Time: 10:09
 * Description:十大经典排序算法 ---  快速排序算法。
 *    算法思想：
 *1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
 * 2）以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
 * 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]互换；
 * 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]互换；
 * 5）重复第3、4步，直到i=j； (3,4步中，没找到符合条件的值，
 * 即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，
 * 直至找到为止。找到符合条件的值，进行交换的时候i， j指针位置不变。另外，
 * i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）
 *
 */
public class QuickSort {

    /**
     * 开始排序
     * @param array  传过来未排序的原始数组 , 左边的下标，右边的下标，
     * @return 返回排序成功的数组
     */
    public static void startSort(int[] array,int low,int high){
        int i,j,temp,t;
        //如果左边大于右边，就结束方法。
        if(low > high){ return;}

        i = low;
        j = high;

        //temp 就是基准位
        temp = array[low];

        //左右两边未相等，
        while (i < j){
            //先看右边，依次往左递减
            while (temp <= array[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= array[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = array[j];
                array[j] = array[i];
                array[i] = t;
            }

        }

        //最后将基准位与i和j相等位置的数字交换，
        array[low] = array[i];
        array[i] = temp;
        startSort(array,low,j-1);
        startSort(array,j+1,high);

        //返回排序后的数组。
    }


    public static void main(String[] args) {
        int[] array = {12,45,7,25,8,79,36,54,97,14};
        startSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }
}
