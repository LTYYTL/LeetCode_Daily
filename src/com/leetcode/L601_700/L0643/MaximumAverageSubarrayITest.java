package com.leetcode.L601_700.L0643;

public class MaximumAverageSubarrayITest {
    public static void main(String[] args) {
        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
        /*
          示例：
          输入：[1,12,-5,-6,50,3], k = 4
          输出：12.75
          解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
         */
        System.out.println(maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
}
