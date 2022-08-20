package com.leetcode.L1_100.L0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 * 示例 1：
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 示例 2：
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 * 提示：
 *
 * 1 <= intervals.length <= 104
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 104
 */
public class MergeIntervals {
    /**
     * 方法：排序
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        //特殊情况
        if (intervals.length == 0)
            return new int[0][2];
        //按照左边界从小到大排列
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        //结果集
        List<int[]> res = new ArrayList<>();
        //遍历
        for (int[] interval : intervals) {
            //左边界
            int L = interval[0];
            //右边界
            int R = interval[1];
            //结果集为空或者没有覆盖情况
            if (res.size() == 0 || res.get(res.size() - 1)[1] < L)
                res.add(new int[]{L, R});
            else
                //改变右边界
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], R);
        }
        return res.toArray(new int[res.size()][]);
    }
}
