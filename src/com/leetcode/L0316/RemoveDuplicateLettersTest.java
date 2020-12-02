package com.leetcode.L0316;

public class RemoveDuplicateLettersTest {
    public static void main(String[] args) {
        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();
        /**
         * 示例 1：
         * 输入：s = "bcabc"
         * 输出："abc"
         */
        System.out.println(removeDuplicateLetters.removeDuplicateLetters("bcabc"));
        /**
         * 示例 2：
         * 输入：s = "cbacdcbc"
         * 输出："acdb"
         */
        System.out.println(removeDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
    }
}
