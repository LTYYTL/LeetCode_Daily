package com.leetcode.L1_100.L0035;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 示例 1:
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 *
 * 示例 2:
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 *
 * 示例 3:
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 *
 * 示例 4:
 * 输入: nums = [1,3,5,6], target = 0
 * 输出: 0
 *
 * 示例 5:
 * 输入: nums = [1], target = 0
 * 输出: 0
 *
 * 提示:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 为无重复元素的升序排列数组
 * -104 <= target <= 104
 */
public class SearchInsertPosition {
    /**
     * 方法：二分查找
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        //前后指针
        int left = 0;
        int right = nums.length - 1;

        //比第一个元素小
        if (target < nums[0]) {
            return 0;
        }
        //比最后一个元素大
        if (target>nums[right]) {
            return nums.length;
        }

        //二分查找
        while (left <= right){
            int mid = (right - left) / 2 + left;
            int cur = nums[mid];
            if (cur > target){
                right = mid-1;
            }else if (cur < target){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return left;
    }
}
