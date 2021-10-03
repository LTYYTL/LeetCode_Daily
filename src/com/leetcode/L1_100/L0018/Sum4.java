package com.leetcode.L1_100.L0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] ：
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 *
 * 示例 1：
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * 示例 2：
 * 输入：nums = [2,2,2,2,2], target = 8
 * 输出：[[2,2,2,2]]
 *
 * 提示：
 * 1 <= nums.length <= 200
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 */
public class Sum4 {
    /**
     * 方法：双指针
     * @param nums
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        //四数和为0，从nums【0】开始
        return nSum(nums,4,target,0);
    }

    /**
     * n数和模板
     * @param nums 排序数组
     * @param n    个数
     * @param target 目标值
     * @param start  开始位置
     * @return
     */
    private List<List<Integer>> nSum(int[] nums,int n,int target,int start){
        //结果
        List<List<Integer>> res = new ArrayList<>();
        //数组长度
        int size = nums.length;
        //特殊情况
        if (size < 2 || n < 2)
            return res;
        //两数和，双指针
        if (n == 2){
            int low = start;
            int high = size-1;
            while (low < high){
                //和
                int sum = nums[low] + nums[high];
                int left = nums[low];
                int right = nums[high];
                if (sum < target){
                    while (low < high && nums[low] == left) low++;//去重
                }else if (sum > target){
                    while (low < high && nums[high] == right) high--;//去重
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(left);
                    list.add(right);
                    res.add(list);
                    while (low < high && nums[low] == left) low++;//去重
                    while (low < high && nums[high] == right) high--;//去重
                }

            }
        }else {
            //固定nums[i]
            for (int i = start; i < size; i++) {
                List<List<Integer>> arr = nSum(nums, n - 1, target - nums[i], i + 1);
                for (List<Integer> list : arr) {
                    list.add(nums[i]);
                    res.add(list);
                }
                //去重
                while (i < size-1 && nums[i] == nums[i+1]) i++;
            }
        }
        return res;
    }
}
