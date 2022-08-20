package com.leetcode.L1401_1500.L1413;

public class MinValuePositiveSumTest {
    public static void main(String[] args) {
        MinValuePositiveSum minValuePositiveSum = new MinValuePositiveSum();
        /*
          示例 1：
          输入：nums = [-3,2,-3,4,2]
          输出：5
          解释：如果你选择 startValue = 4，在第三次累加时，和小于 1 。
                          累加求和
                          startValue = 4 | startValue = 5 | nums
                            (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
                            (1 +2 ) = 3  | (2 +2 ) = 4    |   2
                            (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
                            (0 +4 ) = 4  | (1 +4 ) = 5    |   4
                            (4 +2 ) = 6  | (5 +2 ) = 7    |   2
         */
        System.out.println(minValuePositiveSum.minStartValue(new int[]{-3, 2, -3, 4, 2}));
        /*
          示例 2：
          输入：nums = [1,2]
          输出：1
          解释：最小的 startValue 需要是正数。
         */
        System.out.println(minValuePositiveSum.minStartValue(new int[]{1, 2}));
        /*
          示例 3：
          输入：nums = [1,-2,-3]
          输出：5
         */
        System.out.println(minValuePositiveSum.minStartValue(new int[]{1, -2, -3}));
    }
}
