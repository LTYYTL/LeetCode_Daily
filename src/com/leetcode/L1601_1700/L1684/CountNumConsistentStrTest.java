package com.leetcode.L1601_1700.L1684;


public class CountNumConsistentStrTest {
    public static void main(String[] args) {
        CountNumConsistentStr countNumConsistentStr = new CountNumConsistentStr();
        /**
         * 示例 1：
         * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
         * 输出：2
         * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
         */
        System.out.println(countNumConsistentStr.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        /**
         * 示例 2：
         * 输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
         * 输出：7
         * 解释：所有字符串都是一致的。
         */
        System.out.println(countNumConsistentStr.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        /**
         * 示例 3：
         * 输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
         * 输出：4
         * 解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
         */
        System.out.println(countNumConsistentStr.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
}
