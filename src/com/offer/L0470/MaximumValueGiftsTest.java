package com.offer.L0470;

public class MaximumValueGiftsTest {
    public static void main(String[] args) {
        MaximumValueGifts maximumValueGifts = new MaximumValueGifts();
        /**
         * 示例 1:
         * 输入:
         * [
         *   [1,3,1],
         *   [1,5,1],
         *   [4,2,1]
         * ]
         * 输出: 12
         * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
         */
        System.out.println(maximumValueGifts.maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
