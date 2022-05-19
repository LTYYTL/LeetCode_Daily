package com.leetcode.L401_500.L0462;

public class MinMovesElementsIITest {
    public static void main(String[] args) {
        MinMovesElementsII minMovesElementsII = new MinMovesElementsII();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3]
         * 输出：2
         * 解释：
         * 只需要两步操作（每步操作指南使一个元素加 1 或减 1）：
         * [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
         */
        System.out.println(minMovesElementsII.minMoves2(new int[]{1, 2, 3}));
        /**
         * 示例 2：
         * 输入：nums = [1,10,2,9]
         * 输出：16
         */
        System.out.println(minMovesElementsII.minMoves2(new int[]{1, 10, 2, 9}));
    }
}
