package com.leetcode.L1801_1900.L1887;

public class ReductionOperationsArrayEqualTest {
    public static void main(String[] args) {
        ReductionOperationsArrayEqual reductionOperationsArrayEqual = new ReductionOperationsArrayEqual();
        /**
         * 示例 1：
         * 输入：nums = [5,1,3]
         * 输出：3
         * 解释：需要 3 次操作使 nums 中的所有元素相等：
         * 1. largest = 5 下标为 0 。nextLargest = 3 。将 nums[0] 减少到 3 。nums = [3,1,3] 。
         * 2. largest = 3 下标为 0 。nextLargest = 1 。将 nums[0] 减少到 1 。nums = [1,1,3] 。
         * 3. largest = 3 下标为 2 。nextLargest = 1 。将 nums[2] 减少到 1 。nums = [1,1,1] 。
         */
        System.out.println(reductionOperationsArrayEqual.reductionOperations(new int[]{5, 1, 3}));
        /**
         * 示例 2：
         * 输入：nums = [1,1,1]
         * 输出：0
         * 解释：nums 中的所有元素已经是相等的。
         */
        System.out.println(reductionOperationsArrayEqual.reductionOperations(new int[]{1, 1, 1}));
        /**
         * 示例 3：
         * 输入：nums = [1,1,2,2,3]
         * 输出：4
         * 解释：需要 4 次操作使 nums 中的所有元素相等：
         * 1. largest = 3 下标为 4 。nextLargest = 2 。将 nums[4] 减少到 2 。nums = [1,1,2,2,2] 。
         * 2. largest = 2 下标为 2 。nextLargest = 1 。将 nums[2] 减少到 1 。nums = [1,1,1,2,2] 。
         * 3. largest = 2 下标为 3 。nextLargest = 1 。将 nums[3] 减少到 1 。nums = [1,1,1,1,2] 。
         * 4. largest = 2 下标为 4 。nextLargest = 1 。将 nums[4] 减少到 1 。nums = [1,1,1,1,1] 。
         */
        System.out.println(reductionOperationsArrayEqual.reductionOperations(new int[]{1, 1, 2, 2, 3}));
    }
}
