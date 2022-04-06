package com.leetcode.L301_400.L0310;

import java.util.*;

/**
 * 310. 最小高度树
 * 树是一个无向图，其中任何两个顶点只通过一条路径连接。 换句话说，一个任何没有简单环路的连通图都是一棵树。
 * 给你一棵包含 n 个节点的树，标记为 0 到 n - 1 。给定数字 n 和一个有 n - 1 条无向边的 edges 列表（每一个边都是一对标签），
 * 其中 edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间存在一条无向边。
 * 可选择树中任何一个节点作为根。当选择节点 x 作为根节点时，设结果树的高度为 h 。在所有可能的树中，具有最小高度的树（即，min(h)）被称为 最小高度树 。
 * 请你找到所有的 最小高度树 并按 任意顺序 返回它们的根节点标签列表。
 * 树的 高度 是指根节点和叶子节点之间最长向下路径上边的数量。
 *
 * 示例 1：
 * 输入：n = 4, edges = [[1,0],[1,2],[1,3]]
 * 输出：[1]
 * 解释：如图所示，当根是标签为 1 的节点时，树的高度是 1 ，这是唯一的最小高度树。
 *
 * 示例 2：
 * 输入：n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
 * 输出：[3,4]
 *
 * 提示：
 * 1 <= n <= 2 * 104
 * edges.length == n - 1
 * 0 <= ai, bi < n
 * ai != bi
 * 所有 (ai, bi) 互不相同
 * 给定的输入 保证 是一棵树，并且 不会有重复的边
 */
public class MinHeightTrees {
    /**
     * 方法：拓扑排序
     * @param n
     * @param edges
     * @return
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        //只有一个点
        if (n == 1)
            return new ArrayList<>(){{add(0);}};
        //构建无向图
        List<Integer>[] greps = createGrep(n,edges);

        //队列
        Queue<Integer> queue = new LinkedList<>();

        //入度
        int[] disTo = new int[n];
        //遍历
        for (int i = 0; i < n; i++) {
            //记录出度
            disTo[i] = greps[i].size();
            //将出度为1的加入
            if (disTo[i] == 1)
                queue.add(i);
        }

        //结果集
        List<Integer> res = new ArrayList<>();

        //遍历
        while (!queue.isEmpty()){
            //清空
            res.clear();
            //当前层节点
            int size = queue.size();
            //遍历当前层
            for (int i = 0; i < size; i++) {
                //当前节点
                int cur = queue.poll();
                //加入结果集
                res.add(cur);
                //遍历相邻节点
                for (int next : greps[cur]) {
                    //减少出度
                    disTo[next]--;
                    //出度变为1加入队列
                    if (disTo[next] == 1)
                        queue.add(next);
                }
            }
        }
        return res;
    }

    /**
     * 构建无向图
     * @param n
     * @param edges
     * @return
     */
    private List<Integer>[] createGrep(int n, int[][] edges) {
        //图
        List<Integer>[] greps = new List[n];
        //初始化
        for (int i = 0; i < greps.length; i++) {
            greps[i] = new ArrayList<Integer>();
        }

        //遍历
        for (int[] edge : edges) {
            //两个点
            int from = edge[0];
            int to = edge[1];
            //加入边
            greps[from].add(to);
            greps[to].add(from);
        }
        return greps;
    }

}
