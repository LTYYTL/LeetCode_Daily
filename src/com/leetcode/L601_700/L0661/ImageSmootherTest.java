package com.leetcode.L601_700.L0661;

import java.util.Arrays;

public class ImageSmootherTest {
    public static void main(String[] args) {
        ImageSmoother imageSmoother = new ImageSmoother();
        /*
          示例 1:
          输入:img = [[1,1,1],[1,0,1],[1,1,1]]
          输出:[[0, 0, 0],[0, 0, 0], [0, 0, 0]]
          解释:
          对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
          对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
          对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
         */
        System.out.println(Arrays.deepToString(imageSmoother.imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})));
        /*
          示例 2:
          输入: img = [[100,200,100],[200,50,200],[100,200,100]]
          输出: [[137,141,137],[141,138,141],[137,141,137]]
          解释:
          对于点 (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137
          对于点 (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141
          对于点 (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138
         */
        System.out.println(Arrays.deepToString(imageSmoother.imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}})));
    }
}
