package com.leetcode.L101_200.L0189;

import java.util.Arrays;

public class RotateArrayTest {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        /*
          示例 1:
          输入: nums = [1,2,3,4,5,6,7], k = 3
          输出: [5,6,7,1,2,3,4]
          解释:
          向右轮转 1 步: [7,1,2,3,4,5,6]
          向右轮转 2 步: [6,7,1,2,3,4,5]
          向右轮转 3 步: [5,6,7,1,2,3,4]
         */
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        /*
          示例 2:
          输入：nums = [-1,-100,3,99], k = 2
          输出：[3,99,-1,-100]
          解释:
          向右轮转 1 步: [99,-1,-100,3]
          向右轮转 2 步: [3,99,-1,-100]
         */
        int[] nums1 = new int[]{-1, -100, 3, 99};
        rotateArray.rotate(nums1, 2);
        System.out.println(Arrays.toString(nums1));
    }
}
