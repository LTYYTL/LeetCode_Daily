package com.leetcode.L701_800.L0784;

public class LetterCasePermutationTest {
    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        /**
         * 示例：
         * 输入：S = "a1b2"
         * 输出：["a1b2", "a1B2", "A1b2", "A1B2"]
         */
        System.out.println(letterCasePermutation.letterCasePermutation("a1b2"));
        /**
         * 输入：S = "3z4"
         * 输出：["3z4", "3Z4"]
         */
        System.out.println(letterCasePermutation.letterCasePermutation("3z4"));
        /**
         * 输入：S = "12345"
         * 输出：["12345"]
         */
        System.out.println(letterCasePermutation.letterCasePermutation("12345"));
    }
}
