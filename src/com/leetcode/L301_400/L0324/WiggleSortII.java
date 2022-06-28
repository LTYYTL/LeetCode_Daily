package com.leetcode.L301_400.L0324;

import java.util.Arrays;

/**
 * 324. 摆动排序 II
 * 给你一个整数数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。
 * 你可以假设所有输入数组都可以得到满足题目要求的结果。
 * <p>
 * 示例 1：
 * 输入：nums = [1,5,1,1,6,4]
 * 输出：[1,6,1,5,1,4]
 * 解释：[1,4,1,5,1,6] 同样是符合题目要求的结果，可以被判题程序接受。
 * <p>
 * 示例 2：
 * 输入：nums = [1,3,2,2,3,1]
 * 输出：[2,3,1,3,1,2]
 * <p>
 * 提示：
 * 1 <= nums.length <= 5 * 104
 * 0 <= nums[i] <= 5000
 * 题目数据保证，对于给定的输入 nums ，总能产生满足题目要求的结果
 * <p>
 * 进阶：你能用 O(n) 时间复杂度和 / 或原地 O(1) 额外空间来实现吗？
 */
public class WiggleSortII {
    /**
     * 方法：双指针
     *
     * @param nums
     */
    public void wiggleSort(int[] nums) {
        //复制数组
        int[] clone = nums.clone();
        //排序
        Arrays.sort(clone);
        //放到数组中间
        int left = (nums.length - 1) / 2;
        //放到数组尾部
        int right = nums.length - 1;

        //遍历
        for (int i = 0; i < nums.length; i++) {
            //偶数
            if (i % 2 == 0)
                //赋值，指针移动
                nums[i] = clone[left--];
            else
                //赋值，指针移动
                nums[i] = clone[right--];
        }
    }
}
