package com.interview.L0810;

import java.util.Arrays;

public class ColorFillTest {
    public static void main(String[] args) {
        ColorFill colorFill = new ColorFill();
        /**
         * 示例：
         * 输入：
         * image = [[1,1,1],[1,1,0],[1,0,1]]
         * sr = 1, sc = 1, newColor = 2
         * 输出：[[2,2,2],[2,2,0],[2,0,1]]
         * 解释:
         * 初始坐标点位于图像的正中间，坐标 (sr,sc)=(1,1) 。
         * 初始坐标点周围区域上所有符合条件的像素点的颜色都被更改成 2 。
         * 注意，右下角的像素没有更改为 2 ，因为它不属于初始坐标点的周围区域。
         */
        for (int[] ints : colorFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
