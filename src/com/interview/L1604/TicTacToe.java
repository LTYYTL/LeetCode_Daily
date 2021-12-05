package com.interview.L1604;


/**
 * 面试题 16.04. 井字游戏
 * 设计一个算法，判断玩家是否赢了井字游戏。输入是一个 N x N 的数组棋盘，由字符" "，"X"和"O"组成，其中字符" "代表一个空位。
 * 以下是井字游戏的规则：
 * (1)玩家轮流将字符放入空位（" "）中。
 * (2)第一个玩家总是放字符"O"，且第二个玩家总是放字符"X"。
 * (3)"X"和"O"只允许放置在空位中，不允许对已放有字符的位置进行填充。
 * (4)当有N个相同（且非空）的字符填充任何行、列或对角线时，游戏结束，对应该字符的玩家获胜。
 * (5)当所有位置非空时，也算为游戏结束。
 * (6)如果游戏结束，玩家不允许再放置字符。
 * (7)如果游戏存在获胜者，就返回该游戏的获胜者使用的字符（"X"或"O"）；如果游戏以平局结束，则返回 "Draw"；如果仍会有行动（游戏未结束），则返回 "Pending"。
 *
 * 示例 1：
 * 输入： board = ["O X"," XO","X O"]
 * 输出： "X"
 *
 * 示例 2：
 * 输入： board = ["OOX","XXO","OXO"]
 * 输出： "Draw"
 * 解释： 没有玩家获胜且不存在空位
 *
 * 示例 3：
 * 输入： board = ["OOX","XXO","OX "]
 * 输出： "Pending"
 * 解释： 没有玩家获胜且仍存在空位
 *
 * 提示：
 * 1 <= board.length == board[i].length <= 100
 * 输入一定遵循井字棋规则
 */
public class TicTacToe {
    /**
     * 方法：模拟
     * @param board
     * @return
     */
    public String tictactoe(String[] board) {
        //长度
        int n = board.length;
        //左对角线字符和
        int left = 0;
        //右对角线字符和
        int right = 0;
        //空格标志位
        boolean flag = false;
        //行遍历
        for (int i = 0; i < n; i++) {
            //横行字符和
            int col = 0;
            //纵行字符和
            int row = 0;
            //列遍历
            for (int j = 0; j < n; j++) {
                //记录和
                col += board[i].charAt(j);
                row += board[j].charAt(i);
                //判断是否有空
                if (board[i].charAt(j) == ' ')
                    flag = true;
            }
            //判断横行或者纵行是否满足全是‘X’的字符和
            if (col == 'X' * n || row == 'X' * n)
                return "X";
            //判断横行或者纵行是否满足全是‘O’的字符和
            if (col == 'O' * n || row == 'O' * n)
                return "O";
            //记录两个对角线的字符和
            left += board[i].charAt(i);
            right += board[i].charAt(n-i-1);
        }
        //判断左对角线或者右对角线是否满足全是‘X’的字符和
        if (left == 'X' * n || right == 'X' * n)
            return "X";
        //判断左对角线或者右对角线是否满足全是‘O’的字符和
        if (left == 'O' * n || right == 'O' * n)
            return "O";
        //都不满足判断是否有空格
        if (flag)
            return "Pending";
        return "Draw";
    }
}
