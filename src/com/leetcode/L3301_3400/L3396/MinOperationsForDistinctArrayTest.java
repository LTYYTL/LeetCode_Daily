package com.leetcode.L3301_3400.L3396;

public class MinOperationsForDistinctArrayTest {
    public static void main(String[] args) {
        MinOperationsForDistinctArray minOperationsForDistinctArray = new MinOperationsForDistinctArray();
        /*
         * 示例 1：
         * 输入： nums = [1,2,3,4,2,3,3,5,7]
         * 输出： 2
         * 解释：
         * 第一次操作：移除前 3 个元素，数组变为 [4, 2, 3, 3, 5, 7]。
         * 第二次操作：再次移除前 3 个元素，数组变为 [3, 5, 7]，此时数组中的元素互不相同。
         * 因此，答案是 2。
         */
        System.out.println(minOperationsForDistinctArray.minimumOperations(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7}));
        /*
         * 示例 2：
         * 输入： nums = [4,5,6,4,4]
         * 输出： 2
         * 解释：
         * 第一次操作：移除前 3 个元素，数组变为 [4, 4]。
         * 第二次操作：移除所有剩余元素，数组变为空。
         * 因此，答案是 2。
         */
        System.out.println(minOperationsForDistinctArray.minimumOperations(new int[]{4, 5, 6, 4, 4}));
        /*
         * 示例 3：
         * 输入： nums = [6,7,8,9]
         * 输出： 0
         * 解释：
         * 数组中的元素已经互不相同，因此不需要进行任何操作，答案是 0。
         */
        System.out.println(minOperationsForDistinctArray.minimumOperations(new int[]{6, 7, 8, 9}));
    }
}
