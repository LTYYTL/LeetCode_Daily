package com.leetcode.L501_600.L0532;

import java.util.HashSet;
import java.util.Set;

/**
 * 532. 数组中的 k-diff 数对
 * 给你一个整数数组 nums 和一个整数 k，请你在数组中找出 不同的 k-diff 数对，并返回不同的 k-diff 数对 的数目。
 * k-diff 数对定义为一个整数对 (nums[i], nums[j]) ，并满足下述全部条件：
 * (1)0 <= i, j < nums.length
 * (2)i != j
 * nums[i] - nums[j] == k
 * 注意，|val| 表示 val 的绝对值。
 * <p>
 * 示例 1：
 * 输入：nums = [3, 1, 4, 1, 5], k = 2
 * 输出：2
 * 解释：数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
 * 尽管数组中有两个 1 ，但我们只应返回不同的数对的数量。
 * <p>
 * 示例 2：
 * 输入：nums = [1, 2, 3, 4, 5], k = 1
 * 输出：4
 * 解释：数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5) 。
 * <p>
 * 示例 3：
 * 输入：nums = [1, 3, 1, 5, 4], k = 0
 * 输出：1
 * 解释：数组中只有一个 0-diff 数对，(1, 1) 。
 * <p>
 * 提示：
 * 1 <= nums.length <= 104
 * -107 <= nums[i] <= 107
 * 0 <= k <= 107
 */
public class KdiffPairsArray {
    /**
     * 方法：set集合
     *
     * @param nums
     * @param k
     * @return
     */
    public int findPairs(int[] nums, int k) {
        //存储结果
        Set<Integer> res = new HashSet<>();
        //存储出现的数
        Set<Integer> visited = new HashSet<>();
        //遍历
        for (int num : nums) {
            //当前数小k的数
            if (visited.contains(num - k))
                res.add(num - k);
            //当前数大k饿数
            if (visited.contains(num + k))
                res.add(num);
            //加入集合
            visited.add(num);
        }
        return res.size();
    }
}
