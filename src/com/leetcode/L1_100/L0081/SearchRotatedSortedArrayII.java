package com.leetcode.L1_100.L0081;

/**
 * 81. 搜索旋转排序数组 II
 * 已知存在一个按非降序排列的整数数组 nums ，数组中的值不必互不相同。
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转 ，
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
 * 例如， [0,1,2,4,4,4,5,6,6,7] 在下标 5 处经旋转后可能变为 [4,5,6,6,7,0,1,2,4,4] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，请你编写一个函数来判断给定的目标值是否存在于数组中。
 * 如果 nums 中存在这个目标值 target ，则返回 true ，否则返回 false 。
 *
 * 示例 1：
 * 输入：nums = [2,5,6,0,0,1,2], target = 0
 * 输出：true
 *
 * 示例 2：
 * 输入：nums = [2,5,6,0,0,1,2], target = 3
 * 输出：false
 *
 * 提示：
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * 题目数据保证 nums 在预先未知的某个下标上进行了旋转
 * -104 <= target <= 104
 *
 * 进阶：
 * 这是 搜索旋转排序数组 的延伸题目，本题中的 nums  可能包含重复元素。
 * 这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？
 */
public class SearchRotatedSortedArrayII {
    /**
     * 方法：二分法
     * @param nums
     * @param target
     * @return
     */
    public boolean search(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
            return false;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end){
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[start] == nums[mid]){
                start++;
                continue;
            }
            //前部分有序
            if (nums[start] < nums[mid]){
                if (nums[mid] > target && nums[start] <= target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                //后部分有序
                if (nums[mid] < target && nums[end] >= target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        //一直没找到，返回false
        return false;
    }
}
