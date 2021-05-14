package com.leetcode.L1269;

public class NumberWaysStaySamePlaceAfterSomeStepsTest {
    public static void main(String[] args) {
        NumberWaysStaySamePlaceAfterSomeSteps numberWaysStaySamePlaceAfterSomeSteps = new NumberWaysStaySamePlaceAfterSomeSteps();
        /** * 示例 1：
         * 输入：steps = 3, arrLen = 2
         * 输出：4
         * 解释：3 步后，总共有 4 种不同的方法可以停在索引 0 处。
         * 向右，向左，不动
         * 不动，向右，向左
         * 向右，不动，向左
         * 不动，不动，不动
         */
        System.out.println(numberWaysStaySamePlaceAfterSomeSteps.numWays(3, 2));
        /**
         * 示例  2：
         * 输入：steps = 2, arrLen = 4
         * 输出：2
         * 解释：2 步后，总共有 2 种不同的方法可以停在索引 0 处。
         * 向右，向左
         * 不动，不动
         */
        System.out.println(numberWaysStaySamePlaceAfterSomeSteps.numWays(2, 4));
        /**
         * 示例 3：
         * 输入：steps = 4, arrLen = 2
         * 输出：8
         */
        System.out.println(numberWaysStaySamePlaceAfterSomeSteps.numWays(4, 2));
    }
}
