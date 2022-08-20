package com.leetcode.L901_1000.L0930;

public class BinarySubarraysWithSumTest {
    public static void main(String[] args) {
        BinarySubarraysWithSum binarySubarraysWithSum = new BinarySubarraysWithSum();
        /*
          示例 1：
          输入：nums = [1,0,1,0,1], goal = 2
          输出：4
          解释：
          有 4 个满足题目要求的子数组：[1,0,1]、[1,0,1,0]、[0,1,0,1]、[1,0,1]
         */
        System.out.println(binarySubarraysWithSum.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
        System.out.println(binarySubarraysWithSum.numSubarraysWithSum_map(new int[]{1, 0, 1, 0, 1}, 2));
        /*
          示例 2：
          输入：nums = [0,0,0,0,0], goal = 0
          输出：15
         */
        System.out.println(binarySubarraysWithSum.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0));
        System.out.println(binarySubarraysWithSum.numSubarraysWithSum_map(new int[]{0, 0, 0, 0, 0}, 0));
    }
}
