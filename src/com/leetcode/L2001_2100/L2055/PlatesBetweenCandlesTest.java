package com.leetcode.L2001_2100.L2055;

import java.util.Arrays;

public class PlatesBetweenCandlesTest {
    public static void main(String[] args) {
        PlatesBetweenCandles platesBetweenCandles = new PlatesBetweenCandles();
        /*
          示例 1:
          输入：s = "**|**|***|", queries = [[2,5],[5,9]]
          输出：[2,3]
          解释：
          - queries[0] 有两个盘子在蜡烛之间。
          - queries[1] 有三个盘子在蜡烛之间。
         */
        System.out.println(Arrays.toString(platesBetweenCandles.platesBetweenCandles("**|**|***|", new int[][]{{2, 5}, {5, 9}})));
        /*
          示例 2:
          输入：s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16]]
          输出：[9,0,0,0,0]
          解释：
          - queries[0] 有 9 个盘子在蜡烛之间。
          - 另一个查询没有盘子在蜡烛之间。
         */
        System.out.println(Arrays.toString(platesBetweenCandles.platesBetweenCandles("***|**|*****|**||**|*", new int[][]{{1, 17}, {4, 5}, {14, 17}, {5, 11}, {15, 16}})));
    }
}
