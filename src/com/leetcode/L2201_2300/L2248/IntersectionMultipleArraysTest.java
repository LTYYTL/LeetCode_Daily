package com.leetcode.L2201_2300.L2248;

public class IntersectionMultipleArraysTest {
    public static void main(String[] args) {
        IntersectionMultipleArrays intersectionMultipleArrays = new IntersectionMultipleArrays();
        /**
         * 示例 1：
         * 输入：nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
         * 输出：[3,4]
         * 解释：
         * nums[0] = [3,1,2,4,5]，nums[1] = [1,2,3,4]，nums[2] = [3,4,5,6]，在 nums 中每个数组中都出现的数字是 3 和 4 ，所以返回 [3,4] 。
         */
        System.out.println(intersectionMultipleArrays.intersection(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));
        /**
         * 示例 2：
         * 输入：nums = [[1,2,3],[4,5,6]]
         * 输出：[]
         * 解释：
         * 不存在同时出现在 nums[0] 和 nums[1] 的整数，所以返回一个空列表 [] 。
         */
        System.out.println(intersectionMultipleArrays.intersection(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
