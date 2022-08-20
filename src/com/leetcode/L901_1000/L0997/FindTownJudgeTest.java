package com.leetcode.L901_1000.L0997;

public class FindTownJudgeTest {
    public static void main(String[] args) {
        FindTownJudge findTownJudge = new FindTownJudge();
        /* *
          示例 1：
          输入：n = 2, trust = [[1,2]]
          输出：2
         */
        System.out.println(findTownJudge.findJudge(2, new int[][]{{1, 2}}));
        /*
          示例 2：
          输入：n = 3, trust = [[1,3],[2,3]]
          输出：3
         */
        System.out.println(findTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        /*
          示例 3：
          输入：n = 3, trust = [[1,3],[2,3],[3,1]]
          输出：-1
         */
        System.out.println(findTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
        /*
          示例 4：
          输入：n = 3, trust = [[1,2],[2,3]]
          输出：-
         */
        System.out.println(findTownJudge.findJudge(3, new int[][]{{1, 2}, {2, 3}}));
        /*
          示例 5：
          输入：n = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
          输出：3
         */
        System.out.println(findTownJudge.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));
    }
}
