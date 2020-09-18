package com.leetcode.L0046;

public class PermutationsTest {
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        /**
         * 示例:
         * 输入: [1,2,3]
         * 输出:
         * [
         *   [1,2,3],
         *   [1,3,2],
         *   [2,1,3],
         *   [2,3,1],
         *   [3,1,2],
         *   [3,2,1]
         * ]
         */
        System.out.println(permutations.permute(new int[]{1,2,3}).toString());
    }
}
