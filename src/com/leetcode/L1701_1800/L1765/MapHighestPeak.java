package com.leetcode.L1701_1800.L1765;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1765. 地图中的最高点
 * 给你一个大小为 m x n 的整数矩阵 isWater ，它代表了一个由 陆地 和 水域 单元格组成的地图。
 * (1)如果 isWater[i][j] == 0 ，格子 (i, j) 是一个 陆地 格子。
 * (2)如果 isWater[i][j] == 1 ，格子 (i, j) 是一个 水域 格子。
 *
 * 你需要按照如下规则给每个单元格安排高度：
 * (1)每个格子的高度都必须是非负的。
 * (2)如果一个格子是是 水域 ，那么它的高度必须为 0 。
 * (3)任意相邻的格子高度差 至多 为 1 。当两个格子在正东、南、西、北方向上相互紧挨着，就称它们为相邻的格子。（也就是说它们有一条公共边）
 * 找到一种安排高度的方案，使得矩阵中的最高高度值 最大 。
 *
 * 请你返回一个大小为 m x n 的整数矩阵 height ，其中 height[i][j] 是格子 (i, j) 的高度。如果有多种解法，请返回 任意一个 。
 *
 * 示例 1：
 * 输入：isWater = [[0,1],[0,0]]
 * 输出：[[1,0],[2,1]]
 * 解释：上图展示了给各个格子安排的高度。
 * 蓝色格子是水域格，绿色格子是陆地格。
 *
 * 示例 2：
 * 输入：isWater = [[0,0,1],[1,0,0],[0,0,0]]
 * 输出：[[1,1,0],[0,1,1],[1,2,2]]
 * 解释：所有安排方案中，最高可行高度为 2 。
 * 任意安排方案中，只要最高高度为 2 且符合上述规则的，都为可行方案。
 *
 * 提示：
 * m == isWater.length
 * n == isWater[i].length
 * 1 <= m, n <= 1000
 * isWater[i][j] 要么是 0 ，要么是 1 。
 * 至少有 1 个水域格子。
 */
public class MapHighestPeak {
    /**
     * 方法：广度优先搜索
     * @param isWater
     * @return
     */
    public int[][] highestPeak(int[][] isWater) {
        //长度
        int m = isWater.length;
        int n = isWater[0].length;
        //队列存储坐标
        Queue<int[]> queue = new LinkedList<>();
        //结果集，同时记录是否被访问
        int[][] vis = new int[m][n];
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //水域入队
                if (isWater[i][j] == 1){
                    queue.add(new int[]{i,j});
                    vis[i][j] = 0;
                }else {//陆地未访问状态
                    vis[i][j] = -1;
                }
            }
        }
        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};
        //遍历的层数
        int level = 1;
        while (!queue.isEmpty()){
            //当前层的节点数
            int size = queue.size();
            //遍历
            for (int i = 0; i < size; i++) {
                //当前节点
                int[] cur = queue.poll();
                //四个方向
                for (int j = 0; j < 4; j++) {
                    //新坐标
                    int x = cur[0] + dis[j][0];
                    int y = cur[1] + dis[j][1];
                    //判断是否越界或者访问过
                    if (x < 0 || x >= m || y < 0 || y >= n || vis[x][y] != -1)
                        continue;
                    //记录高度，并且变成已访问状态
                    vis[x][y] = level;
                    //入队
                    queue.add(new int[]{x,y});
                }
            }
            //增加层数
            level++;
        }
        return vis;
    }
}
