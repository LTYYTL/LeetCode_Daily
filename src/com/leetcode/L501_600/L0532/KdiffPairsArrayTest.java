package com.leetcode.L501_600.L0532;

public class KdiffPairsArrayTest {
    public static void main(String[] args) {
        KdiffPairsArray kdiffPairsArray = new KdiffPairsArray();
        /**
         * 示例 1：
         * 输入：nums = [3, 1, 4, 1, 5], k = 2
         * 输出：2
         * 解释：数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
         * 尽管数组中有两个 1 ，但我们只应返回不同的数对的数量。
         */
        System.out.println(kdiffPairsArray.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        /**
         * 示例 2：
         * 输入：nums = [1, 2, 3, 4, 5], k = 1
         * 输出：4
         * 解释：数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5) 。
         */
        System.out.println(kdiffPairsArray.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        /**
         * 示例 3：
         * 输入：nums = [1, 3, 1, 5, 4], k = 0
         * 输出：1
         * 解释：数组中只有一个 0-diff 数对，(1, 1) 。
         */
        System.out.println(kdiffPairsArray.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }
}
