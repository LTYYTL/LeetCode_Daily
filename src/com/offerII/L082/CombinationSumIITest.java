package com.offerII.L082;

public class CombinationSumIITest {
    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        /*
          示例 1:
          输入: candidates = [10,1,2,7,6,1,5], target = 8,
          输出:
          [
          [1,1,6],
          [1,2,5],
          [1,7],
          [2,6]
          ]
         */
        System.out.println(combinationSumII.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        /*
          示例 2:
          输入: candidates = [2,5,2,1,2], target = 5,
          输出:
          [
          [1,2,2],
          [5]
          ]
         */
        System.out.println(combinationSumII.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }
}
