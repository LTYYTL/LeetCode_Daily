package com.leetcode.L301_400.L0386;

public class LexicographicalNumbersTest {
    public static void main(String[] args) {
        LexicographicalNumbers lexicographicalNumbers = new LexicographicalNumbers();
        /**
         * 示例 1
         * 输入：n = 13
         * 输出：[1,10,11,12,13,2,3,4,5,6,7,8,9]
         */
        System.out.println(lexicographicalNumbers.lexicalOrder(13));
        /**
         * 示例 2：
         * 输入：n = 2
         * 输出：[1,2]
         */
        System.out.println(lexicographicalNumbers.lexicalOrder(2));
    }
}
