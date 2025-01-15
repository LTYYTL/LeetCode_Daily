package com.leetcode.L3001_3100.L3066;

public class MinimumOperationsIITest {
    public static void main(String[] args) {
        MinimumOperationsII minimumOperationsII = new MinimumOperationsII();
        /*
         * 示例 1：
         * 输入：nums = [2,11,10,1,3], k = 10
         * 输出：2
         * 解释：第一次操作中，我们删除元素 1 和 2 ，然后添加 1 * 2 + 2 到 nums 中，nums 变为 [4, 11, 10, 3] 。
         * 第二次操作中，我们删除元素 3 和 4 ，然后添加 3 * 2 + 4 到 nums 中，nums 变为 [10, 11, 10] 。
         * 此时，数组中的所有元素都大于等于 10 ，所以我们停止操作。
         * 使数组中所有元素都大于等于 10 需要的最少操作次数为 2 。
         */
        System.out.println(minimumOperationsII.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        /*
         * 示例 2：
         * 输入：nums = [1,1,2,4,9], k = 20
         * 输出：4
         * 解释：第一次操作后，nums 变为 [2, 4, 9, 3] 。
         * 第二次操作后，nums 变为 [7, 4, 9] 。
         * 第三次操作后，nums 变为 [15, 9] 。
         * 第四次操作后，nums 变为 [33] 。
         * 此时，数组中的所有元素都大于等于 20 ，所以我们停止操作。
         * 使数组中所有元素都大于等于 20 需要的最少操作次数为 4 。
         */
        System.out.println(minimumOperationsII.minOperations(new int[]{1, 1, 2, 4, 9}, 20));
    }
}
