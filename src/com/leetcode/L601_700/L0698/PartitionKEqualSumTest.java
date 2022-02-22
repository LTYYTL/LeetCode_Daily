package com.leetcode.L601_700.L0698;

public class PartitionKEqualSumTest {
    public static void main(String[] args) {
        PartitionKEqualSum partitionKEqualSum = new PartitionKEqualSum();
        /**
         * 示例 1：
         * 输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
         * 输出： True
         * 说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
         */
        System.out.println(partitionKEqualSum.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
        /**
         * 示例 2:
         * 输入: nums = [1,2,3,4], k = 3
         * 输出: false
         */
        System.out.println(partitionKEqualSum.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
    }
}
