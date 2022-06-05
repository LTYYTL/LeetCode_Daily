package com.leetcode.L401_500.L0467;

public class UniqueSubstringsWraparoundTest {
    public static void main(String[] args) {
        UniqueSubstringsWraparound uniqueSubstringsWraparound = new UniqueSubstringsWraparound();
        /**
         * 示例 1：
         * 输入：p = "a"
         * 输出：1
         * 解释：字符串 s 中只有 p 的一个 "a" 子字符。
         */
        System.out.println(uniqueSubstringsWraparound.findSubstringInWraproundString("a"));
        /**
         * 示例 2：
         * 输入：p = "cac"
         * 输出：2
         * 解释：字符串 s 中只有 p 的两个子串 ("a", "c") 。
         */
        System.out.println(uniqueSubstringsWraparound.findSubstringInWraproundString("cac"));
        /**
         * 示例 3：
         * 输入：p = "zab"
         * 输出：6
         * 解释：在字符串 s 中有 p 的六个子串 ("z", "a", "b", "za", "ab", "zab") 。
         */
        System.out.println(uniqueSubstringsWraparound.findSubstringInWraproundString("zab"));
    }

}
