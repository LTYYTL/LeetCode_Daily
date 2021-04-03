package com.leetcode.L1143;

public class LongestCommonSubsequenceText {
    public static void main(String[] args) {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        /**
         * 示例 1：
         * 输入：text1 = "abcde", text2 = "ace"
         * 输出：3
         * 解释：最长公共子序列是 "ace" ，它的长度为 3 。
         */
        System.out.println(longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
        /**
         * 示例 2：
         * 输入：text1 = "abc", text2 = "abc"
         * 输出：3
         * 解释：最长公共子序列是 "abc" ，它的长度为 3 。
         */
        System.out.println(longestCommonSubsequence.longestCommonSubsequence("abc", "abc"));
        /**
         * 示例 3：
         * 输入：text1 = "abc", text2 = "def"
         * 输出：0
         * 解释：两个字符串没有公共子序列，返回 0 。
         */
        System.out.println(longestCommonSubsequence.longestCommonSubsequence("abc", "def"));
    }
}
