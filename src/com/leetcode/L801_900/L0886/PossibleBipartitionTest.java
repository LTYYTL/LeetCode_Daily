package com.leetcode.L801_900.L0886;

public class PossibleBipartitionTest {
    public static void main(String[] args) {
        PossibleBipartition possibleBipartition = new PossibleBipartition();
        /*
          示例 1：
          输入：n = 4, dislikes = [[1,2],[1,3],[2,4]]
          输出：true
          解释：group1 [1,4], group2 [2,3]
         */
        System.out.println(possibleBipartition.possibleBipartition(4, new int[][]{{1, 2}, {1, 3}, {2, 4}}));
        /*
          示例 2：
          输入：n = 3, dislikes = [[1,2],[1,3],[2,3]]
          输出：false
         */
        System.out.println(possibleBipartition.possibleBipartition(3, new int[][]{{1, 2}, {1, 3}, {2, 3}}));
        /*
          示例 3：
          输入：n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
          输出：false
         */
        System.out.println(possibleBipartition.possibleBipartition(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}));
    }
}
