package com.offerII.L017;

public class MinimumWindowSubstringTest {
    public static void main(String[] args) {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        /**
         *  示例 1：
         * 输入：s = "ADOBECODEBANC", t = "ABC"
         * 输出："BANC"
         * 解释：最短子字符串 "BANC" 包含了字符串 t 的所有字符 'A'、'B'、'C'
         */
        System.out.println(minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
        /**
         * 示例 2：
         * 输入：s = "a", t = "a"
         * 输出："a"
         */
        System.out.println(minimumWindowSubstring.minWindow("a", "a"));
        /**
         * 示例 3：
         * 输入：s = "a", t = "aa"
         * 输出：""
         * 解释：t 中两个字符 'a' 均应包含在 s 的子串中，因此没有符合条件的子字符串，返回空字符串。
         */
        System.out.println(minimumWindowSubstring.minWindow("a", "aa"));
    }
}
