package com.leetcode.L2201_2300.L2248;

import java.util.*;

/**
 * 2248. 多个数组求交集
 * 给你一个二维整数数组 nums ，其中 nums[i] 是由 不同 正整数组成的一个非空数组，按 升序排列 返回一个数组，数组中的每个元素在 nums 所有数组 中都出现过。
 * <p>
 * 示例 1：
 * 输入：nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
 * 输出：[3,4]
 * 解释：
 * nums[0] = [3,1,2,4,5]，nums[1] = [1,2,3,4]，nums[2] = [3,4,5,6]，在 nums 中每个数组中都出现的数字是 3 和 4 ，所以返回 [3,4] 。
 * <p>
 * 示例 2：
 * 输入：nums = [[1,2,3],[4,5,6]]
 * 输出：[]
 * 解释：
 * 不存在同时出现在 nums[0] 和 nums[1] 的整数，所以返回一个空列表 [] 。
 * <p>
 * 提示：
 * 1 <= nums.length <= 1000
 * 1 <= sum(nums[i].length) <= 1000
 * 1 <= nums[i][j] <= 1000
 * nums[i] 中的所有值 互不相同
 */
public class IntersectionMultipleArrays {
    /**
     * 方法：map映射
     *
     * @param nums
     * @return
     */
    public List<Integer> intersection(int[][] nums) {
        //记录每个数出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        //遍历
        for (int[] num : nums) {
            for (int n : num) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }

        //结果
        List<Integer> res = new ArrayList<>();
        //遍历
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //元素
            Integer key = entry.getKey();
            //次数
            Integer value = entry.getValue();
            //在每个数组都出现过
            if (value == nums.length)
                res.add(key);
        }

        //排序
        Collections.sort(res);
        return res;
    }
}
