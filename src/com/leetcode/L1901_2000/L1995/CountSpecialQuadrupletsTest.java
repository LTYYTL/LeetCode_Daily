package com.leetcode.L1901_2000.L1995;

public class CountSpecialQuadrupletsTest {
    public static void main(String[] args) {
        CountSpecialQuadruplets countSpecialQuadruplets = new CountSpecialQuadruplets();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3,6]
         * 输出：1
         * 解释：满足要求的唯一一个四元组是 (0, 1, 2, 3) 因为 1 + 2 + 3 == 6 。
         */
        System.out.println(countSpecialQuadruplets.countQuadruplets(new int[]{1, 2, 3, 6}));
        System.out.println(countSpecialQuadruplets.countQuadruplets_map(new int[]{1, 2, 3, 6}));
        /**
         * 示例 2：
         * 输入：nums = [3,3,6,4,5]
         * 输出：0
         * 解释：[3,3,6,4,5] 中不存在满足要求的四元组。
         */
        System.out.println(countSpecialQuadruplets.countQuadruplets(new int[]{3, 3, 6, 4, 5}));
        System.out.println(countSpecialQuadruplets.countQuadruplets_map(new int[]{3, 3, 6, 4, 5}));
        /**
         * 示例 3：
         * 输入：nums = [1,1,1,3,5]
         * 输出：4
         * 解释：满足要求的 4 个四元组如下：
         * - (0, 1, 2, 3): 1 + 1 + 1 == 3
         * - (0, 1, 3, 4): 1 + 1 + 3 == 5
         * - (0, 2, 3, 4): 1 + 1 + 3 == 5
         * - (1, 2, 3, 4): 1 + 1 + 3 == 5
         */
        System.out.println(countSpecialQuadruplets.countQuadruplets(new int[]{1, 1, 1, 3, 5}));
        System.out.println(countSpecialQuadruplets.countQuadruplets_map(new int[]{1, 1, 1, 3, 5}));
    }
}
