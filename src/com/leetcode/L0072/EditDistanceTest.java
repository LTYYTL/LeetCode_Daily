package com.leetcode.L0072;

public class EditDistanceTest {
    public static void main(String[] args) {
        EditDistance editDistance = new EditDistance();
        /** * 示例 1：
         * 输入：word1 = "horse", word2 = "ros"
         * 输出：3
         * 解释：
         * horse -> rorse (将 'h' 替换为 'r')
         * rorse -> rose (删除 'r')
         * rose -> ros (删除 'e')
         */
        System.out.println(editDistance.minDistance("horse", "ros"));
        /**
         * 示例 2：
         * 输入：word1 = "intention", word2 = "execution"
         * 输出：5
         * 解释：
         * intention -> inention (删除 't')
         * inention -> enention (将 'i' 替换为 'e')
         * enention -> exention (将 'n' 替换为 'x')
         * exention -> exection (将 'n' 替换为 'c')
         * exection -> execution (插入 'u')
         */
        System.out.println(editDistance.minDistance("intention", "execution"));
    }
}
