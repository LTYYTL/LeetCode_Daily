package com.leetcode.L301_400.L0384;

import java.util.Random;

/**
 * 384. 打乱数组
 * 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
 *
 * 实现 Solution class:
 * (1)Solution(int[] nums) 使用整数数组 nums 初始化对象
 * (2)int[] reset() 重设数组到它的初始状态并返回
 * (3)int[] shuffle() 返回数组随机打乱后的结果
 *
 * 示例：
 * 输入
 * ["Solution", "shuffle", "reset", "shuffle"]
 * [[[1, 2, 3]], [], [], []]
 * 输出
 * [null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]
 * 解释
 * Solution solution = new Solution([1, 2, 3]);
 * solution.shuffle();    // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。例如，返回 [3, 1, 2]
 * solution.reset();      // 重设数组到它的初始状态 [1, 2, 3] 。返回 [1, 2, 3]
 * solution.shuffle();    // 随机返回数组 [1, 2, 3] 打乱后的结果。例如，返回 [1, 3, 2]
 *
 * 提示：
 * 1 <= nums.length <= 200
 * -106 <= nums[i] <= 106
 * nums 中的所有元素都是 唯一的
 * 最多可以调用 5 * 104 次 reset 和 shuffle
 */
public class Solution {
    /**
     * 方法：洗牌算法
     */
    private int[] origin; // 初始数组
    private int[] nums;//随机数组
    private Random random;//随机数

    /**
     * 初始化
     * @param nums
     */
    public Solution(int[] nums) {
        this.origin = nums;
        this.nums = nums.clone();
        this.random = new Random();
    }

    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        //跟小于i位置的元素进行交换
        for (int i = nums.length; i > 1; i--) {
            swap(nums, i-1, random.nextInt(i));
        }
        return nums;
    }

    /**
     * 交换数组元素
     * @param nums
     * @param i
     * @param j
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
