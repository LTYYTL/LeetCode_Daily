package com.leetcode.L401_500.L0440;

public class KSmallestOrderTest {
    public static void main(String[] args) {
        KSmallestOrder kSmallestOrder = new KSmallestOrder();
        /**
         * 示例 1:
         * 输入: n = 13, k = 2
         * 输出: 10
         * 解释: 字典序的排列是 [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]，所以第二小的数字是 10。
         */
        System.out.println(kSmallestOrder.findKthNumber(13, 2));
        /**
         * 示例 2:
         * 输入: n = 1, k = 1
         * 输出: 1
         */
    }
}
