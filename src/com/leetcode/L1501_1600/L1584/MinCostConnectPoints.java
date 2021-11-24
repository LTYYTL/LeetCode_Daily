package com.leetcode.L1501_1600.L1584;

import com.util.UF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1584. 连接所有点的最小费用
 * 给你一个points 数组，表示 2D 平面上的一些点，其中 points[i] = [xi, yi] 。
 * 连接点 [xi, yi] 和点 [xj, yj] 的费用为它们之间的 曼哈顿距离 ：|xi - xj| + |yi - yj| ，其中 |val| 表示 val 的绝对值。
 * 请你返回将所有点连接的最小总费用。只有任意两点之间 有且仅有 一条简单路径时，才认为所有点都已连接。
 *
 * 示例 1：
 * 输入：points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
 * 输出：20
 * 解释：
 * 我们可以按照上图所示连接所有点得到最小总费用，总费用为 20 。
 * 注意到任意两个点之间只有唯一一条路径互相到达。
 *
 * 示例 2：
 * 输入：points = [[3,12],[-2,5],[-4,1]]
 * 输出：18
 *
 * 示例 3：
 * 输入：points = [[0,0],[1,1],[1,0],[-1,1]]
 * 输出：4
 *
 * 示例 4：
 * 输入：points = [[-1000000,-1000000],[1000000,1000000]]
 * 输出：4000000
 *
 * 示例 5：
 * 输入：points = [[0,0]]
 * 输出：0
 *
 * 提示：
 * 1 <= points.length <= 1000
 * -106 <= xi, yi <= 106
 * 所有点 (xi, yi) 两两不同。
 */
public class MinCostConnectPoints {
    /**
     * 方法：Kruskal算法
     * @param points
     * @return
     */
    public int minCostConnectPoints(int[][] points) {
        //点数
        int n = points.length;
        //存储点之间关系和权值
        List<int[]> edges = new ArrayList<>();
        //遍历，计算每两个点之间的权值
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int xi = points[i][0], yi = points[i][1];
                int xj = points[j][0], yj = points[j][1];
                edges.add(new int[]{i,j,Math.abs(xi-xj) + Math.abs(yi-yj)});
            }
        }
        //并查集
        UF uf = new UF(n);
        //按权值从小到大
        Collections.sort(edges,(a,b) ->(a[2] - b[2]));
        //最小值
        int mst = 0;
        //遍历边
        for (int[] edge : edges) {
            //两个点
            int u = edge[0];
            int v = edge[1];
            //权值及距离
            int weight = edge[2];
            //判断是否连通
            if (uf.connected(u,v))
                continue;
            //增加权值
            mst += weight;
            //连通
            uf.union(u,v);
        }

        return mst;

    }
}
