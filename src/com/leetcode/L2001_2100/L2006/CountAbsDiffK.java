package com.leetcode.L2001_2100.L2006;

import java.util.HashMap;
import java.util.Map;

/**
 * 2006. 差的绝对值为 K 的数对数目
 * 给你一个整数数组 nums 和一个整数 k ，请你返回数对 (i, j) 的数目，满足 i < j 且 |nums[i] - nums[j]| == k 。
 * |x| 的值定义为：
 * (1)如果 x >= 0 ，那么值为 x 。
 * (2)如果 x < 0 ，那么值为 -x 。
 *
 * 示例 1：
 * 输入：nums = [1,2,2,1], k = 1
 * 输出：4
 * 解释：差的绝对值为 1 的数对为：
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 *
 * 示例 2：
 * 输入：nums = [1,3], k = 3
 * 输出：0
 * 解释：没有任何数对差的绝对值为 3 。
 *
 * 示例 3：
 * 输入：nums = [3,2,1,5,4], k = 2
 * 输出：3
 * 解释：差的绝对值为 2 的数对为：
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 *
 * 提示：
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * 1 <= k <= 99
 */
public class CountAbsDiffK {
    /**
     * 方法：暴力法
     * @param nums
     * @param k
     * @return
     */
    public int countKDifference(int[] nums, int k) {
        //记录个数
        int count = 0;
        //遍历
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                //差值的绝对值
                if (Math.abs(nums[i] - nums[j]) == k)
                    count++;
            }
        }

        return count;
    }

    /**
     * 方法二：map映射
     * @param nums
     * @param k
     * @return
     */
    public int countKDifference_map(int[] nums, int k) {
        //记录每个数字出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        //遍历
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //结果
        int count = 0;
        //遍历
        for (int num : nums) {
            //比当前数大k的数
            int val = num + k;
            //这个数出现的次数就是两数的绝对值为k的个数
            if (map.containsKey(val))
                count += map.get(val);
        }

        return count;
    }
}
