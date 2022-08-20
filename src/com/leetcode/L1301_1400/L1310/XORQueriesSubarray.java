package com.leetcode.L1301_1400.L1310;

/**
 * 1310. 子数组异或查询
 * 有一个正整数数组 arr，现给你一个对应的查询数组 queries，其中 queries[i] = [Li, Ri]。
 * 对于每个查询 i，请你计算从 Li 到 Ri 的 XOR 值（即 arr[Li] xor arr[Li+1] xor ... xor arr[Ri]）作为本次查询的结果。
 * 并返回一个包含给定查询 queries 所有结果的数组。
 *
 * 示例 1：
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
 *
 * 示例 2：
 * 输入：arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
 * 输出：[8,0,4,4]
 *
 * 提示：
 * 1 <= arr.length <= 3 * 10^4
 * 1 <= arr[i] <= 10^9
 * 1 <= queries.length <= 3 * 10^4
 * queries[i].length == 2
 * 0 <= queries[i][0] <= queries[i][1] < arr.length
 */
public class XORQueriesSubarray {
    /**
     * 方法一：暴力法
     * @param arr
     * @param queries
     * @return
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];

        //遍历查询数组，计算异或值
        int i = 0;
        for (int[] query : queries) {
            res[i] = xor(query[0],query[1],arr);
            i++;
        }
        return res;
    }

    /**
     * 计算从left到right的异或值，
     * @param left
     * @param right
     * @param arr
     * @return
     */
    private int xor(int left, int right,int[] arr) {
        int res = 0;
        for (int i = left; i <= right; ++i){
            res ^=  arr[i];
        }
        return res;
    }

    /**
     * 方法二：暴力和
     * @param arr
     * @param queries
     * @return
     */
    public int[] xorQueries_math(int[] arr, int[][] queries) {
        /*
          计算从0~n的前缀和，
         */
        int[] xor = new int[arr.length + 1];
        xor[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            xor[i] = arr[i - 1] ^ xor[i - 1];
        }

        /*
          计算每个查询的结果，第 i 个查询的结果为 xor[queries[i][0]]⊕xor[queries[i][1]+1]。

         */
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = xor[queries[i][0]] ^ xor[queries[i][1] + 1];
        }
        return res;
    }
}
