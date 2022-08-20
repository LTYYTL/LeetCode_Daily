package com.leetcode.L901_1000.L0973;

import java.util.Arrays;

public class KClosestPointsOriginTest {
    public static void main(String[] args) {
        KClosestPointsOrigin kClosestPointsOrigin = new KClosestPointsOrigin();
        /* * 示例 1：
          输入：points = [[1,3],[-2,2]], K = 1
          输出：[[-2,2]]
          解释：
          (1, 3) 和原点之间的距离为 sqrt(10)，
          (-2, 2) 和原点之间的距离为 sqrt(8)，
          由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
          我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
         */
        int[][] poinits = {
                {1, 3},
                {-2, 2}
        };
        int[][] res = kClosestPointsOrigin.kClosest(poinits, 1);
        for (int[] i : res) {
            System.out.println(Arrays.toString(i));
        }
        /*
          示例 2：
          输入：points = [[3,3],[5,-1],[-2,4]], K = 2
          输出：[[3,3],[-2,4]]
          （答案 [[-2,4],[3,3]] 也会被接受。）
         */
        int[][] poinits1 = {
                {3, 3},
                {5, -1},
                {-2, 4}
        };
        int[][] res1 = kClosestPointsOrigin.kClosest(poinits1, 2);
        for (int[] i : res1) {
            System.out.println(Arrays.toString(i));
        }
    }
}
