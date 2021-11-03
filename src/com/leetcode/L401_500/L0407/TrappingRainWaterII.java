package com.leetcode.L401_500.L0407;

import java.util.PriorityQueue;

/**
 * 407. 接雨水 II
 * 给你一个 m x n 的矩阵，其中的值均为非负整数，代表二维高度图每个单元的高度，请计算图中形状最多能接多少体积的雨水。
 *
 * 示例 1:
 * 输入: heightMap = [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
 * 输出: 4
 * 解释: 下雨后，雨水将会被上图蓝色的方块中。总的接雨水量为1+2+1=4。
 *
 * 示例 2:
 * 输入: heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
 * 输出: 10
 *
 * 提示:
 * m == heightMap.length
 * n == heightMap[i].length
 * 1 <= m, n <= 200
 * 0 <= heightMap[i][j] <= 2 * 104
 *
 */
public class TrappingRainWaterII {
    /**
     * 方法：堆
     * @param heightMap
     * @return
     */
    public int trapRainWater(int[][] heightMap) {
        //特殊情况
        if (heightMap.length <=2 || heightMap[0].length <= 2)
            return 0;
        //长度
        int m = heightMap.length;
        int n = heightMap[0].length;
        //是否已经被访问
        boolean[][] vis = new boolean[m][n];
        //按照高度存入堆中
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[2] - o2[2]);

        //存入最外圈，因为最外圈的不会注入水
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1){
                    queue.offer(new int[]{i,j,heightMap[i][j]});
                    vis[i][j] = true;
                }
            }
        }

        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,-1},{0,1}};
        //结果集
        int res = 0;
        //遍历堆
        while (!queue.isEmpty()){
            //堆顶元素
            int[] cur = queue.poll();
            //四个方向
            for (int i = 0; i < 4; i++) {
                //新坐标
                int x = cur[0] + dis[i][0];
                int y = cur[1] + dis[i][1];
                //判断是否已经越界或者访问过
                if (x <= 0 || x >= m || y <= 0 || y >= n || vis[x][y])
                    continue;
                //比堆顶元素矮，注入水，高度为两个的高度差
                if (cur[2] > heightMap[x][y])
                    res += cur[2] - heightMap[x][y];
                //加入堆中，高度为最大高度
                queue.offer(new int[]{x,y,Math.max(heightMap[x][y],cur[2])});
                //标记为已访问
                vis[x][y] = true;
            }
        }

        return res;
    }
}
