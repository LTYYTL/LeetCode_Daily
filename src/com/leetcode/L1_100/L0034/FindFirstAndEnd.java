package com.leetcode.L1_100.L0034;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *
 * 示例 1：
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 *
 * 示例 2：
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 *
 * 示例 3：
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 * 提示：
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 */
public class FindFirstAndEnd {
    public int[] searchRange(int[] nums, int target) {
        //开始位置
        int begin = -1;
        //结束位置
        int end = -1;

        //二分查找
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        //用于标识是否找到目标值
        boolean flag = false;
        while (low <= high){
            mid = (high + low)/2;
            int temp = nums[mid];
            if (temp > target)
                high = mid - 1;
            else if (temp < target)
                low = mid + 1;
            else if (target == temp){
                flag = true;
                break;
            }
        }
        //找到目标值，以当前目标值的索引为中心，向左右两边寻找开始索引位置和结束索引位置
        if (flag){
            begin = mid;
            end = mid;
            //向左找开始索引位置
            while (begin - 1 >=0 && nums[begin - 1] == target)
                begin--;
            //向右找结束索引位置
            while (end + 1 <= nums.length -1 && nums[end + 1] == target)
                end++;
            return new int[]{begin,end};
        }else {
            return new int[]{-1,-1};
        }

    }
}
