package com.meituan.L005;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * meituan-005. 小美的区域会议
 * 小美是美团总部的高管，她想要召集一些美团的区域负责人来开会，已知美团的业务区域划分可以用一棵树来表示，
 * 树上有 n 个节点，每个节点分别代表美团的一个业务区域，每一个区域有一个负责人，这个负责人的级别为 A[i]
 * 已知小美召集人员开会必须满足以下几个条件：
 * 1.小美召集的负责人所在的区域必须构成一个非空的连通的图，即选取树上的一个连通子图。
 * 2.这些负责人中，级别最高的和级别最低的相差不超过 k 。
 * 请问小美有多少种召集负责人的方式，当且仅当选取的集合不同时我们就认为两种方式不同。由于方案数可能非常大，所以请对 10^9+7 取模。
 *
 * 格式：
 * 输入：
 * - 输入第一行包含两个整数 n 和 k ，表示区域的数量，和不能超过的级别。
 * - 接下来有 n-1 行，每行有两个正整数 a 和 b ，表示 a 号区域和 b 号区域有一条边。
 * - 最后一行有 n 个整数，第 i 个整数表示 i 号区域负责人的级别。
 * 输出：
 * - 输出仅包含一个整数，表示可以选择的方案数对 10^9+7 取模之后的结果。
 *
 * 示例：
 * 输入：
 *      5 1
 *      1 2
 *      2 3
 *      3 4
 *      4 5
 *      2 2 2 2 2
 * 输出：15
 * 解释：显然一个区域的方案有 {1}，{2}，{3}，{4}，{5}，两个区域的方案有 4 个，三个区域的方案有 3 个，四个区域的方案有 2 个，五个区域的方案有 1 个，共 15 个。
 *
 * 提示：
 * 1 <= n, k <= 2000
 * 1 <= a, b <= n
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaomeiRegionalConference {
    public static int n;
    public static int k;
    public static  List<List<Integer>> e;
    public static final int MOD = 1000000007;
    public static boolean[] vis;
    public static int[] level;
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        //输入n和k
        String[] split = reader.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        k = Integer.parseInt(split[1]);

        e = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            e.add(new ArrayList<>());
        }

        //存储关系
        for (int i = 1; i < n; i++) {
            String[] data = reader.readLine().split(" ");
            int id = Integer.parseInt(data[0]);
            int next = Integer.parseInt(data[1]);
            e.get(id).add(next);
            e.get(next).add(id);
        }

        //存储级别
        level = new int[n+1];
        String[] levels = reader.readLine().split(" ");
        for (int i = 1; i <= n ; i++) {
            level[i] = Integer.parseInt(levels[i-1]);
        }

        //记录是否访问过
        vis = new boolean[n+1];
        //记录数量
        long ans = 0;
        //从1出发
        for (int i = 1; i <= n; i++){
            Arrays.fill(vis,false);
            ans = (ans + dfs(i,i))%MOD;
        }

        writer.write("" + ans);

        reader.close();
        writer.close();
    }

    /**
     * 深度优先搜索
     * @param i
     * @param j 当前点首点
     * @return
     */
    private static long dfs(int i, int j) {
        //记录当前点已经访问过
        vis[i] = true;
        long ans = 1;
        //遍历与之相连的点
        for (Integer v : e.get(i)) {
            //访问过直接跳出
            if (vis[v])
                continue;
            //与初点比较级别
            if (level[v] > level[j] && level[v] - level[j] <= k || level[v] == level[j])
                ans = ans *(1 + dfs(v,j))%MOD;
        }
        return ans;
    }
}
