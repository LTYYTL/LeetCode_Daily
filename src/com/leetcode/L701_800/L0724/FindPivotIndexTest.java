package com.leetcode.L701_800.L0724;

public class FindPivotIndexTest {
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        /**示例 1：
         * 输入：nums = [1, 7, 3, 6, 5, 6]
         * 输出：3
         * 解释：
         * 索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
         * 同时, 3 也是第一个符合要求的中心索引。
         */
        System.out.println(findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        /**
         * 示例 2：
         * 输入：nums = [1, 2, 3]
         * 输出：-1
         * 解释：
         * 数组中不存在满足此条件的中心索引。
         */
        System.out.println(findPivotIndex.pivotIndex(new int[]{1, 2, 3}));
        /**
         * 示例 3：
         * 输入：nums = [2, 1, -1]
         * 输出：0
         * 解释：
         * 索引 0 左侧不存在元素，视作和为 0 ；右侧数之和为 1 + (-1) = 0 ，二者相等。
         */
        System.out.println(findPivotIndex.pivotIndex(new int[]{2, 1, -1}));
        /**
         * 示例 4：
         * 输入：nums = [0, 0, 0, 0, 1]
         * 输出：4
         * 解释：
         * 索引 4 左侧数之和为 0 ；右侧不存在元素，视作和为 0 ，二者相等。
         */
        System.out.println(findPivotIndex.pivotIndex(new int[]{0, 0, 0, 0, 1}));
    }
}
