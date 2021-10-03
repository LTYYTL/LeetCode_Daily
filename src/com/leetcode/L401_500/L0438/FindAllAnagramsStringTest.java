package com.leetcode.L401_500.L0438;

public class FindAllAnagramsStringTest {
    public static void main(String[] args) {
        FindAllAnagramsString findAllAnagramsString = new FindAllAnagramsString();
        /** * 示例 1:
         * 输入:
         * s: "cbaebabacd" p: "abc"
         * 输出:
         * [0, 6]
         * 解释:
         * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
         * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
         */
        System.out.println(findAllAnagramsString.findAnagrams("cbaebabacd", "abc"));
        /**
         * 示例 2:
         * 输入:
         * s: "abab" p: "ab"
         * 输出:
         * [0, 1, 2]
         * 解释:
         * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
         * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
         * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
         */
        System.out.println(findAllAnagramsString.findAnagrams("abab", "ab"));
    }
}
