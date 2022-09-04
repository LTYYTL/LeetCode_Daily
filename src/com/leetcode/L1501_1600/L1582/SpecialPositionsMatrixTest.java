package com.leetcode.L1501_1600.L1582;

public class SpecialPositionsMatrixTest {
    public static void main(String[] args) {
        SpecialPositionsMatrix specialPositionsMatrix = new SpecialPositionsMatrix();
        /*
          示例 1：
          输入：mat = [[1,0,0],
                      [0,0,1],
                      [1,0,0]]
          输出：1
          解释：(1,2) 是一个特殊位置，因为 mat[1][2] == 1 且所处的行和列上所有其他元素都是 0
         */
        System.out.println(specialPositionsMatrix.numSpecial(new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}));
        /*
          示例 2：
          输入：mat = [[1,0,0],
                      [0,1,0],
                      [0,0,1]]
          输出：3
          解释：(0,0), (1,1) 和 (2,2) 都是特殊位置
         */
        System.out.println(specialPositionsMatrix.numSpecial(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        /*
          示例 3：
          输入：mat = [[0,0,0,1],
                      [1,0,0,0],
                      [0,1,1,0],
                      [0,0,0,0]]
          输出：2
         */
        System.out.println(specialPositionsMatrix.numSpecial(new int[][]{{0, 0, 0, 1}, {1, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
        /*
          示例 4：
          输入：mat = [[0,0,0,0,0],
                      [1,0,0,0,0],
                      [0,1,0,0,0],
                      [0,0,1,0,0],
                      [0,0,0,1,1]]
          输出：3
         */
        System.out.println(specialPositionsMatrix.numSpecial(new int[][]{{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}}));

    }
}
