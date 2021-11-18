package com.interview.L0401;

import java.util.*;

/**
 * 面试题 04.01. 节点间通路
 * 节点间通路。给定有向图，设计一个算法，找出两个节点之间是否存在一条路径。
 *
 * 示例1:
 *  输入：n = 3, graph = [[0, 1], [0, 2], [1, 2], [1, 2]], start = 0, target = 2
 *  输出：true
 *
 * 示例2:
 *  输入：n = 5, graph = [[0, 1], [0, 2], [0, 4], [0, 4], [0, 1], [1, 3], [1, 4], [1, 3], [2, 3], [3, 4]], start = 0, target = 4
 *  输出 true
 *
 * 提示：
 * 节点数量n在[0, 1e5]范围内。
 * 节点编号大于等于 0 小于 n。
 * 图中可能存在自环和平行边。
 */
public class RouteBetweenNodes {
    /**
     * 方法：广度优先搜索
     * @param n
     * @param graph
     * @param start
     * @param target
     * @return
     */
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        //构建图
        Map<Integer, Set<Integer>> grap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            grap.put(i,new HashSet<>());
        }

        for (int[] g : graph) {
            Set<Integer> set = grap.get(g[0]);
            set.add(g[1]);
        }
        //访问标志位
        boolean[] vis = new boolean[n];
        //队列
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        //遍历
        while (!queue.isEmpty()){
            //队首元素
            int cur = queue.poll();
            //等于目标值
            if (cur == target)
                return true;
            for (int i : grap.get(cur)) {
                //未访问
                if (!vis[i]){
                    //加入队列
                    queue.add(i);
                    //变成已访问
                    vis[i] = true;
                }
            }
        }

        return false;
    }
}
