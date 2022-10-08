package com.leetcode.L801_900.L0870;

import java.util.Arrays;

public class AdvantageShuffleTest {
    public static void main(String[] args) {
        AdvantageShuffle advantageShuffle = new AdvantageShuffle();
        /*
          示例 1：
          输入：nums1 = [2,7,11,15], nums2 = [1,10,4,11]
          输出：[2,11,7,15]
         */
        System.out.println(Arrays.toString(advantageShuffle.advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11})));
        /*
          示例 2：
          输入：nums1 = [12,24,8,32], nums2 = [13,25,32,11]
          输出：[24,32,8,12]
         */
        System.out.println(Arrays.toString(advantageShuffle.advantageCount(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11})));
    }
}
