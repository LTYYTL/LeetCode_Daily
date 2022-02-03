package com.leetcode.L1401_1500.L1414;

public class FindMinFibSumKTest {
    public static void main(String[] args) {
        FindMinFibSumK findMinFibSumK = new FindMinFibSumK();
        /**
         * 示例 1：
         * 输入：k = 7
         * 输出：2
         * 解释：斐波那契数字为：1，1，2，3，5，8，13，……
         * 对于 k = 7 ，我们可以得到 2 + 5 = 7 。
         */
        System.out.println(findMinFibSumK.findMinFibonacciNumbers(7));
        /**
         * 示例 2：
         * 输入：k = 10
         * 输出：2
         * 解释：对于 k = 10 ，我们可以得到 2 + 8 = 10 。
         */
        System.out.println(findMinFibSumK.findMinFibonacciNumbers(10));
        /**
         * 示例 3：
         * 输入：k = 19
         * 输出：3
         * 解释：对于 k = 19 ，我们可以得到 1 + 5 + 13 = 19 。
         */
        System.out.println(findMinFibSumK.findMinFibonacciNumbers(19));
    }
}
