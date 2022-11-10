package com.leetcode.L701_800.L0764;

public class LargestPlusSignTest {
    public static void main(String[] args) {
        LargestPlusSign largestPlusSign = new LargestPlusSign();
        /*
          示例 1：
          输入: n = 5, mines = [[4, 2]]
          输出: 2
          解释: 在上面的网格中，最大加号标志的阶只能是2。一个标志已在图中标出。
         */
        System.out.println(largestPlusSign.orderOfLargestPlusSign(5, new int[][]{{4, 2}}));
        /*
          示例 2：
          输入: n = 1, mines = [[0, 0]]
          输出: 0
          解释: 没有加号标志，返回 0 。
         */
        System.out.println(largestPlusSign.orderOfLargestPlusSign(1, new int[][]{{0, 0}}));
    }
}
