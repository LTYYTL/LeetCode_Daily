package com.leetcode.L1501_1600.L1512;

public class NumberGoodPairsTest {
    public static void main(String[] args) {
        NumberGoodPairs numberGoodPairs = new NumberGoodPairs();
        /*
          示例 1：
          输入：nums = [1,2,3,1,1,3]
          输出：4
          解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
         */
        System.out.println(numberGoodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        /*
          示例 2：
          输入：nums = [1,1,1,1]
          输出：6
          解释：数组中的每组数字都是好数对
         */
        System.out.println(numberGoodPairs.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        /*
          示例 3：
          输入：nums = [1,2,3]
          输出：0
         */
        System.out.println(numberGoodPairs.numIdenticalPairs(new int[]{1, 2, 3}));
    }
}
