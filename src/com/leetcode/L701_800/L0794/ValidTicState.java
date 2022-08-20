package com.leetcode.L701_800.L0794;

/**
 * 794. 有效的井字游戏
 * 给你一个字符串数组 board 表示井字游戏的棋盘。当且仅当在井字游戏过程中，棋盘有可能达到 board 所显示的状态时，才返回 true 。
 * 井字游戏的棋盘是一个 3 x 3 数组，由字符 ' '，'X' 和 'O' 组成。字符 ' ' 代表一个空位。
 *
 * 以下是井字游戏的规则：
 * (1)玩家轮流将字符放入空位（' '）中。
 * (2)玩家 1 总是放字符 'X' ，而玩家 2 总是放字符 'O' 。
 * (3)'X' 和 'O' 只允许放置在空位中，不允许对已放有字符的位置进行填充。
 * (4)当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。
 * (5)当所有位置非空时，也算为游戏结束。
 * (6)如果游戏结束，玩家不允许再放置字符。
 *
 * 示例 1：
 * 输入：board = ["O  ","   ","   "]
 * 输出：false
 * 解释：玩家 1 总是放字符 "X" 。
 *
 * 示例 2：
 * 输入：board = ["XOX"," X ","   "]
 * 输出：false
 * 解释：玩家应该轮流放字符。
 *
 * 示例 3：
 * 输入：board = ["XXX","   ","OOO"]
 * 输出：false
 *
 * 提示：
 * board.length == 3
 * board[i].length == 3
 * board[i][j] 为 'X'、'O' 或 ' '
 */
public class ValidTicState {
    /**
     * 方法：模拟
     * @param board
     * @return
     */
    public boolean validTicTacToe(String[] board) {
        //记录次数
        int x = 0;
        int o = 0;
        //遍历
        for (String s : board) {
            for (char c : s.toCharArray()) {
                x = (c == 'X') ? x + 1 : x;
                o = (c == 'O') ? o + 1 : o;
            }
        }

        // xcount>=ocount，且相差不超过1
        if (x != o && x != o + 1)
            return false;
        // 1号玩家赢，则xcount>ocount
        if (x != o + 1 && win(board, 'X'))
            return false;
        // 2号玩家赢，则xcount==ocount
        return x == o || !win(board, 'O');
    }

    private boolean win(String[] board, char c){
        for (int i = 0; i < 3; i++) {
            //列
            if (c == board[0].charAt(i) && c == board[1].charAt(i) && c == board[2].charAt(i))
                return true;
            //行
            if (c == board[i].charAt(0) && c == board[i].charAt(1) && c == board[i].charAt(2))
                return true;
        }
        //左对角线
        if (c == board[0].charAt(0) && c == board[1].charAt(1) && c == board[2].charAt(2))
            return true;
        //右对角线
        return c == board[2].charAt(0) && c == board[1].charAt(1) && c == board[0].charAt(2);
    }
}
