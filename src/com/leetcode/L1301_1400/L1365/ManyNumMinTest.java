package com.leetcode.L1301_1400.L1365;

import java.util.Arrays;

public class ManyNumMinTest {
    public static void main(String[] args) {
        ManyNumMin manyNumMin = new ManyNumMin();
        /**
         * 示例 1：
         * 输入：nums = [8,1,2,2,3]
         * 输出：[4,0,1,1,3]
         * 解释：
         * 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
         * 对于 nums[1]=1 不存在比它小的数字。
         * 对于 nums[2]=2 存在一个比它小的数字：（1）。
         * 对于 nums[3]=2 存在一个比它小的数字：（1）。
         * 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
         */
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(manyNumMin.smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(manyNumMin.smallerNumbersThanCurrent_Map(nums)));
    }
}
