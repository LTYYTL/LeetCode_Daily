package com.leetcode.L101_200.L0167;

import java.util.Arrays;

public class TwoSumIITest {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        /*
          示例 1：
          输入：numbers = [2,7,11,15], target = 9
          输出：[1,2]
          解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
         */
        System.out.println(Arrays.toString(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)));
        /*
          示例 2：
          输入：numbers = [2,3,4], target = 6
          输出：[1,3]
         */
        System.out.println(Arrays.toString(twoSumII.twoSum(new int[]{2, 3, 4, 15}, 6)));
        /*
          示例 3：
          输入：numbers = [-1,0], target = -1
          输出：[1,2]
         */
        System.out.println(Arrays.toString(twoSumII.twoSum(new int[]{-1, 0}, -1)));
    }
}
