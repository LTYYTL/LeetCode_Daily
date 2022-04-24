package com.leetcode.L301_400.L0396;

public class RotateFunctionTest {
    public static void main(String[] args) {
        RotateFunction rotateFunction = new RotateFunction();
        /**
         * 示例 1:
         * 输入: nums = [4,3,2,6]
         * 输出: 26
         * 解释:
         * F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
         * F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
         * F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
         * F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
         * 所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
         */
        System.out.println(rotateFunction.maxRotateFunction(new int[]{4, 3, 2, 6}));
        /**
         * 示例 2:
         * 输入: nums = [100]
         * 输出: 0
         */
        System.out.println(rotateFunction.maxRotateFunction(new int[]{100}));
    }
}
