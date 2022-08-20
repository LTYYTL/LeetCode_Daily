package com.offerII.L081;

public class CombinationSumTest {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        /*
          示例 1：
          输入: candidates = [2,3,6,7], target = 7
          输出: [[7],[2,2,3]]
         */
        System.out.println(combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
        /*
          示例 2：
          输入: candidates = [2,3,5], target = 8
          输出: [[2,2,2,2],[2,3,3],[3,5]]
         */
        System.out.println(combinationSum.combinationSum(new int[]{2, 3, 5}, 8));
        /*
          示例 3：
          输入: candidates = [2], target = 1
          输出: []
         */
        System.out.println(combinationSum.combinationSum(new int[]{2}, 1));
        /*
          示例 4：
          输入: candidates = [1], target = 1
          输出: [[1]]
         */
        System.out.println(combinationSum.combinationSum(new int[]{1}, 1));
        /*
          示例 5：
          输入: candidates = [1], target = 2
          输出: [[1,1]]
         */
        System.out.println(combinationSum.combinationSum(new int[]{1}, 2));
    }
}
