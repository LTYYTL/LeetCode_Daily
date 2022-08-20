package com.leetcode.L1901_2000.L1920;

import java.util.Arrays;

public class BuildArrayPermutationTest {
    public static void main(String[] args) {
        BuildArrayPermutation buildArrayPermutation = new BuildArrayPermutation();
        /* * 示例 1：
          输入：nums = [0,2,1,5,3,4]
          输出：[0,1,2,4,5,3]
          解释：数组 ans 构建如下：
          ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
              = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
              = [0,1,2,4,5,3]
         */
        System.out.println(Arrays.toString(buildArrayPermutation.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
        /*
          示例 2：
          输入：nums = [5,0,1,2,3,4]
          输出：[4,5,0,1,2,3]
          解释：数组 ans 构建如下：
          ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
              = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
              = [4,5,0,1,2,3]
         */
        System.out.println(Arrays.toString(buildArrayPermutation.buildArray(new int[]{5, 0, 1, 2, 3, 4})));
    }
}
