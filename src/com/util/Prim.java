package com.util;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Prim算法
 */
public class Prim {
    //存放边
    private final PriorityQueue<int[]> queue;
    //记录某个点是否已经是最小生成树的一部分
    private final boolean[] isMST;
    //最小生成树的权值和
    private int weightSum = 0;
    //图
    private final List<int[]>[] grep;

    public Prim(List<int[]>[] grep) {
        //初始化
        this.grep = grep;
        this.queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        this.isMST = new boolean[grep.length];
        //随机从一个点开始，从0开始
        isMST[0] = true;
        //切分
        cut(0);
        //遍历
        while (!queue.isEmpty()){
            //获取最小的边
            int[] edge = queue.poll();
            //边的点
            int to = edge[1];
            //边的权重
            int weight = edge[2];
            //判断是否是最小生成树的一部分
            if (isMST[to])
                continue;
            //计算权重
            weightSum += weight;
            isMST[to] = true;
            //节点加入后进行新一轮切分
            cut(to);
        }
    }
    //切分
    private void cut(int i) {
        //当前点涉及的边
        for (int[] g : grep[i]) {
            //连接的点
            int to = g[1];
            //判断是否是最小生成树的一部分
            if (isMST[to])
                continue;
            //加入队列
            queue.add(g);
        }
    }
    //最小生成树的权值和
    public int getWeightSum() {
        return weightSum;
    }

    //判断最小生成树是否包含图的所有点
    public boolean allConnected() {
        for (boolean b : isMST) {
            if (!b)
                return false;
        }
        return true;
    }
}
