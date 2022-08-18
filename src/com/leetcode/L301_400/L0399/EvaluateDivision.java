package com.leetcode.L301_400.L0399;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 399. 除法求值
 * 给你一个变量对数组 equations 和一个实数值数组 values 作为已知条件，其中 equations[i] = [Ai, Bi] 和 values[i] 共同表示等式 Ai / Bi = values[i] 。每个 Ai 或 Bi 是一个表示单个变量的字符串。
 * 另有一些以数组 queries 表示的问题，其中 queries[j] = [Cj, Dj] 表示第 j 个问题，请你根据已知条件找出 Cj / Dj = ? 的结果作为答案。
 * 返回 所有问题的答案 。如果存在某个无法确定的答案，则用 -1.0 替代这个答案。如果问题中出现了给定的已知条件中没有出现的字符串，也需要用 -1.0 替代这个答案。
 * 注意：输入总是有效的。你可以假设除法运算中不会出现除数为 0 的情况，且不存在任何矛盾的结果。
 *
 * 示例 1：
 * 输入：equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * 输出：[6.00000,0.50000,-1.00000,1.00000,-1.00000]
 * 解释：
 * 条件：a / b = 2.0, b / c = 3.0
 * 问题：a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
 * 结果：[6.0, 0.5, -1.0, 1.0, -1.0 ]
 *
 * 示例 2：
 * 输入：equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
 * 输出：[3.75000,0.40000,5.00000,0.20000]
 *
 * 示例 3：
 * 输入：equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
 * 输出：[0.50000,2.00000,-1.00000,-1.00000]
 *
 * 提示：
 * 1 <= equations.length <= 20
 * equations[i].length == 2
 * 1 <= Ai.length, Bi.length <= 5
 * values.length == equations.length
 * 0.0 < values[i] <= 20.0
 * 1 <= queries.length <= 20
 * queries[i].length == 2
 * 1 <= Cj.length, Dj.length <= 5
 * Ai, Bi, Cj, Dj 由小写英文字母与数字组成
 */
public class EvaluateDivision {
    /**
     * 方法：并查集
     * @param equations
     * @param values
     * @param queries
     * @return
     */
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        //条件集合长
        int size = equations.size();
        //最差结果是每个
        UF uf = new UF(size * 2);
        //对条件进行预处理
        Map<String,Integer> map = new HashMap<>(size*2);
        //将每个变量映射一个id
        int id = 0;
        //遍历
        for (int i = 0; i < size; i++) {
            //获取两个变量
            List<String> list = equations.get(i);
            String s1 = list.get(0);
            String s2 = list.get(1);
            //不存在就做映射
            if (!map.containsKey(s1)){
                map.put(s1,id);
                id++;
            }
            if (!map.containsKey(s2)){
                map.put(s2,id);
                id++;
            }
            //合并
            uf.union(map.get(s1),map.get(s2),values[i]);

        }

        //结果
        double[] res = new double[queries.size()];
        //遍历
        for (int i = 0; i < res.length; i++) {
            //获取问题变量
            List<String> list = queries.get(i);
            String s1 = list.get(0);
            String s2 = list.get(1);
            //变量id
            Integer x = map.get(s1);
            Integer y = map.get(s2);
            //变量不存在
            if (x == null || y == null)
                res[i] = -1.0d;
            else
                res[i] = uf.isConnected(x,y);
        }
        return res;
    }

    /**
     * 并查集
     */
    class UF{
        //根节点
        private final int[] parent;
        //权重
        private final double[] weight;

        //初始化
        public UF(int n) {
            this.parent = new int[n];
            this.weight = new double[n];
            for (int i = 0; i < n; i++) {
                //每个点的根节点初始化是自己
                parent[i] = i;
                weight[i] = 1.0d;
            }
        }

        /**
         * 合并
         * @param x
         * @param y
         * @param value
         */
        public void union(int x, int y, double value) {
            //找寻根节点
            int rootX = find(x);
            int rootY = find(y);
            //同一个根节点
            if (rootX == rootY)
                return;
            //合并
            parent[rootX] = rootY;
            //计算权值
            weight[rootX] = weight[y] * value / weight[x];
        }

        /**
         * 寻找根节点
         * @param x
         * @return
         */
        private int find(int x) {
            //路径压缩
            if (parent[x] != x){
                int temp = parent[x];
                parent[x] = find(parent[x]);
                weight[x] *= weight[temp];
            }
            return parent[x];
        }

        /**
         * 计算权值比
         * @param x
         * @param y
         * @return
         */
        public double isConnected(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            //同一个根节点
            if (rootX == rootY)
                return weight[x] / weight[y];
            return -1.0d;
        }
    }
}
