package com.leetcode.L901_1000.L0994;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. 腐烂的橘子
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 * (1)值 0 代表空单元格；
 * (2)值 1 代表新鲜橘子；
 * (3)值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 *
 * 示例 1：
 * 输入：[[2,1,1],[1,1,0],[0,1,1]]
 * 输出：4
 *
 * 示例 2：
 * 输入：[[2,1,1],[0,1,1],[1,0,1]]
 * 输出：-1
 * 解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
 *
 * 示例 3：
 * 输入：[[0,2]]
 * 输出：0
 * 解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
 *
 * 提示：
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] 仅为 0、1 或 2
 */
public class RottingOranges {
    /**
     * 方法：广度优先搜索
     * @param grid
     * @return
     */
    public int orangesRotting(int[][] grid) {
        //长度
        int m = grid.length;
        int n = grid[0].length;
        //队列
        Queue<int[]> queue = new LinkedList<>();
        //是否已访问
        boolean[][] vis = new boolean[m][n];
        //记录
        int count = 0;
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //记录新鲜橘子的个数
                if (grid[i][j] == 1)
                    count++;
                else if(grid[i][j] == 2) {//将腐烂的橘子入队
                    queue.offer(new int[]{i, j});
                    //变成已访问
                    vis[i][j] = true;
                }
            }
        }

        //没有新鲜的橘子
        if (count == 0)
            return 0;

        //最小分钟
        int res = 0;
        //四个方向
        int[][] dis ={{1,0},{-1,0},{0,1},{0,-1}};
        //遍历队列，当没有新鲜橘子退出
        while (!queue.isEmpty() && count != 0){
            //当前的队列的长度
            int size = queue.size();
            //遍历当前层
            for (int i = 0; i < size; i++) {
                //队首元素
                int[] cur = queue.poll();
                //四个方向
                for (int k = 0; k < 4; k++) {
                    //新坐标
                    int x = cur[0] + dis[k][0];
                    int y = cur[1] + dis[k][1];
                    //越界、已访问、不是新鲜橘子就进入下一循环
                    if (x < 0 || x>= m || y < 0 || y >= n || vis[x][y] || grid[x][y] != 1)
                        continue;
                    //变成不新鲜橘子
                    grid[x][y] = 2;
                    //加入队列
                    queue.offer(new int[]{x,y});
                    //变成已访问
                    vis[x][y] = true;
                    //减少新鲜橘子的数目
                    count--;
                }
            }
            //增加分钟
            res++;
        }
        //判断是否还有新鲜橘子
        return count == 0 ? res : -1;
    }
}
