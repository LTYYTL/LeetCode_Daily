package com.offer.L003;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * 限制：
 * 2 <= n <= 100000
 */
public class RepeatedNumbersArray {
    /**
     * 方法一：set集合
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    /**
     * 方法二：排序
     * @param nums
     * @return
     */
    public int findRepeatNumber_sort(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]){
                return nums[i];
            }
        }
        return -1;
    }
}
