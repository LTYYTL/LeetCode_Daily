package com.leetcode.L501_600.L0593;

import java.util.Arrays;

/**
 * 593. 有效的正方形
 * 给定2D空间中四个点的坐标 p1, p2, p3 和 p4，如果这四个点构成一个正方形，则返回 true 。
 * 点的坐标 pi 表示为 [xi, yi] 。输入 不是 按任何顺序给出的。
 * 一个 有效的正方形 有四条等边和四个等角(90度角)。
 * <p>
 * 示例 1:
 * 输入: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
 * 输出: True
 * <p>
 * 示例 2:
 * 输入：p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,12]
 * 输出：false
 * <p>
 * 示例 3:
 * 输入：p1 = [1,0], p2 = [-1,0], p3 = [0,1], p4 = [0,-1]
 * 输出：true
 * <p>
 * 提示:
 * p1.length == p2.length == p3.length == p4.length == 2
 * -104 <= xi, yi <= 104
 */
public class ValidSquare {
    /**
     * 方法：数学
     *
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     * @return
     */
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        // 重合点
        if (p1[0] == p2[0] && p1[1] == p2[1])
            return false;
        //记录边
        long[] l = new long[6];
        //计算四个边和两条对角线
        l[0] = len(p1, p2);
        l[1] = len(p1, p3);
        l[2] = len(p1, p4);
        l[3] = len(p2, p3);
        l[4] = len(p2, p4);
        l[5] = len(p3, p4);
        //排序，边<对角线
        Arrays.sort(l);
        //四边相等，对角线相等证明是正方形
        return l[0] == l[1] && l[0] == l[2] && l[0] == l[3] && l[4] == l[5];
    }

    /**
     * 计算两点的距离
     *
     * @param x
     * @param y
     * @return
     */
    public long len(int[] x, int[] y) {
        return (long) (x[0] - y[0]) * (x[0] - y[0]) + (long) (x[1] - y[1]) * (x[1] - y[1]);
    }
}
