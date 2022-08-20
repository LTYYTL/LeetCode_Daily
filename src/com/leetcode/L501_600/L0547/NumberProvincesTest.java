package com.leetcode.L501_600.L0547;

public class NumberProvincesTest {
    public static void main(String[] args) {
        NumberProvinces numberProvinces = new NumberProvinces();
        /*
          示例 1：
          输入：isConnected = [[1,1,0],[1,1,0],[0,0,1]]
          输出：2
         */
        System.out.println(numberProvinces.findCircleNum(new int[][]{
                {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        }));
        /*
          示例 2：
          输入：isConnected = [[1,0,0],[0,1,0],[0,0,1]]
          输出：3
         */
        System.out.println(numberProvinces.findCircleNum(new int[][]{
                {1, 0, 0}, {0, 1, 0}, {0, 0, 1}
        }));
    }
}
