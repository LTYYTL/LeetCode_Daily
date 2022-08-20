package com.leetcode.L301_400.L0390;

public class EliminationGameTest {
    public static void main(String[] args) {
        EliminationGame eliminationGame = new EliminationGame();
        /*
          示例 1：
          输入：n = 9
          输出：6
          解释：
          arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
          arr = [2, 4, 6, 8]
          arr = [2, 6]
          arr = [6]
         */
        System.out.println(eliminationGame.lastRemaining(9));
        /*
          示例 2：
          输入：n = 1
          输出：1
         */
        System.out.println(eliminationGame.lastRemaining(1));
    }
}
