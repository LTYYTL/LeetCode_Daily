package com.leetcode.L0292;

public class NimGameTest {
    public static void main(String[] args) {
        NimGame nimGame = new NimGame();
        /**
         * 示例 1：
         * 输入：n = 4
         * 输出：false
         * 解释：如果堆中有 4 块石头，那么你永远不会赢得比赛；
         *      因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
         */
        System.out.println(nimGame.canWinNim(4));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：true
         */
        System.out.println(nimGame.canWinNim(1));
        /**
         * 示例 3：
         * 输入：n = 2
         * 输出：true
         */
        System.out.println(nimGame.canWinNim(2));
    }
}
