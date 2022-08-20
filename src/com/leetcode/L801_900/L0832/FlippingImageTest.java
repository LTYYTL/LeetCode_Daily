package com.leetcode.L801_900.L0832;

import java.util.Arrays;

public class FlippingImageTest {
    public static void main(String[] args) {
        FlippingImage flippingImage = new FlippingImage();
        /*
          示例 1：
          输入：[[1,1,0],[1,0,1],[0,0,0]]
          输出：[[1,0,0],[0,1,0],[1,1,1]]
          解释：首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
               然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
         */
        int[][] nums = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flippingImage.flipAndInvertImage(nums)));
    }
}
