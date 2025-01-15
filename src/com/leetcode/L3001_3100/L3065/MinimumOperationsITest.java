package com.leetcode.L3001_3100.L3065;

public class MinimumOperationsITest {
    public static void main(String[] args) {
        MinimumOperationsI minimumOperationsI = new MinimumOperationsI();
        /*
         * 示例 1：
         * 输入：nums = [2,11,10,1,3], k = 10
         * 输出：3
         * 解释：第一次操作后，nums 变为 [2, 11, 10, 3] 。
         * 第二次操作后，nums 变为 [11, 10, 3] 。
         * 第三次操作后，nums 变为 [11, 10] 。
         * 此时，数组中的所有元素都大于等于 10 ，所以我们停止操作。
         * 使数组中所有元素都大于等于 10 需要的最少操作次数为 3 。
         */
        System.out.println(minimumOperationsI.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        /*
         * 示例 2：
         * 输入：nums = [1,1,2,4,9], k = 1
         * 输出：0
         * 解释：数组中的所有元素都大于等于 1 ，所以不需要对 nums 做任何操作。
         */
        System.out.println(minimumOperationsI.minOperations(new int[]{1, 1, 2, 4, 9}, 1));
        /*
         * 示例 3：
         * 输入：nums = [1,1,2,4,9], k = 9
         * 输出：4
         * 解释：nums 中只有一个元素大于等于 9 ，所以需要执行 4 次操作。
         */
        System.out.println(minimumOperationsI.minOperations(new int[]{1, 1, 2, 4, 9}, 9));
    }
}
