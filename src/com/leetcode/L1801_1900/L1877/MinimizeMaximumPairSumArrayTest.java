package com.leetcode.L1801_1900.L1877;

public class MinimizeMaximumPairSumArrayTest {
    public static void main(String[] args) {
        MinimizeMaximumPairSumArray minimizeMaximumPairSumArray = new MinimizeMaximumPairSumArray();
        /*示例 1：
          输入：nums = [3,5,2,3]
          输出：7
          解释：数组中的元素可以分为数对 (3,3) 和 (5,2) 。
          最大数对和为 max(3+3, 5+2) = max(6, 7) = 7 。
         */
        System.out.println(minimizeMaximumPairSumArray.minPairSum(new int[]{3, 5, 2, 3}));
        /*
          示例 2：
          输入：nums = [3,5,4,2,4,6]
          输出：8
          解释：数组中的元素可以分为数对 (3,5)，(4,4) 和 (6,2) 。
          最大数对和为 max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8
         */
        System.out.println(minimizeMaximumPairSumArray.minPairSum(new int[]{3, 5, 4, 2, 4, 6}));

    }
}
