package com.leetcode.L1_100.L0066;

import java.util.Arrays;

public class AddOneTest {
    public static void main(String[] args) {
        AddOne addOne = new AddOne();
        /*
          示例 1:
          输入: [1,2,3]
          输出: [1,2,4]
          解释: 输入数组表示数字 123。
         */
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(addOne.plusOne(nums)));
        /*
          示例 2:
          输入: [4,3,2,1]
          输出: [4,3,2,2]
          解释: 输入数组表示数字 4321。
         */
        int[] nums1 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(addOne.plusOne(nums1)));
    }
}
