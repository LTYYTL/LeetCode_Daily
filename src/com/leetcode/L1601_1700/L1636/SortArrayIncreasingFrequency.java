package com.leetcode.L1601_1700.L1636;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1636. 按照频率将数组升序排序
 * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
 * 请你返回排序后的数组。
 * <p>
 * 示例 1：
 * 输入：nums = [1,1,2,2,2,3]
 * 输出：[3,1,1,2,2,2]
 * 解释：'3' 频率为 1，'1' 频率为 2，'2' 频率为 3 。
 * <p>
 * 示例 2：
 * 输入：nums = [2,3,1,3,2]
 * 输出：[1,3,3,2,2]
 * 解释：'2' 和 '3' 频率都为 2 ，所以它们之间按照数值本身降序排序。
 * <p>
 * 示例 3：
 * 输入：nums = [-1,1,-6,4,5,-6,1,4,1]
 * 输出：[5,-1,4,4,-6,-6,1,1,1]
 * <p>
 * 提示：
 * 1 <= nums.length <= 100
 * -100 <= nums[i] <= 100
 */
public class SortArrayIncreasingFrequency {
    /**
     * 方法：map映射
     */
    public int[] frequencySort(int[] nums) {
        // 存储每个数的频率
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 转化成列表
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // 排序
        list.sort((a, b) -> {
            int v1 = map.get(a);
            int v2 = map.get(b);
            return v1 != v2 ? v1 - v2 : b - a;
        });

        // 转换成数组
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
