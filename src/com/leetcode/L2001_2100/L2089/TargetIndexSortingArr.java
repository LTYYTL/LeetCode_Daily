package com.leetcode.L2001_2100.L2089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089. 找出数组排序后的目标下标
 * 给你一个下标从 0 开始的整数数组 nums 以及一个目标元素 target 。
 * 目标下标 是一个满足 nums[i] == target 的下标 i 。
 * 将 nums 按 非递减 顺序排序后，返回由 nums 中目标下标组成的列表。如果不存在目标下标，返回一个 空 列表。返回的列表必须按 递增 顺序排列。
 *
 * 示例 1：
 * 输入：nums = [1,2,5,2,3], target = 2
 * 输出：[1,2]
 * 解释：排序后，nums 变为 [1,2,2,3,5] 。
 * 满足 nums[i] == 2 的下标是 1 和 2 。
 *
 * 示例 2：
 * 输入：nums = [1,2,5,2,3], target = 3
 * 输出：[3]
 * 解释：排序后，nums 变为 [1,2,2,3,5] 。
 * 满足 nums[i] == 3 的下标是 3 。
 *
 * 示例 3：
 * 输入：nums = [1,2,5,2,3], target = 5
 * 输出：[4]
 * 解释：排序后，nums 变为 [1,2,2,3,5] 。
 * 满足 nums[i] == 5 的下标是 4 。
 *
 * 示例 4：
 * 输入：nums = [1,2,5,2,3], target = 4
 * 输出：[]
 * 解释：nums 中不含值为 4 的元素。
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 1 <= nums[i], target <= 100
 */
public class TargetIndexSortingArr {
    /**
     * 方法：二分查找
     * @param nums
     * @param target
     * @return
     */
    public List<Integer> targetIndices(int[] nums, int target) {
        //结果
        List<Integer> res = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //查找最早出现的索引
        int index = binarySearch(nums,target);
        //索引为-1，表示没有出现
        if (index == -1)
            return res;
        //遍历直到不符合条件
        while (index < nums.length && nums[index] == target){
            res.add(index++);
        }
        return res;
    }


    private int binarySearch(int[] nums, int target) {
        //左、右指针
        int left = 0;
        int right = nums.length - 1;
        //遍历
        while (left <= right){
            //中间索引
            int mid = (right - left)/2 + left;
            if (nums[mid] == target){
                //寻找目标值最早出现的索引
                while (mid > 0 && nums[mid-1] == target)
                    mid--;
                return mid;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
