package com.interview.L1604;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        /**
         * 示例 1：
         * 输入： board = ["O X"," XO","X O"]
         * 输出： "X"
         */
        System.out.println(ticTacToe.tictactoe(new String[]{"O X", " XO", "X O"}));
        /**
         * 示例 2：
         * 输入： board = ["OOX","XXO","OXO"]
         * 输出： "Draw"
         * 解释： 没有玩家获胜且不存在空位
         */
        System.out.println(ticTacToe.tictactoe(new String[]{"OOX", "XXO", "OXO"}));
        /**
         * 示例 3：
         * 输入： board = ["OOX","XXO","OX "]
         * 输出： "Pending"
         * 解释： 没有玩家获胜且仍存在空位
         */
        System.out.println(ticTacToe.tictactoe(new String[]{"OOX", "XXO", "OX "}));
    }
}
