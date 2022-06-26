package com.leetcode.L1_100.L0017;

public class LetterCombinationsPhoneNumberTest {
    public static void main(String[] args) {
        LetterCombinationsPhoneNumber letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
        /**
         * 示例 1：
         * 输入：digits = "23"
         * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
         */
        System.out.println(letterCombinationsPhoneNumber.letterCombinations("23"));
        /**
         * 示例 2：
         * 输入：digits = ""
         * 输出：[]
         */
        System.out.println(letterCombinationsPhoneNumber.letterCombinations(""));
        /**
         * 示例 3：
         * 输入：digits = "2"
         * 输出：["a","b","c"]
         */
        System.out.println(letterCombinationsPhoneNumber.letterCombinations("22"));
    }
}
