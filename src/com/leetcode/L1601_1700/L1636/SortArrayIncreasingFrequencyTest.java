package com.leetcode.L1601_1700.L1636;

import java.util.Arrays;

public class SortArrayIncreasingFrequencyTest {
    public static void main(String[] args) {
        SortArrayIncreasingFrequency sortArrayIncreasingFrequency = new SortArrayIncreasingFrequency();
        /*
          示例 1：
          输入：nums = [1,1,2,2,2,3]
          输出：[3,1,1,2,2,2]
          解释：'3' 频率为 1，'1' 频率为 2，'2' 频率为 3 。
         */
        System.out.println(Arrays.toString(sortArrayIncreasingFrequency.frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
        /*
          示例 2：
          输入：nums = [2,3,1,3,2]
          输出：[1,3,3,2,2]
          解释：'2' 和 '3' 频率都为 2 ，所以它们之间按照数值本身降序排序。
         */
        System.out.println(Arrays.toString(sortArrayIncreasingFrequency.frequencySort(new int[]{2, 3, 1, 3, 2})));
        /*
          示例 3：
          输入：nums = [-1,1,-6,4,5,-6,1,4,1]
          输出：[5,-1,4,4,-6,-6,1,1,1]
         */
        System.out.println(Arrays.toString(sortArrayIncreasingFrequency.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
    }
}
