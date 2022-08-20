package com.leetcode.L701_800.L0733;

import java.util.Arrays;

public class FloodFillTest{
    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();
        /*
          示例 1:
          输入:
          image = [[1,1,1],[1,1,0],[1,0,1]]
          sr = 1, sc = 1, newColor = 2
          输出: [[2,2,2],[2,2,0],[2,0,1]]
          解析:
          在图像的正中间，(坐标(sr,sc)=(1,1)),
          在路径上所有符合条件的像素点的颜色都被更改成2。
          注意，右下角的像素没有更改为2，
          因为它不是在上下左右四个方向上与初始点相连的像素点。
         */
        for (int[] ints : floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
