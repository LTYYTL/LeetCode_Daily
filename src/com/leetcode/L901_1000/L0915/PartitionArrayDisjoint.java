package com.leetcode.L901_1000.L0915;

/**
 * 915. 分割数组
 * 给定一个数组 nums ，将其划分为两个连续子数组 left 和 right， 使得：
 * (1)left 中的每个元素都小于或等于 right 中的每个元素。
 * (2)left 和 right 都是非空的。
 * (3)left 的长度要尽可能小。
 * 在完成这样的分组后返回 left 的 长度 。
 * <p>
 * 用例可以保证存在这样的划分方法。
 * <p>
 * 示例 1：
 * 输入：nums = [5,0,3,8,6]
 * 输出：3
 * 解释：left = [5,0,3]，right = [8,6]
 * <p>
 * 示例 2：
 * 输入：nums = [1,1,1,0,6,12]
 * 输出：4
 * 解释：left = [1,1,1,0]，right = [6,12]
 * <p>
 * 提示：
 * 2 <= nums.length <= 105
 * 0 <= nums[i] <= 106
 * 可以保证至少有一种方法能够按题目所描述的那样对 nums 进行划分。
 */
public class PartitionArrayDisjoint {
    /**
     * 方法：模拟
     */
    public int partitionDisjoint(int[] nums) {
        // 索引
        int index = 0;
        // 整个数组最大值
        int max = nums[0];
        // 左部分最大值
        int leftMax = max;
        // 遍历
        for (int i = 1; i < nums.length; i++) {
            // 当前数字
            int cur = nums[i];
            // 寻找临界索引
            if (leftMax > cur) {
                // 记录索引
                index = i;
                leftMax = max;
            } else {
                // 记录最大值
                max = Math.max(cur, max);
            }
        }

        return index + 1;
    }
}
