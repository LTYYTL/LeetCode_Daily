package com.leetcode.L1_100.L0077;

import java.util.*;

/**
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *
 * 示例:
 * 输入: n = 4, k = 2
 * 输出:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
public class Combination {
    /**
     * 回溯法（深度优先遍历 + 剪枝）
     * @param n 从1~n个数
     * @param k 每K个数为一组
     * @return  所有的可能性
     */
    public List<List<Integer>> combine(int n, int k) {
        //结果变量
        List<List<Integer>> res = new ArrayList<>();
        //特殊情况：n和 k都不合法
        if(n <= 0 || k <= 0)
            return res;
        //用于深度优先遍历的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先算法，根据题目从1开始
        dfs(n,k,1,path, res);
        return res;
    }

    private void dfs(int n, int k, int begin, Stack<Integer> path, List<List<Integer>> res) {
        //递归终止条件：当栈中元素个数等于k时，将栈能元素保存到list中
        if (path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        //遍历可能的搜索点
        //n = 15 ，k = 4。
        //path.size() == 1 的时候，接下来要选择 3 个数，搜索起点最大是 13，最后一个被选的是 [13, 14, 15]；
        //path.size() == 2 的时候，接下来要选择 2 个数，搜索起点最大是 14，最后一个被选的是 [14, 15]；
        //path.size() == 3 的时候，接下来要选择 1 个数，搜索起点最大是 15，最后一个被选的是 [15]；
        //即：搜索起点的上界 = n - (k - path.size()) + 1，剪枝操作
        for (int i = begin; i <= n - (k - path.size()) + 1; ++i){
            //向路径里添加一个值
            path.push(i);
            //下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
            dfs(n, k,i+1, path, res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }


}
