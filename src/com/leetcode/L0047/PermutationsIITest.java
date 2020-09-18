package com.leetcode.L0047;

public class PermutationsIITest {
    public static void main(String[] args) {
        PermutationsII permutationsII = new PermutationsII();
        /**
         * 示例:
         * 输入: [1,1,2]
         * 输出:
         * [
         *   [1,1,2],
         *   [1,2,1],
         *   [2,1,1]
         * ]
         */
        System.out.println(permutationsII.permuteUnique(new int[]{1,1,2}).toString());
    }
}
