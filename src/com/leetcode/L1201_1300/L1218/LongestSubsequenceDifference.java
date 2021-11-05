package com.leetcode.L1201_1300.L1218;

import java.util.HashMap;
import java.util.Map;

/**
 * 1218. 最长定差子序列
 * 给你一个整数数组 arr 和一个整数 difference，请你找出并返回 arr 中最长等差子序列的长度，该子序列中相邻元素之间的差等于 difference 。
 * 子序列 是指在不改变其余元素顺序的情况下，通过删除一些元素或不删除任何元素而从 arr 派生出来的序列。
 *
 * 示例 1：
 * 输入：arr = [1,2,3,4], difference = 1
 * 输出：4
 * 解释：最长的等差子序列是 [1,2,3,4]。
 *
 * 示例 2：
 * 输入：arr = [1,3,5,7], difference = 1
 * 输出：1
 * 解释：最长的等差子序列是任意单个元素。
 *
 * 示例 3：
 * 输入：arr = [1,5,7,8,5,3,4,2,1], difference = -2
 * 输出：4
 * 解释：最长的等差子序列是 [7,5,3,1]。
 *
 * 提示：
 * 1 <= arr.length <= 105
 * -104 <= arr[i], difference <= 104
 */
public class LongestSubsequenceDifference {
    /**
     * 方法：动态规划
     * @param arr
     * @param difference
     * @return
     */
    public int longestSubsequence(int[] arr, int difference) {
        //结果
        int res = 0;
        //key为数字，value长度
        Map<Integer,Integer> map = new HashMap<>();
        //遍历
        for (int i : arr) {
            //查看以当前元素的等差数列的长度+1
            map.put(i,map.getOrDefault(i - difference,0) + 1);
            //取最大值
            res = Math.max(map.get(i),res);
        }
        return res;
    }
}
