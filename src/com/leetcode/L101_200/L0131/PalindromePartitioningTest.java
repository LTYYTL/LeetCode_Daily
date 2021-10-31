package com.leetcode.L101_200.L0131;

public class PalindromePartitioningTest {
    public static void main(String[] args) {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        /**
         * 示例 1：
         * 输入：s = "aab"
         * 输出：[["a","a","b"],["aa","b"]]
         */
        System.out.println(palindromePartitioning.partition("aab"));
        /**
         * 示例 2：
         * 输入：s = "a"
         * 输出：[["a"]]
         */
        System.out.println(palindromePartitioning.partition("a"));
    }
}
