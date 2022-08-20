package com.leetcode.L601_700.L0688;

public class KProbabilityChessboardTest {
    public static void main(String[] args) {
        KProbabilityChessboard kProbabilityChessboard = new KProbabilityChessboard();
        /*
          示例 1：
          输入: n = 3, k = 2, row = 0, column = 0
          输出: 0.0625
          解释: 有两步(到(1,2)，(2,1))可以让骑士留在棋盘上。
          在每一个位置上，也有两种移动可以让骑士留在棋盘上。
          骑士留在棋盘上的总概率是0.0625。
         */
        System.out.println(kProbabilityChessboard.knightProbability(3, 2, 0, 0));
        /*
          示例 2：
          输入: n = 1, k = 0, row = 0, column = 0
          输出: 1.00000
         */
        System.out.println(kProbabilityChessboard.knightProbability(1, 0, 0, 0));
    }
}
