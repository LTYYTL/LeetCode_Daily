package com.leetcode.L501_600.L0560;

public class SubarraySumEqualsKTest {
    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        /*
          示例 1：
          输入：nums = [1,1,1], k = 2
          输出：2
         */
        System.out.println(subarraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2));
        /*
          示例 2：
          输入：nums = [1,2,3], k = 3
          输出：2
         */
        System.out.println(subarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 3));
    }
}
