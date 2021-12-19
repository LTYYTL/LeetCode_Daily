package com.leetcode.L1_100.L0095;

public class UniqueBSTIITest {
    public static void main(String[] args) {
        UniqueBSTII uniqueBSTII = new UniqueBSTII();
        /** *
         * 示例 1：
         * 输入：n = 3
         * 输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
         */
        System.out.println(uniqueBSTII.generateTrees(3));
        /**
         * 示例 2：
         * 输入：n = 1
         * 输出：[[1]]
         */
        System.out.println(uniqueBSTII.generateTrees(1));
    }
}
