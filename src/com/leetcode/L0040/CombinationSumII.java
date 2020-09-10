package com.leetcode.L0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 40. 组合总和 II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 说明：
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 *
 * 示例 1:
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 *
 * 示例 2:
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 */
public class CombinationSumII {
    /**
     * 回溯算法（深度优先搜索 + 剪枝）
     * @param candidates 候选数组
     * @param target     目标值
     * @return 组合结果
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //结果List
        List<List<Integer>> res = new ArrayList<>();
        //数组为空的情况
        if (candidates == null || candidates.length == 0)
            return res;
        //数组排序，为剪枝做准备
        Arrays.sort(candidates);
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先搜索函数，从第0个索引位置开始
        dsf(candidates,0,target,path,res);
        return res;
    }

    /**
     * 深度优先搜索
     * @param candidates 候选数组
     * @param begin      搜索起点
     * @param path       从根节点到叶子节点的路径
     * @param target     目标值
     * @param res        结果List
     */
    private void dsf(int[] candidates, int begin, int target, Stack<Integer> path, List<List<Integer>> res) {
        //递归终止条件：当目标值等于0，将栈能元素保存到list中
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < candidates.length; i++){
            //此处进行剪枝
            //数组进行了排序，如果当前的值已经使target小于0，其candidates[i]之后的值都会使target小于0
            if(target - candidates[i] < 0){
                break;
            }
            //如果以当前结点为头结点的所有组合都找完了，那么下一个与他相同的头结点就不用去找了。
            if(i > begin && candidates[i] == candidates[i - 1]) continue;
            //向路径里添加一个点
            path.push(candidates[i]);
            // 注意：由于每一个元素不可以重复使用，下一轮搜索的起点依然是 i+1，这里非常容易弄错
            dsf(candidates, i+1, target - candidates[i], path, res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }
}
