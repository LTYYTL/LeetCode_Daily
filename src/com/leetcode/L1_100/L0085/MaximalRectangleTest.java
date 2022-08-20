package com.leetcode.L1_100.L0085;

public class MaximalRectangleTest {
    public static void main(String[] args) {
        MaximalRectangle maximalRectangle = new MaximalRectangle();
        /*
          示例 1：
          输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
          输出：6
          解释：最大矩形如上图所示。
         */
        System.out.println(maximalRectangle.maximalRectangle(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));
        /*
          示例 2：
          输入：matrix = []
          输出：0
         */
        System.out.println(maximalRectangle.maximalRectangle(new char[][]{}));
        /*
          示例 3：
          输入：matrix = [["0"]]
          输出：0
         */
        System.out.println(maximalRectangle.maximalRectangle(new char[][]{{'0'}}));
        /*
          示例 4：
          输入：matrix = [["1"]]
          输出：1
         */
        System.out.println(maximalRectangle.maximalRectangle(new char[][]{{'1'}}));
        /*
          示例 5：
          输入：matrix = [["0","0"]]
          输出：0
         */
        System.out.println(maximalRectangle.maximalRectangle(new char[][]{{'0', '0'}}));
    }
}
