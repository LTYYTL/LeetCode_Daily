package com.leetcode.L1901_2000.L1913;

public class MaxDiffTwoPairsTest {
    public static void main(String[] args) {
        MaxDiffTwoPairs maxDiffTwoPairs = new MaxDiffTwoPairs();
        /*
          示例 1：
          输入：nums = [5,6,2,7,4]
          输出：34
          解释：可以选出下标为 1 和 3 的元素构成第一个数对 (6, 7) 以及下标 2 和 4 构成第二个数对 (2, 4)
          乘积差是 (6 * 7) - (2 * 4) = 34
         */
        System.out.println(maxDiffTwoPairs.maxProductDifference(new int[]{5, 6, 2, 7, 4}));
        /*
          示例 2：
          输入：nums = [4,2,5,9,7,4,8]
          输出：64
          解释：可以选出下标为 3 和 6 的元素构成第一个数对 (9, 8) 以及下标 1 和 5 构成第二个数对 (2, 4)
          乘积差是 (9 * 8) - (2 * 4) = 64
         */
        System.out.println(maxDiffTwoPairs.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }
}
