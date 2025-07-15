package com.leetcode.L3101_3200.L3136;

public class ValidWordCheckerTest {
    public static void main(String[] args) {
        ValidWordChecker validWordChecker = new ValidWordChecker();
        /*
         * 示例 1：
         * 输入：word = "234Adas"
         * 输出：true
         * 解释：
         * 这个单词满足所有条件。
         */
        System.out.println(validWordChecker.isValid("234Adas"));
        /*
         * 示例 2：
         * 输入：word = "b3"
         * 输出：false
         * 解释：
         * 这个单词的长度少于 3 且没有包含元音字母。
         */
        System.out.println(validWordChecker.isValid("b3"));
        /*
         * 示例 3：
         * 输入：word = "a3$e"
         * 输出：false
         * 解释：
         * 这个单词包含了 '$' 字符且没有包含辅音字母。
         */
        System.out.println(validWordChecker.isValid("a3$e"));
    }
}
