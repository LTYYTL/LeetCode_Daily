package com.leetcode.L1201_1300.L1218;

public class LongestSubsequenceDifferenceTest {
    public static void main(String[] args) {
        LongestSubsequenceDifference longestSubsequenceDifference = new LongestSubsequenceDifference();
        /*
          示例 1：
          输入：arr = [1,2,3,4], difference = 1
          输出：4
          解释：最长的等差子序列是 [1,2,3,4]。
         */
        System.out.println(longestSubsequenceDifference.longestSubsequence(new int[]{1, 2, 3, 4}, 1));
        /*
          示例 2：
          输入：arr = [1,3,5,7], difference = 1
          输出：1
          解释：最长的等差子序列是任意单个元素。
         */
        System.out.println(longestSubsequenceDifference.longestSubsequence(new int[]{1, 3, 5, 7}, 1));
        /*
          示例 3：
          输入：arr = [1,5,7,8,5,3,4,2,1], difference = -2
          输出：4
          解释：最长的等差子序列是 [7,5,3,1]。
         */
        System.out.println(longestSubsequenceDifference.longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2));
    }
}
