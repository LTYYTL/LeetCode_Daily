package com.leetcode.L701_800.L0733;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 733. 图像渲染
 * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
 * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
 * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，
 * 接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
 * 最后返回经过上色渲染后的图像。
 *
 * 示例 1:
 * 输入:
 * image = [[1,1,1],[1,1,0],[1,0,1]]
 * sr = 1, sc = 1, newColor = 2
 * 输出: [[2,2,2],[2,2,0],[2,0,1]]
 * 解析:
 * 在图像的正中间，(坐标(sr,sc)=(1,1)),
 * 在路径上所有符合条件的像素点的颜色都被更改成2。
 * 注意，右下角的像素没有更改为2，
 * 因为它不是在上下左右四个方向上与初始点相连的像素点。
 *
 * 注意:
 * image 和 image[0] 的长度在范围 [1, 50] 内。
 * 给出的初始点将满足 0 <= sr < image.length 和 0 <= sc < image[0].length。
 * image[i][j] 和 newColor 表示的颜色值在范围 [0, 65535]内。
 */
public class FloodFill {
    /**
     * 方法：广度优先搜索
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //长度
        int m = image.length;
        int n = image[0].length;
        //初始坐标的颜色
        int target = image[sr][sc];
        if (target == newColor)
            return image;
        //染色
        image[sr][sc] = newColor;
        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};

        //放入初始坐标
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});

        //遍历
        while (!queue.isEmpty()){
            //队首元素
            int[] cur = queue.poll();
            //遍历四个方向
            for (int i = 0; i < 4; i++) {
                //新坐标
                int x = cur[0] + dis[i][0];
                int y = cur[1] + dis[i][1];
                //越界，不是相同的像素值
                if(x < 0 || x >= m || y < 0 || y >= n || image[x][y] != target)
                    continue;
                //染色
                image[x][y] = newColor;
                //加入队列
                queue.offer(new int[]{x,y});
            }
        }
        return image;
    }
}
