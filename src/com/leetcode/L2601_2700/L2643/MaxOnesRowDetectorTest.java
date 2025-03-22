package com.leetcode.L2601_2700.L2643;

import com.util.ArrayUtil;

public class MaxOnesRowDetectorTest {
    public static void main(String[] args) {
        MaxOnesRowDetector maxOnesRowDetector = new MaxOnesRowDetector();
        /*
         * 示例 1：
         * 输入：mat = [[0,1],[1,0]]
         * 输出：[0,1]
         * 解释：两行中 1 的数量相同。所以返回下标最小的行，下标为 0 。该行 1 的数量为 1 。所以，答案为 [0,1] 。
         */
        System.out.println(ArrayUtil.toString(maxOnesRowDetector.rowAndMaximumOnes(new int[][]{{0, 1}, {1, 0}})));
        /*
         * 示例 2：
         * 输入：mat = [[0,0,0],[0,1,1]]
         * 输出：[1,2]
         * 解释：下标为 1 的行中 1 的数量最多。该行 1 的数量为 2 。所以，答案为 [1,2] 。
         */
        System.out.println(ArrayUtil.toString(maxOnesRowDetector.rowAndMaximumOnes(new int[][]{{0, 0, 0}, {0, 1, 1}})));

        /*
         * 示例 3：
         * 输入：mat = [[0,0],[1,1],[0,0]]
         * 输出：[1,2]
         * 解释：下标为 1 的行中 1 的数量最多。该行 1 的数量为 2 。所以，答案为 [1,2] 。
         */
        System.out.println(ArrayUtil.toString(maxOnesRowDetector.rowAndMaximumOnes(new int[][]{{0, 0}, {1, 1}, {0, 0}})));
    }
}
