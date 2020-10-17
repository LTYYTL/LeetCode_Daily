package com.leetcode.L0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 51. N 皇后
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 *
 * 示例：
 * 输入：4
 * 输出：[
 *  [".Q..",  // 解法 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // 解法 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * 解释: 4 皇后问题存在两个不同的解法。
 *
 * 提示：
 * 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
 */
public class NQueens {
    /**
     * 方法：回溯算法
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        //深度优先搜索
        dfs(arr, 0, n, res);
        return res;
    }

    private void dfs(char[][] arr, int x, int n, List<List<String>> res) {
        //x是从0开始计算的，当x==n时所有行的皇后都放置完毕，此时记录结果
        if (x == n) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == '.')
                        temp.append(".");
                    else
                        temp.append("Q");
                }
                ans.add(temp.toString());
            }
            res.add(ans);
            return;
        }

        for (int y = 0; y < n; y++) {
            //检查[x,y]这一坐标是否可以放置皇后
            //如果满足条件，就放置皇后，并继续检查下一行
            if (check(arr, x, y, n)) {
                arr[x][y] = 'Q';
                dfs(arr, x+1, n, res);
                arr[x][y] = '.';
            }

        }

    }
    private boolean check ( char[][] arr, int x, int y, int n){
        //检查竖着的一列是否有皇后
        for(int i = 0; i < x; ++i) {
            if(arr[i][y] == 'Q') {
                return false;
            }
        }
        //检查左上到右下的斜边是否有皇后
        int i=x-1, j=y-1;
        while(i>=0 && j>=0) {
            if(arr[i][j]=='Q') {
                return false;
            }
            --i;
            --j;
        }
        //检查左下到右上的斜边是否有皇后
        i = x-1;
        j = y+1;
        while(i>=0 && j<n) {
            if(arr[i][j]=='Q') {
                return false;
            }
            --i;
            ++j;
        }
        return true;
    }
}