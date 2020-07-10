package com.huanletao.Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: samsung
 * Date: 2019/10/31
 * Time: 11:53
 * Description: 实现交换两个数的方法。
 */
public class SwapRanking {

    //使用第三方变量，
    public static int[] swapPositionByOther(int[] arr,int frontIndex,int behindIndex){
        //开始交换位置，
        int temp = arr[frontIndex];
        arr[frontIndex] = arr[behindIndex];
        arr[behindIndex] = temp;

        return arr;
    }

    //不用第三方变量，使用加法。
    public static int[] swapPositionByAddition(int[] arr,int frontIndex,int behindIndex){
        arr[frontIndex] = arr[behindIndex] - arr[frontIndex];
        arr[behindIndex] = arr[behindIndex] - arr[frontIndex];
        arr[frontIndex] = arr[frontIndex] + arr[behindIndex];
        return arr;
    }

    //不用第三方变量，使用乘法。
    public static int[] swapPositionByMultiplication(int[] arr,int frontIndex,int behindIndex){
        arr[frontIndex] = arr[frontIndex] * arr[behindIndex];
        arr[behindIndex] = arr[frontIndex] / arr[behindIndex];
        arr[frontIndex] = arr[frontIndex] / arr[behindIndex];
        return arr;
    }

    //使用异或计算的方法，
    public static int[] swapPositionByXOR(int[] arr,int frontIndex,int behindIndex){
        arr[frontIndex] = arr[frontIndex] ^ arr[behindIndex];
        arr[behindIndex] = arr[frontIndex] ^ arr[behindIndex];
        arr[frontIndex] = arr[frontIndex] ^ arr[behindIndex];
        return arr;
    }

}
