package com.leetcode.L2201_2300.L2270;


public class ArrayPartitionCountTest {
    public static void main(String[] args) {
        ArrayPartitionCount arrayPartitionCount = new ArrayPartitionCount();
        /*
         * 示例 1：
         * 输入：nums = [10,4,-8,7]
         * 输出：2
         * 解释：
         * 总共有 3 种不同的方案可以将 nums 分割成两个非空的部分：
         * - 在下标 0 处分割 nums 。那么第一部分为 [10] ，和为 10 。第二部分为 [4,-8,7] ，和为 3 。因为 10 >= 3 ，所以 i = 0 是一个合法的分割。
         * - 在下标 1 处分割 nums 。那么第一部分为 [10,4] ，和为 14 。第二部分为 [-8,7] ，和为 -1 。因为 14 >= -1 ，所以 i = 1 是一个合法的分割。
         * - 在下标 2 处分割 nums 。那么第一部分为 [10,4,-8] ，和为 6 。第二部分为 [7] ，和为 7 。因为 6 < 7 ，所以 i = 2 不是一个合法的分割。
         * 所以 nums 中总共合法分割方案受为 2 。
         */
        System.out.println(arrayPartitionCount.waysToSplitArray(new int[]{10, 4, -8, 7}));
        /*
         * 示例 2：
         * 输入：nums = [2,3,1,0]
         * 输出：2
         * 解释：
         * 总共有 2 种 nums 的合法分割：
         * - 在下标 1 处分割 nums 。那么第一部分为 [2,3] ，和为 5 。第二部分为 [1,0] ，和为 1 。因为 5 >= 1 ，所以 i = 1 是一个合法的分割。
         * - 在下标 2 处分割 nums 。那么第一部分为 [2,3,1] ，和为 6 。第二部分为 [0] ，和为 0 。因为 6 >= 0 ，所以 i = 2 是一个合法的分割。
         */
        System.out.println(arrayPartitionCount.waysToSplitArray(new int[]{2, 3, 1, 0}));
    }
}
