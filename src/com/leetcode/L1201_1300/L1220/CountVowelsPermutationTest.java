package com.leetcode.L1201_1300.L1220;

public class CountVowelsPermutationTest {
    public static void main(String[] args) {
        CountVowelsPermutation countVowelsPermutation = new CountVowelsPermutation();
        /**
         * 示例 1：
         * 输入：n = 1
         * 输出：5
         * 解释：所有可能的字符串分别是："a", "e", "i" , "o" 和 "u"。
         */
        System.out.println(countVowelsPermutation.countVowelPermutation(1));
        /**
         * 示例 2：
         * 输入：n = 2
         * 输出：10
         * 解释：所有可能的字符串分别是："ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" 和 "ua"。
         */
        System.out.println(countVowelsPermutation.countVowelPermutation(2));
        /**
         * 示例 3：
         * 输入：n = 5
         * 输出：68
         */
        System.out.println(countVowelsPermutation.countVowelPermutation(5));
    }
}
