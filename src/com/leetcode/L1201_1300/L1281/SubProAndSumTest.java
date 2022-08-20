package com.leetcode.L1201_1300.L1281;

public class SubProAndSumTest {
    public static void main(String[] args) {
        SubProAndSum subProAndSum = new SubProAndSum();
        /*
          示例 1：
          输入：n = 234
          输出：15
          解释：
          各位数之积 = 2 * 3 * 4 = 24
          各位数之和 = 2 + 3 + 4 = 9
          结果 = 24 - 9 = 15
         */
        System.out.println(subProAndSum.subtractProductAndSum(234));
        /*
          示例 2：
          输入：n = 4421
          输出：21
          解释：
          各位数之积 = 4 * 4 * 2 * 1 = 32
          各位数之和 = 4 + 4 + 2 + 1 = 11
          结果 = 32 - 11 = 21
         */
        System.out.println(subProAndSum.subtractProductAndSum(4421));
    }
}
