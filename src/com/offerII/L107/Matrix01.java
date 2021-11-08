package com.offerII.L107;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer II 107. 矩阵中的距离
 * 给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
 * 两个相邻元素间的距离为 1 。
 *
 * 示例 1：
 * 输入：mat = [[0,0,0],[0,1,0],[0,0,0]]
 * 输出：[[0,0,0],[0,1,0],[0,0,0]]
 *
 * 示例 2：
 * 输入：mat = [[0,0,0],[0,1,0],[1,1,1]]
 * 输出：[[0,0,0],[0,1,0],[1,2,1]]
 *
 * 提示：
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 104
 * 1 <= m * n <= 104
 * mat[i][j] is either 0 or 1.
 * mat 中至少有一个 0
 *
 * 注意：本题与主站 542 题相同：https://leetcode-cn.com/problems/01-matrix/
 */
public class Matrix01 {
    //四个方向
    int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};

    /**
     * 方法：广度优先搜索
     * @param mat
     * @return
     */
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        //是否已访问
        boolean[][] vis = new boolean[mat.length][mat[0].length];
        //遍历
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                //将为0的存储到队列中
                if (mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                    //变成已访问
                    vis[i][j] = true;
                }
            }
        }

        //遍历队列
        while (!queue.isEmpty()){
            //队首元素
            int[] cur = queue.poll();
            //四个方向
            for (int k = 0; k < 4; k++) {
                //新坐标
                int x = cur[0] + dis[k][0];
                int y = cur[1] + dis[k][1];
                //越界，已访问
                if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length || vis[x][y])
                    continue;
                //距离+1
                mat[x][y] = mat[cur[0]][cur[1]] + 1;
                //放入队列
                queue.offer(new int[]{x,y});
                //变成已访问
                vis[x][y] = true;
            }
        }
        return mat;
    }

}
