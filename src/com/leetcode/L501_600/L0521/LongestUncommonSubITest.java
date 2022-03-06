package com.leetcode.L501_600.L0521;

public class LongestUncommonSubITest {
    public static void main(String[] args) {
        LongestUncommonSubI longestUncommonSubI = new LongestUncommonSubI();
        /**
         * 示例 1：
         * 输入: a = "aba", b = "cdc"
         * 输出: 3
         * 解释: 最长特殊序列可为 "aba" (或 "cdc")，两者均为自身的子序列且不是对方的子序列。
         */
        System.out.println(longestUncommonSubI.findLUSlength("aba", "cdc"));
        /**
         * 示例 2：
         * 输入：a = "aaa", b = "bbb"
         * 输出：3
         * 解释: 最长特殊序列是 "aaa" 和 "bbb" 。
         */
        System.out.println(longestUncommonSubI.findLUSlength("aaa", "bbb"));
        /**
         * 示例 3：
         * 输入：a = "aaa", b = "aaa"
         * 输出：-1
         * 解释: 字符串 a 的每个子序列也是字符串 b 的每个子序列。同样，字符串 b 的每个子序列也是字符串 a 的子序列。
         */
        System.out.println(longestUncommonSubI.findLUSlength("aaa", "aaa"));
    }
}
