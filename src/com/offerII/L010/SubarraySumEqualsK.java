package com.offerII.L010;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer II 010. 和为 k 的子数组
 * 给定一个整数数组和一个整数 k ，请找到该数组中和为 k 的连续子数组的个数。
 *
 * 示例 1 :
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2
 * 解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
 *
 * 示例 2 :
 * 输入:nums = [1,2,3], k = 3
 * 输出: 2
 *
 * 提示:
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 *
 * 注意：本题与主站 560 题相同： <a href="https://leetcode-cn.com/problems/subarray-sum-equals-k/">https://leetcode-cn.com/problems/subarray-sum-equals-k/</a>
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
