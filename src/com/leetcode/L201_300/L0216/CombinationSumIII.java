package com.leetcode.L201_300.L0216;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 216. 组合总和 III
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * 说明：
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。
 *
 * 示例 1:
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 *
 * 示例 2:
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 */
public class CombinationSumIII {
    /**
     * 回溯算法（深度优先搜索 + 剪枝）
     * @param k 组合元素的个数
     * @param n 目标值
     * @return 组合结果
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        //结果List
        List<List<Integer>> res = new ArrayList<>();
        //条件全为0的情况
        if (k == 0 || n == 0){
            return res;
        }
        //1~9的和最大时45
        if (n > 45){
            return res;
        }
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先搜索函数，从1位置开始
        dfs(1,k,n,path,res);
        return res;
    }

    /**
     * 深度优先搜索
     * @param begin      搜索起点
     * @param path       从根节点到叶子节点的路径
     * @param target     目标值
     * @param res        结果List
     */
    private void dfs(int begin, int num, int target, Stack<Integer> path, List<List<Integer>> res) {
        //递归终止条件：当目标值等于0并且栈中元素大小满足规定的个数时，将栈能元素保存到list中
        if (target == 0 && path.size() == num){
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < 10; ++i){
            //此处进行剪枝
            //1~9是有序排列的，如果当前的值已经使target小于0，其i之后的值都会使target小于0
            //栈中元素大小已经超过规定的个数的情况
            if (target - i < 0 && path.size() > num)
                return;
            //向路径里添加一个点
            path.push(i);
            // 注意：由于每一个元素不可以重复使用，下一轮搜索的起点依然是 i+1，这里非常容易弄错
            dfs(i+1, num, target - i, path, res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }
}
