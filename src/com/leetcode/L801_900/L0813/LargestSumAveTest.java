package com.leetcode.L801_900.L0813;

public class LargestSumAveTest {
    public static void main(String[] args) {
        LargestSumAve largestSumAve = new LargestSumAve();
        /*
          示例 1:
          输入: nums = [9,1,2,3,9], k = 3
          输出: 20.00000
          解释:
          nums 的最优分组是[9], [1, 2, 3], [9]. 得到的分数是 9 + (1 + 2 + 3) / 3 + 9 = 20.
          我们也可以把 nums 分成[9, 1], [2], [3, 9].
          这样的分组得到的分数为 5 + 2 + 6 = 13, 但不是最大值.
         */
        System.out.println(largestSumAve.largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3));
        /*
          示例 2:
          输入: nums = [1,2,3,4,5,6,7], k = 4
          输出: 20.50000
         */
        System.out.println(largestSumAve.largestSumOfAverages(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
    }
}
