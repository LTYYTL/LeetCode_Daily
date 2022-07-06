package com.leetcode.L1_100.L0031;

import java.util.Arrays;

/**
 * 31. 下一个排列
 * 整数数组的一个 排列  就是将其所有成员以序列或线性顺序排列。
 * 例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
 * 整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。
 * 更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。
 * 如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
 * 例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
 * 类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
 * 而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
 * 给你一个整数数组 nums ，找出 nums 的下一个排列。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 * <p>
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * <p>
 * 示例 3：
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * <p>
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
public class NextPermutation {
    /**
     * 方法：双指针
     *
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        //索引
        int minIndex = -1;
        //从后往前寻找升序
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                minIndex = i - 1;
                break;
            }
        }

        //没有升序直接排序
        if (minIndex == -1) {
            Arrays.sort(nums);
            return;
        }

        //从后往前寻找第一个比num[minIndex]大的数
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[minIndex]) {
                //交换位置
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
                break;
            }
        }

        //将后边排序
        Arrays.sort(nums, minIndex + 1, nums.length);
    }
}
