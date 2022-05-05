package com.leetcode.L1101_1200.L1135;

import com.util.Prim;
import com.util.UF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1135. 最低成本联通所有城市
 * 想象一下你是个城市基建规划者，地图上有 n 座城市，它们按以 1 到 n 的次序编号。
 * 给你整数 n 和一个数组 conections，其中 connections[i] = [xi, yi, costi] 表示将城市 xi 和城市 yi 连接所要的costi（连接是双向的）。
 * 返回连接所有城市的最低成本，每对城市之间至少有一条路径。如果无法连接所有 n 个城市，返回 -1
 * 该 最小成本 应该是所用全部连接成本的总和。
 * <p>
 * 示例 1：
 * 输入：n = 3, conections = [[1,2,5],[1,3,6],[2,3,1]]
 * 输出：6
 * 解释：选出任意 2 条边都可以连接所有城市，我们从中选取成本最小的 2 条。
 * <p>
 * 示例 2：
 * 输入：n = 4, conections = [[1,2,3],[3,4,4]]
 * 输出：-1
 * 解释：即使连通所有的边，也无法连接所有城市。
 * <p>
 * 提示：
 * 1 <= n <= 104
 * 1 <= connections.length <= 104
 * connections[i].length == 3
 * 1 <= xi, yi <= n
 * xi != yi
 * 0 <= costi <= 105
 */
public class ConnectCitiesLowestCost {
    /**
     * 方法：Kruskal算法
     * @param n
     * @param connections
     * @return
     */
    public int minimumCost(int n, int[][] connections){
        //创建并查集
        UF uf = new UF(n+1);
        //按照权值从小到大排列
        Arrays.sort(connections,(a,b)->(a[2] - b[2]));
        //最小权值
        int mst = 0;
        //遍历边
        for (int[] edge : connections) {
            //两个点
            int u = edge[0];
            int v = edge[1];
            //权值
            int weight = edge[2];
            //判断是否连通，连通的点不能选，会出现环
            if (uf.connected(u,v))
                continue;
            //增加权值
            mst += weight;
            //连通
            uf.union(u,v);
        }
        //因为没有0这个点所以连通分量是2，表示都连通了
        return uf.getCount() == 2 ? mst :-1;
    }

    /**
     * 方法：Prim算法
     * @param n
     * @param connections
     * @return
     */
    public int minimumCost_prim(int n, int[][] connections){
        //转换成无向邻接表
        List<int[]>[] grep = createGrep(n,connections);
        //执行prim算法
        Prim prim = new Prim(grep);
        //判断是否所有点都覆盖
        if (!prim.allConnected())
            return -1;
        return prim.getWeightSum();
    }

    /**
     * 构建无向邻接表
     * @param n
     * @param connections
     * @return
     */
    private List<int[]>[] createGrep(int n, int[][] connections) {
        List<int[]>[] grep = new List[n];
        for (int i = 0; i < n; i++) {
            grep[i] = new ArrayList<>();
        }

        for (int[] connection : connections) {
            int from = connection[0] - 1;
            int to = connection[1] - 1;
            int weight = connection[2];

            grep[from].add(new int[]{from,to,weight});
            grep[to].add(new int[]{to,from,weight});
        }
        return grep;
    }
}
