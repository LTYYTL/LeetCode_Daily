package com.leetcode.L0040;

public class CombinationSumIITest {
    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        /*** 示例 1:
         * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
         * 所求解集为:
         * [
         *   [1, 7],
         *   [1, 2, 5],
         *   [2, 6],
         *   [1, 1, 6]
         * ]
         */
        int[] candidates = {10,1,2,7,6,1,5};
       System.out.println(combinationSumII.combinationSum2(candidates , 8).toString());

        /**
         * 示例 2:
         * 输入: candidates = [2,5,2,1,2], target = 5,
         * 所求解集为:
         * [
         *   [1,2,2],
         *   [5]
         * ]
         */
        int[] candidates1 = {2,5,2,1,2};
        System.out.println(combinationSumII.combinationSum2(candidates1 , 5).toString());
    }
}
