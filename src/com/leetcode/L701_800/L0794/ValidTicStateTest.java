package com.leetcode.L701_800.L0794;

public class ValidTicStateTest {
    public static void main(String[] args) {
        ValidTicState validTicState = new ValidTicState();
        /*
          示例 1：
          输入：board = ["O  ","   ","   "]
          输出：false
          解释：玩家 1 总是放字符 "X" 。
         */
        System.out.println(validTicState.validTicTacToe(new String[]{"O  ", "   ", "   "}));
        /*
          示例 2：
          输入：board = ["XOX"," X ","   "]
          输出：false
          解释：玩家应该轮流放字符。
         */
        System.out.println(validTicState.validTicTacToe(new String[]{"XOX", " X ", "   "}));
        /*
          示例 3：
          输入：board = ["XXX","   ","OOO"]
          输出：false
         */
        System.out.println(validTicState.validTicTacToe(new String[]{"XXX", "   ", "OOO"}));
    }
}
