package com.leetcode.L1365;

import java.util.*;

/**
 * 1365. 有多少小于当前数字的数字
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 以数组形式返回答案。
 *
 * 示例 1：
 * 输入：nums = [8,1,2,2,3]
 * 输出：[4,0,1,1,3]
 * 解释：
 * 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
 * 对于 nums[1]=1 不存在比它小的数字。
 * 对于 nums[2]=2 存在一个比它小的数字：（1）。
 * 对于 nums[3]=2 存在一个比它小的数字：（1）。
 * 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
 *
 * 示例 2：
 * 输入：nums = [6,5,4,8]
 * 输出：[2,1,0,3]
 *
 * 示例 3：
 * 输入：nums = [7,7,7,7]
 * 输出：[0,0,0,0]
 *
 * 提示：
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 */
public class ManyNumMin {
    /**
     * 方法一：暴力法
     * @param nums
     * @return
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    cnt++;
                }
            }
            ret[i] = cnt;
        }
        return ret;
    }

    public int[] smallerNumbersThanCurrent_Map(int[] nums){
        Map<Integer, Set<Integer>> map = new HashMap<>();
        //预存元素出现的位置
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i]))
                map.put(nums[i],new HashSet<>());
            map.get(nums[i]).add(i);
        }
        //复制数组用于排序
        int[] sortArr = Arrays.copyOf(nums,nums.length);
        int[] res = new int[nums.length];
        //排序
        Arrays.sort(sortArr);
        for (int i = nums.length - 1; i >= 0; i--) { // 倒序，方便处理同值的情况
            // 此行为补充优化：前面还有同值的，那就跳过这次，等下次再一并赋值
            if (i - 1 >= 0 && sortArr[i] == sortArr[i - 1]) continue;

            for (int j : map.get(sortArr[i])) res[j] = i; // 同值的所有索引都更新
        }
        return res;
    }
}
