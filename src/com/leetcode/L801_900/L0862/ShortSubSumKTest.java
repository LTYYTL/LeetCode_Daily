package com.leetcode.L801_900.L0862;

public class ShortSubSumKTest {
    public static void main(String[] args) {
        ShortSubSumK shortSubSumK = new ShortSubSumK();
        /*
          示例 1：
          输入：nums = [1], k = 1
          输出：1
         */
        System.out.println(shortSubSumK.shortestSubarray(new int[]{1}, 1));
        /*
          示例 2：
          输入：nums = [1,2], k = 4
          输出：-1
         */
        System.out.println(shortSubSumK.shortestSubarray(new int[]{1, 2}, 4));
        /*
          示例 3：
          输入：nums = [2,-1,2], k = 3
          输出：3
         */
        System.out.println(shortSubSumK.shortestSubarray(new int[]{2, -1, 2}, 3));
    }
}
