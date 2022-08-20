package com.leetcode.L1_100.L0053;

public class MaxSequenceSumTest {
    public static void main(String[] args) {
        MaxSequenceSum maxSequenceSum = new MaxSequenceSum();

        /*
          示例:
          输入: [-2,1,-3,4,-1,2,1,-5,4]
          输出: 6
          解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
         */
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //方法一：动态规划
        System.out.println(maxSequenceSum.maxSubArray(nums));
        //方法二：动态规划 + 空间优化（原地修改）
        System.out.println(maxSequenceSum.maxSubArray_zeroStructure(nums));
    }
}
