package com.leetcode.L601_700.L0684;

import java.util.Arrays;

public class RedundantConnectionTest {
    public static void main(String[] args) {
        RedundantConnection redundantConnection = new RedundantConnection();
        /*
          示例 1：
          输入: edges = [[1,2], [1,3], [2,3]]
          输出: [2,3]
         */
        System.out.println(Arrays.toString(redundantConnection.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}})));
        /*
          示例 2：
          输入: edges = [[1,2], [2,3], [3,4], [1,4], [1,5]]
          输出: [1,4]
         */
        System.out.println(Arrays.toString(redundantConnection.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}})));
    }
}
