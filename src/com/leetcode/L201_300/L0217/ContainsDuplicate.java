package com.leetcode.L201_300.L0217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 *
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: false
 *
 * 示例 3:
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class ContainsDuplicate {
    /**
     * 方法一：排序
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        //排序
        Arrays.sort(nums);
        //判断当前元素是否跟前一个相同
        for (int i = 1; i < nums.length; ++i){
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    /**
     * 方法二：Set集合
     * @param nums
     * @return
     */
    public boolean containsDuplicate_hash(int[] nums) {
        //将数组中的元素存入set集合中
        //如果当前元素存在在set集合中直接返回true，否则没有将其加入set集合中，继续循环直至遍历结束
        Set<Integer> set = new HashSet<>();
        for (int i:nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
