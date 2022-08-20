package com.leetcode.L1_100.L0078;

public class SubsetsTest {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        /*
          示例:
          输入: nums = [1,2,3]
          输出:
          [
            [3],
            [1],
            [2],
            [1,2,3],
            [1,3],
            [2,3],
            [1,2],
            []
          ]
         */
        int[] nums = {1, 2, 3};
        System.out.println(subsets.subsets(nums).toString());
    }
}
