package com.offer.L0531;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 *
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *
 * 限制：
 * 0 <= 数组长度 <= 50000
 * 注意：本题与主站 34 题相同（仅返回值不同）：<a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/</a>
 */
public class FindNumberSortedArrayI {
    /**
     * 方法：二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        //左边界
        int left = binarySearch(nums,target-1);
        //右边界
        int right = binarySearch(nums,target);
        if (left == right)
            return 0;
        return right - left;
    }

    /**
     * 二分查找（左闭右开）
     * @param nums
     * @param target
     * @return
     */
    private int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (right - left)/2 + left;
            if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] <= target){
                left = mid + 1;
            }
        }
        return left;
    }
}
