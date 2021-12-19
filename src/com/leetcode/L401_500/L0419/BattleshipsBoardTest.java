package com.leetcode.L401_500.L0419;

public class BattleshipsBoardTest {
    public static void main(String[] args) {
        BattleshipsBoard battleshipsBoard = new BattleshipsBoard();
        /**
         * 示例 1：
         * 输入：board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
         * 输出：2
         */
        System.out.println(battleshipsBoard.countBattleships(new char[][]{
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
        }));
        /**
         * 示例 2：
         * 输入：board = [["."]]
         * 输出：0
         */
        System.out.println(battleshipsBoard.countBattleships(new char[][]{
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
        }));
    }
}
