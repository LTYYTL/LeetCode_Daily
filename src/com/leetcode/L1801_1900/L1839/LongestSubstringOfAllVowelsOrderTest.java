package com.leetcode.L1801_1900.L1839;

public class LongestSubstringOfAllVowelsOrderTest {
    public static void main(String[] args) {
        LongestSubstringOfAllVowelsOrder longestSubstringOfAllVowelsOrder = new LongestSubstringOfAllVowelsOrder();
        /*** 示例 1：
         * 输入：word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
         * 输出：13
         * 解释：最长子字符串是 "aaaaeiiiiouuu" ，长度为 13 。
         */
        System.out.println(longestSubstringOfAllVowelsOrder.longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"));
        /**
         * 示例 2：
         * 输入：word = "aeeeiiiioooauuuaeiou"
         * 输出：5
         * 解释：最长子字符串是 "aeiou" ，长度为 5 。
         */
        System.out.println(longestSubstringOfAllVowelsOrder.longestBeautifulSubstring("aeeeiiiioooauuuaeiou"));
        /**
         * 示例 3：
         * 输入：word = "a"
         * 输出：0
         * 解释：没有美丽子字符串，所以返回 0 。
         */
        System.out.println(longestSubstringOfAllVowelsOrder.longestBeautifulSubstring("a"));
    }
}
