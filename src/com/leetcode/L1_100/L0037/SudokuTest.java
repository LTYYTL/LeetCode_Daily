package com.leetcode.L1_100.L0037;

import java.util.Arrays;

public class SudokuTest {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        sudoku.solveSudoku(board);
        for (char[] num:board) {
            System.out.println(Arrays.toString(num));
        }

    }
}
