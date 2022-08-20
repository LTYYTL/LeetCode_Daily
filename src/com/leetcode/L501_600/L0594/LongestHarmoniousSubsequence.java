package com.leetcode.L501_600.L0594;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. 最长和谐子序列
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
 * 现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。
 * 数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
 *
 * 示例 1：
 * 输入：nums = [1,3,2,2,5,2,3,7]
 * 输出：5
 * 解释：最长的和谐子序列是 [3,2,2,2,3]
 *
 * 示例 2：
 * 输入：nums = [1,2,3,4]
 * 输出：2
 *
 * 示例 3：
 * 输入：nums = [1,1,1,1]
 * 输出：0
 *
 * 提示：
 * 1 <= nums.length <= 2 * 104
 * -109 <= nums[i] <= 109
 */
public class LongestHarmoniousSubsequence {
    /**
     * 方法：map映射
     * 解题思路：题目要求子序列中最大值和最小值相差正好是1，所以子序列只能有两个数字组成
     *         用map记录每个数字出现的次数，当前数是x，并且x+1也存在，则子序列的长度为x次数 + x+1的次数
     * @param nums
     * @return
     */
    public int findLHS(int[] nums) {
        //存储每个数出现的次数
        Map<Integer, Integer> map = new HashMap<>();

        //遍历数组，记录次数
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        //最大长度
        int max = 0;

        //遍历数组
        for (int num : nums) {
            //x+1存在时
            if (map.containsKey(num + 1)) {
                //长度为x的次数 + x+1的次数
                int len = map.get(num) + map.get(num + 1);
                //取最大值
                max = Math.max(len, max);
            }
        }

        return max;
    }
}
