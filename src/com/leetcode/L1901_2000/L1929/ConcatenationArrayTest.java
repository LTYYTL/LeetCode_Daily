package com.leetcode.L1901_2000.L1929;

import java.util.Arrays;

public class ConcatenationArrayTest {
    public static void main(String[] args) {
        ConcatenationArray concatenationArray = new ConcatenationArray();
        /*
          示例 1：
          输入：nums = [1,2,1]
          输出：[1,2,1,1,2,1]
          解释：数组 ans 按下述方式形成：
          - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
          - ans = [1,2,1,1,2,1]
         */
        System.out.println(Arrays.toString(concatenationArray.getConcatenation(new int[]{1, 2, 1})));
        /*
          示例 2：
          输入：nums = [1,3,2,1]
          输出：[1,3,2,1,1,3,2,1]
          解释：数组 ans 按下述方式形成：
          - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
          - ans = [1,3,2,1,1,3,2,1]
         */
        System.out.println(Arrays.toString(concatenationArray.getConcatenation(new int[]{1, 3, 2, 1})));
    }
}
