package com.leetcode.L0502;

public class PIOTest {
    public static void main(String[] args) {
        PIO pio = new PIO();
        /**
         * 示例 1：
         * 输入：k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
         * 输出：4
         * 解释：
         * 由于你的初始资本为 0，你仅可以从 0 号项目开始。
         * 在完成后，你将获得 1 的利润，你的总资本将变为 1。
         * 此时你可以选择开始 1 号或 2 号项目。
         * 由于你最多可以选择两个项目，所以你需要完成 2 号项目以获得最大的资本。
         * 因此，输出最后最大化的资本，为 0 + 1 + 3 = 4。
         */
        System.out.println(pio.findMaximizedCapital(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
        /**
         * 示例 2：
         * 输入：k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
         * 输出：6
         */
        System.out.println(pio.findMaximizedCapital(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}));
    }
}
