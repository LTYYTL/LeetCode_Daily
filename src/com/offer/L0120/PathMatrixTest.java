package com.offer.L0120;

public class PathMatrixTest {
    public static void main(String[] args) {
        PathMatrix pathMatrix = new PathMatrix();
        /*
          示例 1：
          输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
          输出：true
         */
        System.out.println(pathMatrix.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        /*
          示例 2：
          输入：board = [["a","b"],["c","d"]], word = "abcd"
          输出：false
         */
        System.out.println(pathMatrix.exist(new char[][]{{'a', 'b'}, {'c', 'd'}}, "abcd"));

    }
}
