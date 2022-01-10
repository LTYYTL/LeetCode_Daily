package com.leetcode.L301_400.L0306;

public class AdditiveNumberTest {
    public static void main(String[] args) {
        AdditiveNumber additiveNumber = new AdditiveNumber();
        /**
         * 示例 1：
         * 输入："112358"
         * 输出：true
         * 解释：累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
         */
        System.out.println(additiveNumber.isAdditiveNumber("112358"));
        /**
         * 示例 2：
         * 输入："199100199"
         * 输出：true
         * 解释：累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199
         */
        System.out.println(additiveNumber.isAdditiveNumber("199100199"));
    }
}
