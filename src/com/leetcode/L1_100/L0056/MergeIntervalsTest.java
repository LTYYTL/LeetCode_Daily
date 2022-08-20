package com.leetcode.L1_100.L0056;

import java.util.Arrays;

public class MergeIntervalsTest {
    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        /* * 示例 1：
          输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
          输出：[[1,6],[8,10],[15,18]]
          解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
         */
        for (int[] ints : mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})) {
            System.out.println(Arrays.toString(ints));
        }
        /*
          示例 2：
          输入：intervals = [[1,4],[4,5]]
          输出：[[1,5]]
          解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
         */
        for (int[] ints : mergeIntervals.merge(new int[][]{{1, 4}, {4, 5}})) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
