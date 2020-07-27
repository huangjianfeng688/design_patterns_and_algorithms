package com.huanletao.Algorithms.sort;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/27
 * @Time: 17:05
 * Description: 在子数组中，找出最大和的连续子数组。
 */
public class FindMaxArray {

    public static void main(String[] args) {
       int[] nums = {1,-2,5,-5,7,8};
        maxSubArray2(nums);
    }


    //贪心算法。
    private static void maxSubArray2(int[] nums) {
        int sum = 0;
        int res = Integer.MIN_VALUE;

        for (int num : nums) {
            if (sum < 0 ){
                sum = 0;
            }
            sum+=num;
            res = Math.max(res,sum);
        }

        System.out.println(res);
    }

    //动态规划算法。
    private static void maxSubArray(int[] nums) {
        int dp = 0;
        int res = Integer.MIN_VALUE;

        for (int i = 1; i <= nums.length; i++) {
            dp = Math.max(dp,0) + nums[i-1] ;
            res = Math.max(res,dp);
        }
        System.out.println(res);
    }




}
