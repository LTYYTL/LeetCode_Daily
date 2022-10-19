package com.leetcode.L801_900.L0886;

import java.util.ArrayList;
import java.util.List;


/**
 * 886. 可能的二分法
 * 给定一组 n 人（编号为 1, 2, ..., n）， 我们想把每个人分进任意大小的两组。每个人都可能不喜欢其他人，那么他们不应该属于同一组。
 * 给定整数 n 和数组 dislikes ，其中 dislikes[i] = [ai, bi] ，表示不允许将编号为 ai 和  bi的人归入同一组。
 * 当可以用这种方法将所有人分进两组时，返回 true；否则返回 false。
 * <p>
 * 示例 1：
 * 输入：n = 4, dislikes = [[1,2],[1,3],[2,4]]
 * 输出：true
 * 解释：group1 [1,4], group2 [2,3]
 * <p>
 * 示例 2：
 * 输入：n = 3, dislikes = [[1,2],[1,3],[2,3]]
 * 输出：false
 * <p>
 * 示例 3：
 * 输入：n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
 * 输出：false
 * <p>
 * 提示：
 * 1 <= n <= 2000
 * 0 <= dislikes.length <= 104
 * dislikes[i].length == 2
 * 1 <= dislikes[i][j] <= n
 * ai < bi
 * dislikes 中每一组都 不同
 */
public class PossibleBipartition {
    // 记录节点是否访问
    boolean[] visited;
    // 记录颜色
    boolean[] color;
    // 记录结果
    boolean ok;

    /**
     * 方法：图
     */
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // 记录节点是否访问
        visited = new boolean[n + 1];
        // 记录颜色
        color = new boolean[n + 1];
        // 记录结果
        ok = true;

        // 构建图
        List<Integer>[] greps = bulidGreps(n, dislikes);

        // 遍历每一个节点防止有遗漏
        for (int i = 1; i <= n; i++) {
            // 是否被访问
            if (!visited[i]) {
                // 深度优先搜索
                dfs(greps, i);
            }
        }

        return ok;
    }

    /**
     * 深度优先搜索
     */
    private void dfs(List<Integer>[] greps, int node) {
        // 已经确定不是二分图，不用再进行下面的判断
        if (!ok) {
            return;
        }
        // 记录已访问
        visited[node] = true;

        // 遍历相邻节点
        for (int next : greps[node]) {
            // 节点没有被访问
            if (!visited[next]) {
                // 相邻涂不同的颜色
                color[next] = !color[node];
                // 进行深度优先搜索
                dfs(greps, next);
            } else {
                // 相邻节点颜色是否不同
                if (color[next] == color[node]) {
                    ok = false;
                    return;
                }
            }
        }
    }

    /**
     * 构建图
     */
    private List<Integer>[] bulidGreps(int n, int[][] dislikes) {
        // 图
        List<Integer>[] greps = new List[n + 1];
        // 初始化
        for (int i = 0; i < greps.length; i++) {
            greps[i] = new ArrayList<>();
        }

        // 遍历
        for (int[] dislike : dislikes) {
            int u = dislike[0];
            int v = dislike[1];
            greps[u].add(v);
            greps[v].add(u);
        }
        return greps;
    }
}
