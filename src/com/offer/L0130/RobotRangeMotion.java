package com.offer.L0130;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 13. 机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 * 示例 1：
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 *
 * 示例 2：
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
 * 提示：
 * 1 <= n,m <= 100
 * 0 <= k <= 20
 */
public class RobotRangeMotion {
    //方向
    int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    /**
     * 方法：广度优先搜素
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        //结果
        int res = 1;
        //记录访问，防止重复访问
        boolean[][] vis = new boolean[m][n];
        //存储方格坐标
        Queue<int[]> queue = new LinkedList<>();
        //将（0，0）放入队列
        queue.offer(new int[]{0,0});
        //（0，0）被访问
        vis[0][0] = true;
        //遍历队列
        while (!queue.isEmpty()){
            //队首 元素
            int[] cur = queue.poll();
            //坐标（x，y）
            int x = cur[0];
            int y = cur[1];
            //四个方位
            for (int i = 0; i < 4; i++){
                //新坐标（dirX，dirY）
                int dirX = x + dir[i][0];
                int dirY = y + dir[i][1];
                //判断是否越界或者被访问或者大于k
                if (dirX < 0 || dirX >= m || dirY < 0 || dirY >= n || k < op(dirX,dirY) || vis[dirX][dirY])
                    continue;
                //能访问的放入队列
                queue.offer(new int[]{dirX,dirY});
                //标记访问
                vis[dirX][dirY] = true;
                //增加结果
                res++;
            }
        }
        return res;
    }

    /**
     * 计算坐标和
     * @param i
     * @param j
     * @return
     */
    private int op(int i, int j){
        //坐标转换成字符串拼接
        String s = String.valueOf(i) + j;
        //和
        int res = 0;
        for (int k = 0; k < s.length(); k++) {
            res += s.charAt(k) - '0';
        }
        return res;
    }
}
