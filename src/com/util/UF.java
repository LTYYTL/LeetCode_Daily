package com.util;

public class UF {
    //连通性
    private int count;
    //记录每个节点的根节点
    private int[] parent;
    //每个节点的重量（包含节点的数）
    private int[] size;

    public UF(int n){
        this.count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            size[i] = i;
        }
    }

    /**
     * 合并p和q
     * @param p
     * @param q
     */
    public void union(int p, int q){
        //寻找p的根节点
        int rootP = find(p);
        //寻找q的根节点
        int rootQ = find(q);
        //连通
        if (rootP == rootQ)
            return;

        //将小树接到大树上
        if (size[rootP] > size[rootQ]){
            parent[rootQ] = rootP;
            //将小树的重量接到大树的重量
            size[rootP] += parent[rootQ];
        }else {
            parent[rootP] = rootQ;
            size[rootQ] += parent[rootP];
        }
        //连通性减少
        count--;
    }

    /**
     * 节点x的根节点
     * @param x
     * @return
     */
    private int find(int x) {
        while (parent[x] != x){
            //路径压缩
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    /**
     * 判断p和q是否连通
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q){
        //寻找p的根节点
        int rootP = find(p);
        //寻找q的根节点
        int rootQ = find(q);
        //处于同一棵树
        return rootP == rootQ;
    }

    public int getCount() {
        return count;
    }
}
