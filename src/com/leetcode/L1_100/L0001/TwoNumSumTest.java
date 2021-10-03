package com.leetcode.L1_100.L0001;

import java.util.Arrays;

public class TwoNumSumTest {
    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        /**
         * 示例:
         * 给定 nums = [2, 7, 11, 15], target = 9
         * 因为 nums[0] + nums[1] = 2 + 7 = 9
         * 所以返回 [0, 1]
         */
        int[] nums = {2, 7, 11, 15};
        //方法一：暴力法
        System.out.println(Arrays.toString(twoNumSum.twoSum(nums,9)));
        //方法二：map法
        System.out.println(Arrays.toString(twoNumSum.twoSum_hash(nums,9)));
    }
}
