package com.leetcode.L1_100.L0034;

import java.util.Arrays;

public class FindFirstAndEndTest {
    public static void main(String[] args) {
        FindFirstAndEnd findFirstAndEnd = new FindFirstAndEnd();
        /*
          示例 1：
          输入：nums = [5,7,7,8,8,10], target = 8
          输出：[3,4]
         */
        System.out.println(Arrays.toString(findFirstAndEnd.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        /*
          示例 2：
          输入：nums = [5,7,7,8,8,10], target = 6
          输出：[-1,-1]
         */
        System.out.println(Arrays.toString(findFirstAndEnd.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        /*
          示例 3：
          输入：nums = [], target = 0
          输出：[-1,-1]
         */
        System.out.println(Arrays.toString(findFirstAndEnd.searchRange(new int[]{}, 0)));
    }
}
