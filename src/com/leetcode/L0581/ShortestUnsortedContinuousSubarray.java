package com.leetcode.L0581;

import java.util.Arrays;

/**
 * 581. 最短无序连续子数组
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 *
 * 示例 1：
 * 输入：nums = [2,6,4,8,10,9,15]
 * 输出：5
 * 解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 *
 * 示例 2：
 * 输入：nums = [1,2,3,4]
 * 输出：0
 *
 * 示例 3：
 * 输入：nums = [1]
 * 输出：0
 *
 * 提示：
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 *
 * 进阶：你可以设计一个时间复杂度为 O(n) 的解决方案吗？
 */
public class ShortestUnsortedContinuousSubarray {
    /**
     * 方法一：排序
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        //复制数组
        int[] array = nums.clone();
        //排序
        Arrays.sort(array);
        //长度
        int n = array.length;
        //寻找左边界
        int i = 0;
        while (i < n && nums[i] == array[i]) ++i;
        //寻找右边界
        int j = n-1;
        while (j > i && nums[j] == array[j]) --j;

        return j-i+1;
    }

}
