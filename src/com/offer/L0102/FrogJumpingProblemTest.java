package com.offer.L0102;

public class FrogJumpingProblemTest {
    public static void main(String[] args) {
        FrogJumpingProblem frogJumpingProblem = new FrogJumpingProblem();
        /**
         * 示例 1：
         * 输入：n = 2
         * 输出：2
         */
        System.out.println(frogJumpingProblem.numWays(2));
        /**
         * 示例 2：
         * 输入：n = 7
         * 输出：21
         */
        System.out.println(frogJumpingProblem.numWays(7));
        /**
         * 示例 3：
         * 输入：n = 0
         * 输出：1
         */
        System.out.println(frogJumpingProblem.numWays(0));
    }
}
