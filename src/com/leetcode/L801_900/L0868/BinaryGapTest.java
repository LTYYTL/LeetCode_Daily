package com.leetcode.L801_900.L0868;

public class BinaryGapTest {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        /**
         * 示例 1：
         * 输入：n = 22
         * 输出：2
         * 解释：22 的二进制是 "10110" 。
         * 在 22 的二进制表示中，有三个 1，组成两对相邻的 1 。
         * 第一对相邻的 1 中，两个 1 之间的距离为 2 。
         * 第二对相邻的 1 中，两个 1 之间的距离为 1 。
         * 答案取两个距离之中最大的，也就是 2 。
         */
        System.out.println(binaryGap.binaryGap(22));
        /**
         * 示例 2：
         * 输入：n = 8
         * 输出：0
         * 解释：8 的二进制是 "1000" 。
         * 在 8 的二进制表示中没有相邻的两个 1，所以返回 0 。
         */
        System.out.println(binaryGap.binaryGap(8));
        /**
         * 示例 3：
         * 输入：n = 5
         * 输出：2
         * 解释：5 的二进制是 "101" 。
         */
        System.out.println(binaryGap.binaryGap(5));
    }
}
