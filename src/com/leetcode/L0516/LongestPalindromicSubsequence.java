package com.leetcode.L0516;

import java.util.Arrays;

/**
 * 516. 最长回文子序列
 * 给定一个字符串 s ，找到其中最长的回文子序列，并返回该序列的长度。可以假设 s 的最大长度为 1000 。
 *
 * 示例 1:
 * 输入:"bbbab"
 * 输出:4
 * 一个可能的最长回文子序列为 "bbbb"。
 *
 * 示例 2:
 * 输入:"cbbd"
 * 输出:2
 * 一个可能的最长回文子序列为 "bb"。
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 只包含小写英文字母
 */
public class LongestPalindromicSubsequence {
    /**
     * 方法：动态规划
     * 作者：sdwwld
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-subsequence/solution/shu-ju-jie-gou-he-suan-fa-dong-tai-gui-h-3oqf/
     * @param s
     * @return
     */
    public int longestPalindromeSubseq(String s) {
        int length = s.length();
        int[][] dp = new int[length][length];
        //这里i要从最后一个开始遍历
        for (int i = length - 1; i >= 0; i--) {
            //单个字符也是一个回文串
            dp[i][i] = 1;
            //j从i的下一个开始
            for (int j = i + 1; j < length; j++) {
                //下面是递推公式
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][length - 1];
    }

    /**
     * 方法：动态规划+状态压缩
     * @param s
     * @return
     */
    public int longestPalindromeSubseq_dp(String s) {
        int length = s.length();
        int[] dp = new int[length];
        Arrays.fill(dp,1);
        //这里i要从最后一个开始遍历
        for (int i = length - 2; i >= 0; i--) {
            int pre = 0;
            //j从i的下一个开始
            for (int j = i + 1; j < length; j++) {
                int temp = dp[j];
                //下面是递推公式
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = pre + 2;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                pre = temp;
            }
        }
        return dp[length - 1];
    }
}
