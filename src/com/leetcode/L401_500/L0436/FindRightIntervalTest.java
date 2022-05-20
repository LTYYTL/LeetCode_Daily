package com.leetcode.L401_500.L0436;

import java.util.Arrays;

public class FindRightIntervalTest {
    public static void main(String[] args) {
        FindRightInterval findRightInterval = new FindRightInterval();
        /**
         * 示例 1：
         * 输入：intervals = [[1,2]]
         * 输出：[-1]
         * 解释：集合中只有一个区间，所以输出-1。
         */
        System.out.println(Arrays.toString(findRightInterval.findRightInterval(new int[][]{{1, 2}})));
        /**
         * 示例 2：
         * 输入：intervals = [[3,4],[2,3],[1,2]]
         * 输出：[-1,0,1]
         * 解释：对于 [3,4] ，没有满足条件的“右侧”区间。
         * 对于 [2,3] ，区间[3,4]具有最小的“右”起点;
         * 对于 [1,2] ，区间[2,3]具有最小的“右”起点。
         */
        System.out.println(Arrays.toString(findRightInterval.findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}})));
        /**
         * 示例 3：
         * 输入：intervals = [[1,4],[2,3],[3,4]]
         * 输出：[-1,2,-1]
         * 解释：对于区间 [1,4] 和 [3,4] ，没有满足条件的“右侧”区间。
         * 对于 [2,3] ，区间 [3,4] 有最小的“右”起点。
         */
        System.out.println(Arrays.toString(findRightInterval.findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}})));
    }
}
