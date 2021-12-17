package com.interview.L0812;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面试题 08.12. 八皇后
 * 设计一种算法，打印 N 皇后在 N × N 棋盘上的各种摆法，其中每个皇后都不同行、不同列，也不在对角线上。
 * 这里的“对角线”指的是所有的对角线，不只是平分整个棋盘的那两条对角线。
 * 注意：本题相对原题做了扩展
 *
 * 示例:
 *  输入：4
 *  输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 *  解释: 4 皇后问题存在如下两个不同的解法。
 * [
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
 */
public class EightQueens {
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
