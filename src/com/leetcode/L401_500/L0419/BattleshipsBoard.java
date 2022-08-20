package com.leetcode.L401_500.L0419;

/**
 * 419. 甲板上的战舰
 * 给你一个大小为 m x n 的矩阵 board 表示甲板，其中，每个单元格可以是一艘战舰 'X' 或者是一个空位 '.' ，返回在甲板 board 上放置的 战舰 的数量。
 * 战舰 只能水平或者垂直放置在 board 上。换句话说，战舰只能按 1 x k（1 行，k 列）或 k x 1（k 行，1 列）的形状建造，其中 k 可以是任意大小。
 * 两艘战舰之间至少有一个水平或垂直的空位分隔 （即没有相邻的战舰）。
 *
 * 示例 1：
 * 输入：board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
 * 输出：2
 *
 * 示例 2：
 * 输入：board = [["."]]
 * 输出：0
 *
 * 提示：
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] 是 '.' 或 'X'
 *
 *
 * 进阶：你可以实现一次扫描算法，并只使用 O(1) 额外空间，并且不修改 board 的值来解决这个问题吗？
 */
public class BattleshipsBoard {
    /**
     * 方法：模拟
     * 解题思路：因为，每一艘战舰要么是竖着的，要么是横着的，而且两艘不同的战舰之间至少包含一个空格，
     * 也就是说每艘战舰的起点的上方和左方都不会是 'X'，所以，我们只需要统计起点即可。
     * 作者：tong-zhu
     * 链接：<a href="https://leetcode-cn.com/problems/battleships-in-a-board/solution/tong-ge-lai-shua-ti-la-zhi-tong-ji-qi-di-3vnf/">https://leetcode-cn.com/problems/battleships-in-a-board/solution/tong-ge-lai-shua-ti-la-zhi-tong-ji-qi-di-3vnf/</a>
     */
    public int countBattleships(char[][] board) {
        //长度
        int m = board.length;
        int n = board[0].length;
        //结果
        int ans = 0;
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //当前点是X，且左和上不是X
                if (board[i][j] == 'X' && (i == 0 || board[i-1][j] != 'X') && (j == 0 || board[i][j-1] != 'X'))
                    ans++;
            }
        }

        return ans;
    }
}
