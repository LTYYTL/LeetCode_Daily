package com.leetcode.L501_600.L0587;

import java.util.Arrays;

public class ErectFenceTest {
    public static void main(String[] args) {
        ErectFence erectFence = new ErectFence();
        /* * 示例 1:
          输入: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
          输出: [[1,1],[2,0],[4,2],[3,3],[2,4]]
         */
        System.out.println(Arrays.deepToString(erectFence.outerTrees(new int[][]{{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}})));
        /*
          示例 2:
          输入: [[1,2],[2,2],[4,2]]
          输出: [[1,2],[2,2],[4,2]]
          即使树都在一条直线上，你也需要先用绳子包围它们。
         */
        System.out.println(Arrays.deepToString(erectFence.outerTrees(new int[][]{{1, 2}, {2, 2}, {4, 2}})));
    }
}
