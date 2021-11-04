package com.offerII.L101;

public class PartitionStringSumTest {
    public static void main(String[] args) {
        PartitionStringSum partitionStringSum = new PartitionStringSum();
        /** * 示例 1:
         * 输入: [1, 5, 11, 5]
         * 输出: true
         * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
         */
        int[] nums1 = {1, 5, 11, 5};
        System.out.println(partitionStringSum.canPartition(nums1));
        /**
         * 示例 2:
         * 输入: [1, 2, 3, 5]
         * 输出: false
         * 解释: 数组不能分割成两个元素和相等的子集.
         */
        int[] nums2 = {1, 2, 3, 5};
        System.out.println(partitionStringSum.canPartition(nums2));
    }
}
