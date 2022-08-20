package com.leetcode.L601_700.L0689;

import java.util.Arrays;

public class MaxSum3NonOverSubTest {
    public static void main(String[] args) {
        MaxSum3NonOverSub maxSum3NonOverSub = new MaxSum3NonOverSub();
        /*
          示例 1：
          输入：nums = [1,2,1,2,6,7,5,1], k = 2
          输出：[0,3,5]
          解释：子数组 [1, 2], [2, 6], [7, 5] 对应的起始下标为 [0, 3, 5]。
          也可以取 [2, 1], 但是结果 [1, 3, 5] 在字典序上更大。
         */
        System.out.println(Arrays.toString(maxSum3NonOverSub.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 6, 7, 5, 1}, 2)));
        /*
          示例 2：
          输入：nums = [1,2,1,2,1,2,1,2,1], k = 2
          输出：[0,2,4]
         */
        System.out.println(Arrays.toString(maxSum3NonOverSub.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}, 2)));
    }
}
