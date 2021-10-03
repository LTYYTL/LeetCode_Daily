package com.leetcode.L501_600.L0560;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为 K 的子数组
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回该数组中和为 k 的连续子数组的个数。
 *
 * 示例 1：
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 *
 * 示例 2：
 * 输入：nums = [1,2,3], k = 3
 * 输出：2
 *
 * 提示：
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 */
public class SubarraySumEqualsK {
    /**
     * 方法：前缀和
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        //存储前缀和
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        //个数
        int ans = 0;
        //前缀和
        int sum = 0;
        //遍历数组
        for (int num : nums) {
            //计算前缀和
            sum += num;
            //差值
            int diff = sum - k;
            //查看差值是否存在
            if (map.containsKey(diff))
                ans+=map.get(diff);
            //添加前缀和
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return ans;
    }
}
