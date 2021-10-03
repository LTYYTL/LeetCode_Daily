package com.leetcode.L401_500.L0413;

public class ArithmeticSlicesTest {
    public static void main(String[] args) {
        ArithmeticSlices arithmeticSlices = new ArithmeticSlices();
        /**示例 1：
         * 输入：nums = [1,2,3,4]
         * 输出：3
         * 解释：nums 中有三个子等差数组：[1, 2, 3]、[2, 3, 4] 和 [1,2,3,4] 自身。
         */
        System.out.println(arithmeticSlices.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
        /**
         * 示例 2：
         * 输入：nums = [1]
         * 输出：0
         */
        System.out.println(arithmeticSlices.numberOfArithmeticSlices(new int[]{1}));
    }
}
