package com.leetcode.L801_900.L0891;

public class SumSubWidthsTest {
    public static void main(String[] args) {
        SumSubWidths sumSubWidths = new SumSubWidths();
        /*
          示例 1：
          输入：nums = [2,1,3]
          输出：6
          解释：子序列为 [1], [2], [3], [2,1], [2,3], [1,3], [2,1,3] 。
          相应的宽度是 0, 0, 0, 1, 1, 2, 2 。
          宽度之和是 6 。
         */
        System.out.println(sumSubWidths.sumSubseqWidths(new int[]{2, 1, 3}));
        /*
          示例 2：
          输入：nums = [2]
          输出：0
         */
        System.out.println(sumSubWidths.sumSubseqWidths(new int[]{2}));
    }
}
