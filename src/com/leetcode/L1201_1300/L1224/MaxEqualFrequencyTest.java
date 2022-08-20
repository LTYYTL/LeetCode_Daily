package com.leetcode.L1201_1300.L1224;

public class MaxEqualFrequencyTest {
    public static void main(String[] args) {
        MaxEqualFrequency maxEqualFrequency = new MaxEqualFrequency();
        /*
          示例 1：
          输入：nums = [2,2,1,1,5,3,3,5]
          输出：7
          解释：对于长度为 7 的子数组 [2,2,1,1,5,3,3]，如果我们从中删去 nums[4] = 5，就可以得到 [2,2,1,1,3,3]，里面每个数字都出现了两次。
         */
        System.out.println(maxEqualFrequency.maxEqualFreq(new int[]{2, 2, 1, 1, 5, 3, 3, 5}));
        /*
          示例 2：
          输入：nums = [1,1,1,2,2,2,3,3,3,4,4,4,5]
          输出：13
         */
        System.out.println(maxEqualFrequency.maxEqualFreq(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5}));
    }
}
