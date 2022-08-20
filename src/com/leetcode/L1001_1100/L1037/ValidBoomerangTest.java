package com.leetcode.L1001_1100.L1037;

public class ValidBoomerangTest {
    public static void main(String[] args) {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        /*
          示例 1：
          输入：points = [[1,1],[2,3],[3,2]]
          输出：true
         */
        System.out.println(validBoomerang.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
        /*
          示例 2：
          输入：points = [[1,1],[2,2],[3,3]]
          输出：false
         */
        System.out.println(validBoomerang.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }
}
