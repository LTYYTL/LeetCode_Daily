package com.leetcode.L2701_2800.L2717;

public class HalfOrderSeqTest {
    public static void main(String[] args) {
        HalfOrderSeq halfOrderSeq = new HalfOrderSeq();
        /*
         * 示例 1：
         *
         * 输入：nums = [2,1,4,3]
         * 输出：2
         * 解释：可以依次执行下述操作得到半有序排列：
         * 1 - 交换下标 0 和下标 1 对应元素。排列变为 [1,2,4,3] 。
         * 2 - 交换下标 2 和下标 3 对应元素。排列变为 [1,2,3,4] 。
         * 可以证明，要让 nums 成为半有序排列，不存在执行操作少于 2 次的方案。
         */
        System.out.println(halfOrderSeq.semiOrderedPermutation(new int[]{2, 1, 4, 3}));

        /*
         * 示例 2：
         * 输入：nums = [2,4,1,3]
         * 输出：3
         * 解释：
         * 可以依次执行下述操作得到半有序排列：
         * 1 - 交换下标 1 和下标 2 对应元素。排列变为 [2,1,4,3] 。
         * 2 - 交换下标 0 和下标 1 对应元素。排列变为 [1,2,4,3] 。
         * 3 - 交换下标 2 和下标 3 对应元素。排列变为 [1,2,3,4] 。
         * 可以证明，要让 nums 成为半有序排列，不存在执行操作少于 3 次的方案。
         */
        System.out.println(halfOrderSeq.semiOrderedPermutation(new int[]{2, 4, 1, 3}));

        /*
         * 示例 3：
         * 输入：nums = [1,3,4,2,5]
         * 输出：0
         * 解释：这个排列已经是一个半有序排列，无需执行任何操作。
         */
        System.out.println(halfOrderSeq.semiOrderedPermutation(new int[]{1, 3, 4, 2, 5}));
    }
}
