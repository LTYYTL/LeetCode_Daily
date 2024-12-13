package com.leetcode.L3201_3300.L3264;

import java.util.Arrays;

public class KMultiplicationArrayITest {
    public static void main(String[] args) {
        KMultiplicationArrayI kMultiplicationArrayI = new KMultiplicationArrayI();
        /*
         * 示例 1：
         * 输入：nums = [2,1,3,5,6], k = 5, multiplier = 2
         * 输出：[8,4,6,5,6]
         *
         * 解释：
         * 操作	结果
         * 1 次操作后	[2, 2, 3, 5, 6]
         * 2 次操作后	[4, 2, 3, 5, 6]
         * 3 次操作后	[4, 4, 3, 5, 6]
         * 4 次操作后	[4, 4, 6, 5, 6]
         * 5 次操作后	[8, 4, 6, 5, 6]
         */
        System.out.println(Arrays.toString(kMultiplicationArrayI.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));

        /*
         * 示例 2：
         * 输入：nums = [1,2], k = 3, multiplier = 4
         * 输出：[16,8]
         *
         * 解释：
         * 操作	结果
         * 1 次操作后	[4, 2]
         * 2 次操作后	[4, 8]
         * 3 次操作后	[16, 8]
         */
        System.out.println(Arrays.toString(kMultiplicationArrayI.getFinalState(new int[]{1, 2}, 3, 4)));
    }
}
