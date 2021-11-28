package com.interview.L0810;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题 08.10. 颜色填充
 * 编写函数，实现许多图片编辑软件都支持的「颜色填充」功能。
 * 待填充的图像用二维数组 image 表示，元素为初始颜色值。初始坐标点的行坐标为 sr 列坐标为 sc。需要填充的新颜色为 newColor 。
 * 「周围区域」是指颜色相同且在上、下、左、右四个方向上存在相连情况的若干元素。
 * 请用新颜色填充初始坐标点的周围区域，并返回填充后的图像。
 *
 * 示例：
 * 输入：
 * image = [[1,1,1],[1,1,0],[1,0,1]]
 * sr = 1, sc = 1, newColor = 2
 * 输出：[[2,2,2],[2,2,0],[2,0,1]]
 * 解释:
 * 初始坐标点位于图像的正中间，坐标 (sr,sc)=(1,1) 。
 * 初始坐标点周围区域上所有符合条件的像素点的颜色都被更改成 2 。
 * 注意，右下角的像素没有更改为 2 ，因为它不属于初始坐标点的周围区域。
 *
 * 提示：
 * image 和 image[0] 的长度均在范围 [1, 50] 内。
 * 初始坐标点 (sr,sc) 满足 0 <= sr < image.length 和 0 <= sc < image[0].length 。
 * image[i][j] 和 newColor 表示的颜色值在范围 [0, 65535] 内。
 */
public class ColorFill {
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
        //初始点颜色
        int init = image[sr][sc];
        //颜色相等不用改变
        if (init == newColor)
            return image;
        //记录需要改变点的坐标
        Queue<int[]> queue = new LinkedList<>();
        //初始点
        queue.add(new int[]{sr,sc});
        //初始点改变
        image[sr][sc] = newColor;
        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};
        //遍历
        while (!queue.isEmpty()){
            //队首元素
            int[] cur = queue.poll();
            //四个方向
            for (int i = 0; i < 4; i++) {
                //新坐标
                int x = cur[0] + dis[i][0];
                int y = cur[1] + dis[i][1];
                //越界且跟初始点颜色不同的情况不做处理
                if (x < 0 || x >= m || y < 0 || y >= n || image[x][y] != init)
                    continue;
                //加入队列
                queue.add(new int[]{x,y});
                //改变颜色
                image[x][y] = newColor;
            }
        }
        return image;
    }
}
