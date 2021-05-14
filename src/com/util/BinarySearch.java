package com.util;

/**
 * 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 * 示例 2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 * 提示：
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class BinarySearch {
    /**
     * 基本二分查找
     * @param nums
     * @param target
     * @return
     */
    public int binary_search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        //搜索范围：[left,right]
        while (left <= right){
            //防止溢出
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 寻找左边界的二分查找
     * @param nums
     * @param target
     * @return
     */
    public int left_bound(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                //收缩右边界，锁定左边界
                right = mid -1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }
        }

        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }

    /**
     * 寻找右边界的二分查找
     * @param nums
     * @param target
     * @return
     */
    public int right_bound(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                //收缩左边界，锁定右边界
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }
        }

        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }
}
