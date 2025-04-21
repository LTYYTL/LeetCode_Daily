package com.leetcode.L2101_2200.L2145;

public class HiddenArrayCounterTest {
    public static void main(String[] args) {
        HiddenArrayCounter hiddenArrayCounter = new HiddenArrayCounter();
        /*
         * 示例 1：
         * 输入：differences = [1,-3,4], lower = 1, upper = 6
         * 输出：2
         * 解释：符合要求的隐藏数组为：
         * - [3, 4, 1, 5]
         * - [4, 5, 2, 6]
         * 所以返回 2 。
         */
        System.out.println(hiddenArrayCounter.numberOfArrays(new int[]{1, -3, 4}, 1, 6));
        /*
         * 示例 2：
         * 输入：differences = [3,-4,5,1,-2], lower = -4, upper = 5
         * 输出：4
         * 解释：符合要求的隐藏数组为：
         * - [-3, 0, -4, 1, 2, 0]
         * - [-2, 1, -3, 2, 3, 1]
         * - [-1, 2, -2, 3, 4, 2]
         * - [0, 3, -1, 4, 5, 3]
         * 所以返回 4 。
         */
        System.out.println(hiddenArrayCounter.numberOfArrays(new int[]{3, -4, 5, 1, -2}, -4, 5));
        /*
         * 示例 3：
         * 输入：differences = [4,-7,2], lower = 3, upper = 6
         * 输出：0
         * 解释：没有符合要求的隐藏数组，所以返回 0 。
         */
        System.out.println(hiddenArrayCounter.numberOfArrays(new int[]{4, -7, 2}, 3, 6));
    }
}
