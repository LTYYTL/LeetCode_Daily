package com.leetcode.L2001_2100.L2089;

public class TargetIndexSortingArrTest {
    public static void main(String[] args) {
        TargetIndexSortingArr targetIndexSortingArr = new TargetIndexSortingArr();
        /**
         * 示例 1：
         * 输入：nums = [1,2,5,2,3], target = 2
         * 输出：[1,2]
         * 解释：排序后，nums 变为 [1,2,2,3,5] 。
         * 满足 nums[i] == 2 的下标是 1 和 2 。
         */
        System.out.println(targetIndexSortingArr.targetIndices(new int[]{1, 2, 5, 2, 3}, 2));
        /**
         * 示例 2：
         * 输入：nums = [1,2,5,2,3], target = 3
         * 输出：[3]
         * 解释：排序后，nums 变为 [1,2,2,3,5] 。
         * 满足 nums[i] == 3 的下标是 3 。
         */
        System.out.println(targetIndexSortingArr.targetIndices(new int[]{1, 2, 5, 2, 3}, 3));
        /**
         * 示例 3：
         * 输入：nums = [1,2,5,2,3], target = 5
         * 输出：[4]
         * 解释：排序后，nums 变为 [1,2,2,3,5] 。
         * 满足 nums[i] == 5 的下标是 4 。
         */
        System.out.println(targetIndexSortingArr.targetIndices(new int[]{1, 2, 5, 2, 3}, 5));
        /**
         * 示例 4：
         * 输入：nums = [1,2,5,2,3], target = 4
         * 输出：[]
         * 解释：nums 中不含值为 4 的元素。
         */
        System.out.println(targetIndexSortingArr.targetIndices(new int[]{1, 2, 5, 2, 3}, 4));
    }
}
