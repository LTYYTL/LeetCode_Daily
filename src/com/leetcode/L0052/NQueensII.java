package com.leetcode.L0052;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 52. N皇后 II
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 给定一个整数 n，返回 n 皇后不同的解决方案的数量。
 *
 * 示例:
 * 输入: 4
 * 输出: 2
 * 解释: 4 皇后问题存在如下两个不同的解法。
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
 *
 * 提示：
 * 皇后，是国际象棋中的棋子，意味着国王的妻子。皇后只做一件事，那就是“吃子”。当她遇见可以吃的棋子时，就迅速冲上去吃掉棋子。当然，她横、竖、斜都可走一或 N-1 步，可进可退。（引用自 百度百科 - 皇后 ）
 * 通过次数45,319提交次数55,330
 */
public class NQueensII {
    /**
     * 方法：回溯算法
     * @param n
     * @return
     */
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n == 0) {
            return 0;
        }
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        //深度优先搜索
        dfs(arr, 0, n, res);
        return res.size();
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