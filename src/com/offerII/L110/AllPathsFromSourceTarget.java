package com.offerII.L110;

import java.util.*;

/**
 * 剑指 Offer II 110. 所有路径
 * 给定一个有 n 个节点的有向无环图，用二维数组 graph 表示，请找到所有从 0 到 n-1 的路径并输出（不要求按顺序）。
 * graph 的第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些结点（译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a ），若为空，就是没有下一个节点了。
 *
 * 示例 1：
 * 输入：graph = [[1,2],[3],[3],[]]
 * 输出：[[0,1,3],[0,2,3]]
 * 解释：有两条路径 0 -> 1 -> 3 和 0 -> 2 -> 3
 *
 * 示例 2：
 * 输入：graph = [[4,3,1],[3,2,4],[3],[4],[]]
 * 输出：[[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 *
 * 示例 3：
 * 输入：graph = [[1],[]]
 * 输出：[[0,1]]
 *
 * 示例 4：
 * 输入：graph = [[1,2,3],[2],[3],[]]
 * 输出：[[0,1,2,3],[0,2,3],[0,3]]
 *
 * 示例 5：
 * 输入：graph = [[1,3],[2],[3],[]]
 * 输出：[[0,1,2,3],[0,3]]
 *
 * 提示：
 * n == graph.length
 * 2 <= n <= 15
 * 0 <= graph[i][j] < n
 * graph[i][j] != i
 * 保证输入为有向无环图 (GAD)
 *
 * 注意：本题与主站 797 题相同：<a href="https://leetcode-cn.com/problems/all-paths-from-source-to-target/">https://leetcode-cn.com/problems/all-paths-from-source-to-target/</a>
 */
public class AllPathsFromSourceTarget {
    //结果集
    List<List<Integer>> res;

    /**
     * 方法一：深度优先搜索
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();
        //长度
        int n = graph.length;
        //记录路径
        Stack<Integer> path = new Stack<>();
        //从0开始
        path.add(0);
        dfs(graph,0,path,n-1);

        return res;
    }

    /**
     * 深度优先搜索
     * @param graph    点间关系
     * @param begin    起点
     * @param path     已访问的路径
     * @param end      结束点
     */
    private void dfs(int[][] graph, int begin, Stack<Integer> path, int end) {
        //结束条件
        if (begin == end){
            //存入已访问路径
            res.add(new ArrayList<>(path));
            return;
        }

        //遍历相邻点
        for (int next : graph[begin]) {
            //添加到路径中
            path.add(next);
            //深度优先搜索
            dfs(graph, next, path, end);
            //移除路径
            path.pop();
        }
    }

    /**
     * 方法二：广度优先搜索
     */
    public List<List<Integer>> allPathsSourceTarget_bfs(int[][] graph) {
        //长度
        int n = graph.length;
        //结果集
        List<List<Integer>> res = new ArrayList<>();
        //存入路径
        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        queue.offer(list);
        //队列不为空
        while (!queue.isEmpty()){
            //获取队首元素（路径）
            List<Integer> cur = queue.poll();
            //获取元素最后一个元素（上一个访问的点）
            int val = cur.get(cur.size()-1);
            //符合条件
            if (val == n-1)
                res.add(cur);
            //遍历相邻点
            for (int next : graph[val]) {
                //构建新的路径
                ArrayList<Integer> nexList = new ArrayList<>(cur);
                nexList.add(next);
                //将新队列加入队列
                queue.offer(nexList);
            }
        }
        return res;
    }
}
