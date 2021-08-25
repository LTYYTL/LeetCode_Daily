package com.leetcode.L0797;

import java.util.*;

/**
 * 797. 所有可能的路径
 * 给你一个有 n 个节点的 有向无环图（DAG），请你找出所有从节点 0 到节点 n-1 的路径并输出（不要求按特定顺序）
 * 二维数组的第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些节点，空就是没有下一个结点了。
 * 译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a 。
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
 * graph[i][j] != i（即，不存在自环）
 * graph[i] 中的所有元素 互不相同
 * 保证输入为 有向无环图（DAG）
 */
public class AllPathsFromSourceTarget {
    //结果集
    List<List<Integer>> res;

    /**
     * 方法一：深度优先搜索
     * @param graph
     * @return
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
     * @param graph
     * @return
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
