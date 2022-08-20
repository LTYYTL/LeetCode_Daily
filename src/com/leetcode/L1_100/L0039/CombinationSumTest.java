package com.leetcode.L1_100.L0039;

public class CombinationSumTest {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        /*示例 1：
          输入：candidates = [2,3,6,7], target = 7,
          所求解集为：
          [
            [7],
            [2,2,3]
          ]
         */
        int[] candidates = {2, 3, 6, 7};
        //方法一：回溯法（深度优先搜索）
        System.out.println(combinationSum.combinationSum(candidates, 7).toString());
        //方法二：回溯法（深度优先搜索 + 剪枝）
        System.out.println(combinationSum.combinationSum_cut(candidates, 7).toString());

        /*
          示例 2：
          输入：candidates = [2,3,5], target = 8,
          所求解集为：
          [
            [2,2,2,2],
            [2,3,3],
            [3,5]
          ]
         */
        int[] candidates1 = {2, 3, 5};
        //方法一：回溯法（深度优先搜索）
        System.out.println(combinationSum.combinationSum(candidates1, 8).toString());
        //方法二：回溯法（深度优先搜索 + 剪枝）
        System.out.println(combinationSum.combinationSum_cut(candidates1, 8).toString());
    }
}
