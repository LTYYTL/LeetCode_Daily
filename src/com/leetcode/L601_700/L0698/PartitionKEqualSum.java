package com.leetcode.L601_700.L0698;

import java.util.HashMap;
import java.util.Map;

/**
 * 698. 划分为k个相等的子集
 * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 *
 * 示例 1：
 * 输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 * 输出： True
 * 说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
 *
 * 示例 2:
 * 输入: nums = [1,2,3,4], k = 3
 * 输出: false
 *
 * 提示：
 * 1 <= k <= len(nums) <= 16
 * 0 < nums[i] < 10000
 * 每个元素的频率在 [1,4] 范围内
 */
public class PartitionKEqualSum {
    /**
     * 方法：回溯算法
     */
    public boolean canPartitionKSubsets(int[] nums, int k) {
        //特殊情况
        if (k > nums.length)
            return false;
        //计算和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        //是否能平分
        if (sum % k != 0)
            return false;

        //访问位
        int used = 0;
        //平均数
        int target = sum / k;
        //调用回溯算法
        return backtrack(k,0,nums,0,used,target);
    }

    //记录访问
    Map<Integer,Boolean> mono = new HashMap<>();
    private boolean backtrack(int k, int sum, int[] nums, int start, int used, int target) {
        //都装满
        if (k == 0)
            return true;
        //桶装满
        if (sum == target){
            //进入下一个tong
            boolean res = backtrack(k-1, 0, nums, 0, used, target);
            //记录访问
            mono.put(used,res);
            return res;
        }

        //已经访问过
        if (mono.containsKey(used))
            return mono.get(used);
        //遍历
        for (int i = start; i < nums.length; i++) {
            //当前数已经访问了
            if (((used>>i)&1) == 1)
                continue;
            //桶内总和
            if (nums[i] + sum > target)
                continue;

            //做选择
            used |= 1 << i;
            sum += nums[i];

            //调用回溯算法
            if (backtrack(k, sum, nums, start+1, used, target))
                return true;

            //撤下选择
            used ^= 1 << i;
            sum -= nums[i];
        }

        return false;
    }
}
