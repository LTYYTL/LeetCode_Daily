package com.leetcode.L701_800.L0728;

public class SelfDividingNumbersTest {
    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        /**
         * 示例 1：
         * 输入：left = 1, right = 22
         * 输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
         */
        System.out.println(selfDividingNumbers.selfDividingNumbers(1, 22));
        /**
         * 示例 2:
         * 输入：left = 47, right = 85
         * 输出：[48,55,66,77]
         */
        System.out.println(selfDividingNumbers.selfDividingNumbers(47, 85));
    }
}
