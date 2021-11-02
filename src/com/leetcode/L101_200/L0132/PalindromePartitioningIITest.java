package com.leetcode.L101_200.L0132;

public class PalindromePartitioningIITest {
    public static void main(String[] args) {
        PalindromePartitioningII palindromePartitioningII = new PalindromePartitioningII();
        /**
         * 示例 1：
         * 输入：s = "aab"
         * 输出：1
         * 解释：只需一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
         */
        System.out.println(palindromePartitioningII.minCut("aab"));
        /**
         * 示例 2：
         * 输入：s = "a"
         * 输出：0
         */
        System.out.println(palindromePartitioningII.minCut("a"));
        /**
         * 示例 3：
         * 输入：s = "ab"
         * 输出：1
         */
        System.out.println(palindromePartitioningII.minCut("ab"));
    }
}
