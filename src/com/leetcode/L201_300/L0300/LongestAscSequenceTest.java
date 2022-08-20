package com.leetcode.L201_300.L0300;

public class LongestAscSequenceTest {
    public static void main(String[] args) {
        LongestAscSequence longestAscSequence = new LongestAscSequence();
        /*
          示例:
          输入: [10,9,2,5,3,7,101,18]
          输出: 4
          解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
         */
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(longestAscSequence.lengthOfLIS(nums));
    }
}
