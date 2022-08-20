package com.leetcode.L901_1000.L0913;

import java.util.Arrays;

/**
 * 913. 猫和老鼠
 * 两位玩家分别扮演猫和老鼠，在一张 无向 图上进行游戏，两人轮流行动。
 * 图的形式是：graph[a] 是一个列表，由满足 ab 是图中的一条边的所有节点 b 组成。
 * 老鼠从节点 1 开始，第一个出发；猫从节点 2 开始，第二个出发。在节点 0 处有一个洞。
 * 在每个玩家的行动中，他们 必须 沿着图中与所在当前位置连通的一条边移动。例如，如果老鼠在节点 1 ，那么它必须移动到 graph[1] 中的任一节点。
 * 此外，猫无法移动到洞中（节点 0）。
 *
 * 然后，游戏在出现以下三种情形之一时结束：
 * (1)如果猫和老鼠出现在同一个节点，猫获胜。
 * (2)如果老鼠到达洞中，老鼠获胜。
 * (3)如果某一位置重复出现（即，玩家的位置和移动顺序都与上一次行动相同），游戏平局。
 *
 * 给你一张图 graph ，并假设两位玩家都都以最佳状态参与游戏：
 * (1)如果老鼠获胜，则返回 1；
 * (2)如果猫获胜，则返回 2；
 * (3)如果平局，则返回 0 。
 *
 * 示例 1：
 * 输入：graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
 * 输出：0
 *
 * 示例 2：
 * 输入：graph = [[1,3],[0],[3],[0,2]]
 * 输出：1
 *
 * 提示：
 * 3 <= graph.length <= 50
 * 1 <= graph[i].length < graph.length
 * 0 <= graph[i][j] < graph.length
 * graph[i][j] != i
 * graph[i] 互不相同
 * 猫和老鼠在游戏中总是移动
 */
public class CatAndMouse {
    //平局
    private static final int DRAW = 0;
    //老鼠赢
    private static final int MOUSE_WIN = 1;
    //猫赢
    private static final int CAT_WIN = 2;

    /**
     * 方法：深度优先搜索
     *
     * @param graph
     * @return
     */
    public int catMouseGame(int[][] graph) {
        //长度
        int n = graph.length;
        //记录每种状态
        int[][][] dp = new int[n][n][2 * n];
        //初始化
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        //深度优先搜索
        return dfs(graph, n, dp, 2, 1, 0);
    }

    private int dfs(int[][] graph, int n, int[][][] dp, int cat, int mouse, int turns) {
        //超过节点数2倍，可以确定为平局
        if (turns >= 2 * n * (n - 1))
            return 0;
        //已经存在直接返回
        if (dp[cat][mouse][turns] != -1)
            return dp[cat][mouse][turns];

        //老鼠赢
        if (mouse == 0)
            return dp[cat][mouse][turns] = MOUSE_WIN;

        //猫咪赢
        if (cat == mouse)
            return dp[cat][mouse][turns] = CAT_WIN;

        // turns 为偶数是轮到老鼠走，为奇数是轮到猫走
        int ans;
        if (turns % 2 == 0) {
            //老鼠最坏情况是猫赢
            ans = CAT_WIN;
            //尝试走到下一个节点
            for (int next : graph[mouse]) {
                int nextAns = dfs(graph, n, dp, cat, next, turns + 1);
                // 如果老鼠可以赢，直接返回
                if (nextAns == MOUSE_WIN)
                    return dp[cat][mouse][turns] = MOUSE_WIN;
                // 有平局，先记录为平局，后面如果有老鼠可以赢的场景，通过上述语句可以返回
                if (nextAns == DRAW)
                    ans = DRAW;
            }
            // 返回老鼠走的结果
        } else {
            // 猫最坏情况是老鼠赢
            ans = MOUSE_WIN;
            for (int next : graph[cat]) {
                // 注意猫不能走到0号节点
                if (next != 0) {
                    // 尝试进入下一个节点
                    int nextAns = dfs(graph, n, dp, next, mouse, turns + 1);
                    // 如果猫可以赢，直接返回
                    if (nextAns == CAT_WIN)
                        return dp[next][mouse][turns] = CAT_WIN;
                    // 有平局，先记录为平局，后面如果有猫可以赢的场景，通过上述语句可以返回
                    if (nextAns == DRAW)
                        ans = DRAW;
                }
            }
            // 返回猫走的结果
        }
        return dp[cat][mouse][turns] = ans;
    }
}
