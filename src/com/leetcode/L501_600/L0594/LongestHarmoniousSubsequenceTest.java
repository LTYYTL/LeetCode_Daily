package com.leetcode.L501_600.L0594;

public class LongestHarmoniousSubsequenceTest {
    public static void main(String[] args) {
        LongestHarmoniousSubsequence longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();
        /*
          示例 1：
          输入：nums = [1,3,2,2,5,2,3,7]
          输出：5
          解释：最长的和谐子序列是 [3,2,2,2,3]
         */
        System.out.println(longestHarmoniousSubsequence.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        /*
          示例 2：
          输入：nums = [1,2,3,4]
          输出：2
         */
        System.out.println(longestHarmoniousSubsequence.findLHS(new int[]{1, 2, 3, 4}));
        /*
          示例 3：
          输入：nums = [1,1,1,1]
          输出：0
         */
        System.out.println(longestHarmoniousSubsequence.findLHS(new int[]{1, 1, 1, 1}));
    }
}
