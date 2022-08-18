package com.leetcode.L1201_1300.L1224;

import java.util.HashMap;
import java.util.Map;

/**
 * 1224. 最大相等频率
 * 给你一个正整数数组 nums，请你帮忙从该数组中找出能满足下面要求的 最长 前缀，并返回该前缀的长度：
 * (1)从前缀中 恰好删除一个 元素后，剩下每个数字的出现次数都相同。
 * (2)如果删除这个元素后没有剩余元素存在，仍可认为每个数字都具有相同的出现次数（也就是 0 次）。
 * <p>
 * 示例 1：
 * 输入：nums = [2,2,1,1,5,3,3,5]
 * 输出：7
 * 解释：对于长度为 7 的子数组 [2,2,1,1,5,3,3]，如果我们从中删去 nums[4] = 5，就可以得到 [2,2,1,1,3,3]，里面每个数字都出现了两次。
 * <p>
 * 示例 2：
 * 输入：nums = [1,1,1,2,2,2,3,3,3,4,4,4,5]
 * 输出：13
 * <p>
 * 提示：
 * 2 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 */
public class MaxEqualFrequency {
    /**
     * 方法：map映射
     *
     * @param nums
     * @return
     */
    public int maxEqualFreq(int[] nums) {
        // 计算每个数出现的次数
        Map<Integer, Integer> countMap = new HashMap<>();
        // 计算每个频率包含数的个数
        Map<Integer, Integer> freqMap = new HashMap<>();

        // 最大长度和最大频率
        int ans = 0, maxFreq = 0;
        // 遍历
        for (int i = 0; i < nums.length; i++) {
            //当前数
            int num = nums[i];
            //查看数出现的次数
            int count = countMap.getOrDefault(num, 0);
            //因为再次出现，导致频率下的数的个数改变
            if (count > 0) {
                //原频率包含数的个数-1
                freqMap.put(count, freqMap.get(count) - 1);
            }
            //增加次数
            count++;
            //改变次数记录
            countMap.put(num, count);
            //为新频率包含的个数+1
            freqMap.put(count, freqMap.getOrDefault(count, 0) + 1);

            //获取当前最大频率
            maxFreq = Math.max(maxFreq, count);

            // 分三种情况：
            // 1. 所有数的频率都是1
            // 2. 去掉一个数后其他数的频率相等，如[2,2,1,1,3]去掉一个3
            // 3. 去掉一个数后包含当前数的所有数频率相等，如[2,2,1,1,3,3,3]去掉一个3
            if (maxFreq == 1
                    || maxFreq * freqMap.get(maxFreq) == i
                    || maxFreq + (maxFreq - 1) * freqMap.get(maxFreq - 1) == i + 1) {
                ans = Math.max(ans, i + 1);
            }

        }
        return ans;
    }
}
