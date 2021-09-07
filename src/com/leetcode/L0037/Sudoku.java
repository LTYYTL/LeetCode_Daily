package com.leetcode.L0037;

/**
 * 37. 解数独
 * 编写一个程序，通过已填充的空格来解决数独问题。
 * 一个数独的解法需遵循如下规则：
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 空白格用 '.' 表示。
 *示例1:
 *
 * 输入:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 *
 * 输出: true
 * Note:
 * 给定的数独序列只包含数字 1-9 和字符 '.' 。
 * 你可以假设给定的数独只有唯一解。
 * 给定数独永远是 9x9 形式的。
 */
public class Sudoku {
    /**
     * 方法：回溯算法
     * @param board
     */
    public void solveSudoku(char[][] board) {
        //空值情况
        if(board == null || board.length == 0 || board[0].length==0)
            return;
        solve(board,0,0);
    }

    private boolean solve(char[][] board, int i, int j) {
        int m = 9;
        int n = 9;
        if (j == n){
            //穷举到最后一列的话换到下一行重新开始
            return solve(board,i+1,0);
        }
        if (i == m){
            //找到一个可行解，触发base case
            return true;
        }

        if (board[i][j] != '.'){
            //有预设数，不用穷举
            return solve(board,i,j+1);
        }

        for (char ch = '1'; ch <= '9';ch++){
            //遇到不合法的数字，就跳过
            if (!isValid(board,i,j,ch))
                continue;

            board[i][j] = ch;
            //找到一个可行解，立即结束
            if (solve(board,i,j+1))
                return true;
            board[i][j] = '.';
        }
        //穷举完1~9,依旧没有找到可行解
        return false;
    }

    /**
     * 填入数字
     * @param board 数独
     * @return
     */
    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                //如果有空格
                if (board[i][j] == '.'){
                    //就找寻剩下能放的数字
                    for (char num = '1'; num <= '9'; num++){
                        //判断当前位置放的数字是否有效
                        if (isValid(board,i,j,num)){
                            //将数字放入该位置
                            board[i][j] = num;
                            // 接着递归判断剩余空格是否也可以满足
                            if (solve(board)){
                                return true;
                            }
                            else {
                                //不满足就恢复原状态进行下一轮循环
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 判断填入数字是否有效
     * @param board 数独
     * @param row   行
     * @param col   列
     * @param num   填入数字
     * @return      是否有效
     */
    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++){
            // 判断当前行，当前列，当前格子里是否出现过现在正遍历到的数字
            if (board[i][col] == num)
                return false;
            if (board[row][i] == num)
                return false;
            if (board[3*(row/3)+i/3][3*(col/3)+i%3] == num)
                return false;
        }
        return true;
    }
}
