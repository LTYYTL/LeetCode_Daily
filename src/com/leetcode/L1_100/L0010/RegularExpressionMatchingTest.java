package com.leetcode.L1_100.L0010;

public class RegularExpressionMatchingTest {
    public static void main(String[] args) {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        /**
         * 示例 1：
         * 输入：s = "aa" p = "a"
         * 输出：false
         * 解释："a" 无法匹配 "aa" 整个字符串。
         */
        System.out.println(regularExpressionMatching.isMatch("aa", "a"));
    }
}
