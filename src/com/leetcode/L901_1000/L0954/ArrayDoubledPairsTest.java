package com.leetcode.L901_1000.L0954;

public class ArrayDoubledPairsTest {
    public static void main(String[] args) {
        ArrayDoubledPairs arrayDoubledPairs = new ArrayDoubledPairs();
        /*
          示例 1：
          输入：arr = [3,1,3,6]
          输出：false
         */
        System.out.println(arrayDoubledPairs.canReorderDoubled(new int[]{1, 2, 1, -8, 8, -4, 4, -4, 2, -2}));
        /*
          示例 2：
          输入：arr = [2,1,2,6]
          输出：false
         */
        System.out.println(arrayDoubledPairs.canReorderDoubled(new int[]{2, 1, 2, 6}));
        /*
          示例 3：
          输入：arr = [4,-2,2,-4]
          输出：true
          解释：可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]
         */
        System.out.println(arrayDoubledPairs.canReorderDoubled(new int[]{4, -2, 2, -4}));
    }
}
