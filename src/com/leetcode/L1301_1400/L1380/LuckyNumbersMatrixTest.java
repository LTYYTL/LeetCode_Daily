package com.leetcode.L1301_1400.L1380;

public class LuckyNumbersMatrixTest {
    public static void main(String[] args) {
        LuckyNumbersMatrix luckyNumbersMatrix = new LuckyNumbersMatrix();
        /*
          示例 1：
          输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
          输出：[15]
          解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
         */
        System.out.println(luckyNumbersMatrix.luckyNumbers(new int[][]{
                {3, 7, 9},
                {9, 11, 13},
                {15, 16, 17},
        }));
        /*
          示例 2：
          输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
          输出：[12]
          解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
         */
        System.out.println(luckyNumbersMatrix.luckyNumbers(new int[][]{
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12},
        }));
        /*
          示例 3：
          输入：matrix = [[7,8],[1,2]]
          输出：[7]
         */
        System.out.println(luckyNumbersMatrix.luckyNumbers(new int[][]{
                {7, 8},
                {1, 2}
        }));
    }
}
