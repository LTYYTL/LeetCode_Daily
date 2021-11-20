package com.leetcode.L201_300.L0219;

import java.util.*;

/**
 * 219. 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 * 示例 1:
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 *
 * 示例 2:
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 *
 * 示例 3:
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
public class ContainsDuplicateII {
    /**
     * 方法：set集合
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //长度为k的set，存储元素
        Set<Integer> set = new HashSet<>();
        //遍历
        for (int i = 0; i < nums.length; i++) {
            //如果有相同的元素一定大于等于k
            if (set.contains(nums[i]))
                return true;
            //加入元素
            set.add(nums[i]);
            //当存储元素超过k移除，最前面的元素
            if (set.size() > k){
                set.remove(nums[i-k]);
            }

        }
        return false;
    }
}
