package com.leetcode.L401_500.L0436;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 436. 寻找右区间
 * 给你一个区间数组 intervals ，其中 intervals[i] = [starti, endi] ，且每个 starti 都 不同 。
 * 区间 i 的 右侧区间 可以记作区间 j ，并满足 startj >= endi ，且 startj 最小化 。
 * 返回一个由每个区间 i 的 右侧区间 的最小起始位置组成的数组。如果某个区间 i 不存在对应的 右侧区间 ，则下标 i 处的值设为 -1 。
 * <p>
 * 示例 1：
 * 输入：intervals = [[1,2]]
 * 输出：[-1]
 * 解释：集合中只有一个区间，所以输出-1。
 * <p>
 * 示例 2：
 * 输入：intervals = [[3,4],[2,3],[1,2]]
 * 输出：[-1,0,1]
 * 解释：对于 [3,4] ，没有满足条件的“右侧”区间。
 * 对于 [2,3] ，区间[3,4]具有最小的“右”起点;
 * 对于 [1,2] ，区间[2,3]具有最小的“右”起点。
 * <p>
 * 示例 3：
 * 输入：intervals = [[1,4],[2,3],[3,4]]
 * 输出：[-1,2,-1]
 * 解释：对于区间 [1,4] 和 [3,4] ，没有满足条件的“右侧”区间。
 * 对于 [2,3] ，区间 [3,4] 有最小的“右”起点。
 * <p>
 * 提示：
 * 1 <= intervals.length <= 2 * 104
 * intervals[i].length == 2
 * -106 <= starti <= endi <= 106
 * 每个间隔的起点都 不相同
 */
public class FindRightInterval {
    /**
     * 方法：二分查找
     *
     * @param intervals
     * @return
     */
    public int[] findRightInterval(int[][] intervals) {
        //长度
        int n = intervals.length;
        //记录每个值的左边界和索引
        int[][] start = new int[n][2];

        //遍历
        for (int i = 0; i < n; i++) {
            start[i][0] = intervals[i][0];
            start[i][1] = i;
        }

        //排序
        Arrays.sort(start, Comparator.comparingInt(o -> o[0]));

        //结果
        int[] ans = new int[n];

        //遍历
        for (int i = 0; i < n; i++) {
            //左指针
            int left = 0;
            //右指针
            int right = n - 1;
            //索引
            int target = -1;
            //二分查找
            while (left <= right) {
                //中间值
                int mid = (right - left) / 2 + left;
                if (start[mid][0] >= intervals[i][1]) {
                    target = start[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans[i] = target;
        }
        return ans;
    }
}
