package com.leetcode.L2201_2300.L2255;

public class PrefixStringCounterTest {
    public static void main(String[] args) {
        PrefixStringCounter prefixStringCounter = new PrefixStringCounter();
        /*
         * 示例 1：
         * 输入：words = ["a","b","c","ab","bc","abc"], s = "abc"
         * 输出：3
         * 解释：
         * words 中是 s = "abc" 前缀的字符串为：
         * "a" ，"ab" 和 "abc" 。
         * 所以 words 中是字符串 s 前缀的字符串数目为 3 。
         */
        System.out.println(prefixStringCounter.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"));
        /*
         * 示例 2：
         * 输入：words = ["a","a"], s = "aa"
         * 输出：2
         * 解释：
         * 两个字符串都是 s 的前缀。
         * 注意，相同的字符串可能在 words 中出现多次，它们应该被计数多次。
         */
        System.out.println(prefixStringCounter.countPrefixes(new String[]{"a","a"}, "aa"));

    }
}
