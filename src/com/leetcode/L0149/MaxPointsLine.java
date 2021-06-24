package com.leetcode.L0149;

/**
 * 149. 直线上最多的点数
 * 给你一个数组 points ，其中 points[i] = [xi, yi] 表示 X-Y 平面上的一个点。求最多有多少个点在同一条直线上。
 *
 * 示例 1：
 * 输入：points = [[1,1],[2,2],[3,3]]
 * 输出：3
 *
 * 示例 2：
 * 输入：points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * 输出：4
 *
 * 提示：
 * 1 <= points.length <= 300
 * points[i].length == 2
 * -104 <= xi, yi <= 104
 * points 中的所有点 互不相同
 */
public class MaxPointsLine {
    public int maxPoints(int[][] points) {
        int res = 1;
        for (int i = 0; i < points.length; ++i) {
            int[] m = points[i];
            for (int j = i + 1; j < points.length; ++j) {
                int dx = points[j][0] - m[0];
                int dy = points[j][1] - m[1];
                int count = 0;
                int d = dx * m[1] - dy * m[0];
                for (int[] p : points) {
//                  化简得来
                    if (dx * p[1] == dy * p[0] + d)
                        ++count;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
