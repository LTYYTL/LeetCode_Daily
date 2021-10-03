package com.leetcode.L501_600.L0516;

public class LongestPalindromicSubsequenceTest {
    public static void main(String[] args) {
        LongestPalindromicSubsequence longestPalindromicSubsequence = new LongestPalindromicSubsequence();
        /** * 示例 1:
         * 输入:"bbbab"
         * 输出:4
         * 一个可能的最长回文子序列为 "bbbb"。
         */
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq("bbbab"));
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq_dp("bbbab"));
        /**
         * 示例 2:
         * 输入:"cbbd"
         * 输出:2
         * 一个可能的最长回文子序列为 "bb"。
         */
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq("cbbd"));
        System.out.println(longestPalindromicSubsequence.longestPalindromeSubseq_dp("cbbd"));
    }
}
