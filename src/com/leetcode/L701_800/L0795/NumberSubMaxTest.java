package com.leetcode.L701_800.L0795;

public class NumberSubMaxTest {
    public static void main(String[] args) {
        NumberSubMax numberSubMax = new NumberSubMax();
        /*
          示例 1：
          输入：nums = [2,1,4,3], left = 2, right = 3
          输出：3
          解释：满足条件的三个子数组：[2], [2, 1], [3]
         */
        System.out.println(numberSubMax.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
        /*
          示例 2：
          输入：nums = [2,9,2,5,6], left = 2, right = 8
          输出：7
         */
        System.out.println(numberSubMax.numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8));
    }
}
