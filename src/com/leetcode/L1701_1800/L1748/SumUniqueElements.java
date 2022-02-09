package com.leetcode.L1701_1800.L1748;

import java.util.HashMap;
import java.util.Map;

/**
 * 1748. 唯一元素的和
 * 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 * 请你返回 nums 中唯一元素的 和 。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,2]
 * 输出：4
 * 解释：唯一元素为 [1,3] ，和为 4 。
 *
 * 示例 2：
 * 输入：nums = [1,1,1,1,1]
 * 输出：0
 * 解释：没有唯一元素，和为 0 。
 *
 * 示例 3 ：
 * 输入：nums = [1,2,3,4,5]
 * 输出：15
 * 解释：唯一元素为 [1,2,3,4,5] ，和为 15 。
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class SumUniqueElements {
    /**
     * 方法：map映射
     * @param nums
     * @return
     */
    public int sumOfUnique(int[] nums) {
        //记录每个数出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        //遍历
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //结果
        int res = 0;
        //遍历
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            //只出现一次
            if (value == 1)
                res += key;
        }
        return res;
    }
}
