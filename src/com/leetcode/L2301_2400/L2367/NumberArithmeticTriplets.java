package com.leetcode.L2301_2400.L2367;

import java.util.HashSet;
import java.util.Set;

/**
 * 2367. 算术三元组的数目
 * 给你一个下标从 0 开始、严格递增 的整数数组 nums 和一个正整数 diff 。如果满足下述全部条件，则三元组 (i, j, k) 就是一个 算术三元组 ：
 * (1)i < j < k ，
 * (2)nums[j] - nums[i] == diff 且
 * (3)nums[k] - nums[j] == diff
 * 返回不同 算术三元组 的数目。
 * <p>
 * 示例 1：
 * 输入：nums = [0,1,4,6,7,10], diff = 3
 * 输出：2
 * 解释：
 * (1, 2, 4) 是算术三元组：7 - 4 == 3 且 4 - 1 == 3 。
 * (2, 4, 5) 是算术三元组：10 - 7 == 3 且 7 - 4 == 3 。
 * <p>
 * 示例 2：
 * 输入：nums = [4,5,6,7,8,9], diff = 2
 * 输出：2
 * 解释：
 * (0, 2, 4) 是算术三元组：8 - 6 == 2 且 6 - 4 == 2 。
 * (1, 3, 5) 是算术三元组：9 - 7 == 2 且 7 - 5 == 2 。
 * <p>
 * 提示：
 * 3 <= nums.length <= 200
 * 0 <= nums[i] <= 200
 * 1 <= diff <= 50
 * nums 严格 递增
 */
public class NumberArithmeticTriplets {
    /**
     * 方法：set集合
     */
    public int arithmeticTriplets(int[] nums, int diff) {
        // 记录数字
        Set<Integer> set = new HashSet<>();
        // 遍历
        for (int j : nums) {
            set.add(j);
        }

        // 结果
        int res = 0;
        // 遍历
        for (int num : nums) {
            // 存在
            if (set.contains(num + diff) && set.contains(num - diff)) {
                res++;
            }
        }
        return res;
    }
}
