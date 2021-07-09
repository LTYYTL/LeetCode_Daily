package com.leetcode.L0930;

import java.util.HashMap;
import java.util.Map;

/**
 * 930. 和相同的二元子数组
 * 给你一个二元数组 nums ，和一个整数 goal ，请你统计并返回有多少个和为 goal 的 非空 子数组。
 * 子数组 是数组的一段连续部分。
 *
 * 示例 1：
 * 输入：nums = [1,0,1,0,1], goal = 2
 * 输出：4
 * 解释：
 * 有 4 个满足题目要求的子数组：[1,0,1]、[1,0,1,0]、[0,1,0,1]、[1,0,1]
 *
 * 示例 2：
 * 输入：nums = [0,0,0,0,0], goal = 0
 * 输出：15
 *
 * 提示：
 * 1 <= nums.length <= 3 * 104
 * nums[i] 不是 0 就是 1
 * 0 <= goal <= nums.length
 */
public class BinarySubarraysWithSum {
    /**
     * 方法一：滑动窗口
     * @param nums
     * @param goal
     * @return
     */
    public int numSubarraysWithSum(int[] nums, int goal) {
        //left1和left2之间有多个0
        int left1 = 0, left2 = 0, right = 0;
        int sum1 = 0, sum2 = 0;
        int res = 0;
        while (right < nums.length){
            int cur_right = nums[right];
            sum1 += cur_right;
            while (left1 <= right && sum1 > goal){
                sum1 -= nums[left1];
                left1++;
            }

            sum2 += cur_right;
            while (left2 <= right && sum2 >= goal){
                sum2 -= nums[left2];
                left2++;
            }
            //其中的每个0都算一种情况
            res += left2 - left1;
            //右边界
            right++;
        }
        return res;
    }

    public int numSubarraysWithSum_map(int[] nums, int goal) {
        int sum = 0;
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum += num;
            res += map.getOrDefault(sum - goal,0);
        }
        return res;
    }
}
