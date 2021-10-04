package com.offerII.L011;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer II 011. 0 和 1 个数相同的子数组
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 *
 * 示例 1:
 * 输入: nums = [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量 0 和 1 的最长连续子数组。
 *
 * 示例 2:
 * 输入: nums = [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量 0 和 1 的最长连续子数组。
 *
 * 提示：
 * 1 <= nums.length <= 105
 * nums[i] 不是 0 就是 1
 *
 * 注意：本题与主站 525 题相同： https://leetcode-cn.com/problems/contiguous-array/
 */
public class ContiguousArray {
    /**
     * 方法：前缀和
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        //key:值，value：索引
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int cur = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp == 0)
                cur--;
            if (temp == 1)
                cur++;
            if (map.containsKey(cur))
                res = Math.max(res,i-map.get(cur));
            else
                map.put(cur,i);
        }
        return res;
    }
}
