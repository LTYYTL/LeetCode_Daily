package com.leetcode.L1201_1300.L1219;

/**
 * 1219. 黄金矿工
 * 你要开发一座金矿，地质勘测学家已经探明了这座金矿中的资源分布，并用大小为 m * n 的网格 grid 进行了标注。
 * 每个单元格中的整数就表示这一单元格中的黄金数量；如果该单元格是空的，那么就是 0。
 *
 * 为了使收益最大化，矿工需要按以下规则来开采黄金：
 * (1)每当矿工进入一个单元，就会收集该单元格中的所有黄金。
 * (2)矿工每次可以从当前位置向上下左右四个方向走。
 * (3)每个单元格只能被开采（进入）一次。
 * (4)不得开采（进入）黄金数目为 0 的单元格。
 * (5)矿工可以从网格中 任意一个 有黄金的单元格出发或者是停止。
 *
 * 示例 1：
 * 输入：grid = [[0,6,0],[5,8,7],[0,9,0]]
 * 输出：24
 * 解释：
 * [[0,6,0],
 *  [5,8,7],
 *  [0,9,0]]
 * 一种收集最多黄金的路线是：9 -> 8 -> 7。
 *
 * 示例 2：
 * 输入：grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
 * 输出：28
 * 解释：
 * [[1,0,7],
 *  [2,0,6],
 *  [3,4,5],
 *  [0,3,0],
 *  [9,0,20]]
 * 一种收集最多黄金的路线是：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7。
 *
 * 提示：
 * 1 <= grid.length, grid[i].length <= 15
 * 0 <= grid[i][j] <= 100
 * 最多 25 个单元格中有黄金。
 */
public class PathMaxGold {
    //长度
    private int m;
    private int n;
    //四个方向
    private int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};

    /**
     * 方法：回溯算法
     * @param grid
     * @return
     */
    public int getMaximumGold(int[][] grid) {
        //长度
        m = grid.length;
        n = grid[0].length;
        //访问标志位
        boolean[][] vis = new boolean[m][n];
        //结果
        int res = 0;
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //从不为0的位置开始遍历
                if (grid[i][j] != 0)
                    //获取最大收益
                    res = Math.max(res,dfs(grid,vis,i,j));
            }
        }
        return res;
    }

    /**
     * 深度优先搜索
     * @param grid
     * @param vis
     * @param i
     * @param j
     * @return
     */
    private int dfs(int[][] grid, boolean[][] vis, int i, int j) {
        //结束条件
        if (grid[i][j] == 0 || vis[i][j])
            return 0;
        //当前变成已访问
        vis[i][j] = true;
        //收益
        int res = 0;
        //遍历四个方向
        for (int k = 0; k < 4; k++) {
            //新坐标
            int x = i + dis[k][0];
            int y = j + dis[k][1];
            //不越界
            if (x < 0 || x >= m || y < 0 || y >= n)
                continue;
            //计算最大收益
            res = Math.max(res,dfs(grid, vis, x, y));
        }
        //改变为未访问
        vis[i][j] = false;
        //收益
        return res + grid[i][j];
    }
}
