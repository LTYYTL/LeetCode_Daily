package com.leetcode.L701_800.L0790;

public class DominoTest {
    public static void main(String[] args) {
        Domino domino = new Domino();
        /*
          示例 1:
          输入: n = 3
          输出: 5
          解释: 五种不同的方法如上所示。
         */
        System.out.println(domino.numTilings(3));
        /*
          示例 2:
          输入: n = 1
          输出: 1
         */
        System.out.println(domino.numTilings(1));
    }
}
