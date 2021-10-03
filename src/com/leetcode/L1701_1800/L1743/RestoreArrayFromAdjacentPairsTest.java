package com.leetcode.L1701_1800.L1743;

import java.util.Arrays;

public class RestoreArrayFromAdjacentPairsTest {
    public static void main(String[] args) {
        RestoreArrayFromAdjacentPairs restoreArrayFromAdjacentPairs = new RestoreArrayFromAdjacentPairs();
        /**
         * 示例 1：
         * 输入：adjacentPairs = [[2,1],[3,4],[3,2]]
         * 输出：[1,2,3,4]
         * 解释：数组的所有相邻元素对都在 adjacentPairs 中。
         * 特别要注意的是，adjacentPairs[i] 只表示两个元素相邻，并不保证其 左-右 顺序。
         */
        System.out.println(Arrays.toString(restoreArrayFromAdjacentPairs.restoreArray(new int[][]{{2, 1}, {3, 4}, {3, 2}})));
        /**
         * 示例 2：
         * 输入：adjacentPairs = [[4,-2],[1,4],[-3,1]]
         * 输出：[-2,4,1,-3]
         * 解释：数组中可能存在负数。
         * 另一种解答是 [-3,1,4,-2] ，也会被视作正确答案。
         */
        System.out.println(Arrays.toString(restoreArrayFromAdjacentPairs.restoreArray(new int[][]{{4, -2}, {1, 4}, {-3, 1}})));
        /**
         * 示例 3：
         * 输入：adjacentPairs = [[100000,-100000]]
         * 输出：[100000,-100000]
         */
        System.out.println(Arrays.toString(restoreArrayFromAdjacentPairs.restoreArray(new int[][]{{100000, -100000}})));
    }
}
