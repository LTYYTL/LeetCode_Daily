package com.leetcode.L201_300.L0287;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 287. 寻找重复数
 * 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
 * 你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。
 *
 * 示例 1：
 * 输入：nums = [1,3,4,2,2]
 * 输出：2
 *
 * 示例 2：
 * 输入：nums = [3,1,3,4,2]
 * 输出：3
 *
 * 示例 3：
 * 输入：nums = [1,1]
 * 输出：1
 *
 * 示例 4：
 * 输入：nums = [1,1,2]
 * 输出：1
 *
 * 提示：
 * 1 <= n <= 105
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 * nums 中 只有一个整数 出现 两次或多次 ，其余整数均只出现 一次
 *
 * 进阶：
 * 如何证明 nums 中至少存在一个重复的数字?
 * 你可以设计一个线性级时间复杂度 O(n) 的解决方案吗？
 */
public class FindDuplicateNum {
    /**
     * 方法一：set集合
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        //存放数字
        Set<Integer> set = new HashSet<>();
        //遍历
        for (int num : nums) {
            //存在就返回
            if (set.contains(num))
                return num;
            //添加到集合中
            set.add(num);
        }
        return 0;
    }

    /**
     * 方法二：双指针
     * @param nums
     * @return
     */
    public int findDuplicate_two(int[] nums) {
        //排序
        Arrays.sort(nums);
        //双指针
        int left = 0;
        int right = 1;
        //遍历
        while (right < nums.length){
            //相等跳出
            if (nums[left] == nums[right])
                break;
            //指针后移动
            left++;
            right++;
        }
        return nums[left];
    }
}
