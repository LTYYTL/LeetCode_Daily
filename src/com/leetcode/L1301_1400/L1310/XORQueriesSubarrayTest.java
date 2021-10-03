package com.leetcode.L1301_1400.L1310;

import java.util.Arrays;

public class XORQueriesSubarrayTest {
    public static void main(String[] args) {
        XORQueriesSubarray xorQueriesSubarray = new XORQueriesSubarray();
        /** * 示例 1：
         * 输入：arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
         * 输出：[2,7,14,8]
         * 解释：
         * 数组中元素的二进制表示形式是：
         * 1 = 0001
         * 3 = 0011
         * 4 = 0100
         * 8 = 1000
         * 查询的 XOR 值为：
         * [0,1] = 1 xor 3 = 2
         * [1,2] = 3 xor 4 = 7
         * [0,3] = 1 xor 3 xor 4 xor 8 = 14
         * [3,3] = 8
         */
        //System.out.println(Arrays.toString(xorQueriesSubarray.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}})));
        /**
         * 示例 2：
         * 输入：arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
         * 输出：[8,0,4,4]
         */
        //System.out.println(Arrays.toString(xorQueriesSubarray.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}})));
        System.out.println(Arrays.toString(xorQueriesSubarray.xorQueries(new int[]{16}, new int[][]{{0, 0}, {0, 0}, {0, 0}})));
    }
}
