package com.leetcode.L0014;

public class LongestCommonPrefixTest {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        /**
         * 示例 1:
         * 输入: ["flower","flow","flight"]
         * 输出: "fl"
         */
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
        //分治法
        System.out.println(longestCommonPrefix.longestCommonPrefix_divide(strs));
        /**
         * 示例 2:
         * 输入: ["dog","racecar","car"]
         * 输出: ""
         * 解释: 输入不存在公共前缀。
         */
        String[] strs1 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs1));
        //分治法
        System.out.println(longestCommonPrefix.longestCommonPrefix_divide(strs1));
    }
}
