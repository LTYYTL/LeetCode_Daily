package com.leetcode.L1101_1200.L1135;

import com.util.Prim;
import com.util.UF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
