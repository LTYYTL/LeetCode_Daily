package com.offerII.L102;

public class TargetSumTest {
    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        /*
          示例 1：
          输入：nums = [1,1,1,1,1], target = 3
          输出：5
          解释：一共有 5 种方法让最终目标和为 3 。
          -1 + 1 + 1 + 1 + 1 = 3
          +1 - 1 + 1 + 1 + 1 = 3
          +1 + 1 - 1 + 1 + 1 = 3
          +1 + 1 + 1 - 1 + 1 = 3
          +1 + 1 + 1 + 1 - 1 = 3
         */
        System.out.println(targetSum.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(targetSum.findTargetSumWays_dp(new int[]{1, 1, 1, 1, 1}, 3));
        /*
          示例 2：
          输入：nums = [1], target = 1
          输出：1
         */
        System.out.println(targetSum.findTargetSumWays(new int[]{1}, 1));
        System.out.println(targetSum.findTargetSumWays_dp(new int[]{1}, 1));
    }
}
