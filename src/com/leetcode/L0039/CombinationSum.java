package com.leetcode.L0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 * 说明：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 *
 * 示例 1：
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 *
 * 示例 2：
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 * 提示：
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都是独一无二的。
 * 1 <= target <= 500
 */
public class CombinationSum {
    /**
     * 方法一：回溯算法（深度优先搜索）
     * @param candidates 候选数组
     * @param target     目标值
     * @return 组合结果
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //结果List
        List<List<Integer>> res = new ArrayList<>();
        //数组为0时，直接返回res
        if (candidates.length == 0){
            return  res;
        }
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先搜索函数
        dfs(candidates,0,path,target,res);
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
    private void dfs(int[] candidates,int begin,Stack<Integer> path,int target,List<List<Integer>> res){
        //目标值小于0，不创建新的孩子节点
        if (target < 0)
            return;
        //递归终止条件：当目标值等于0，将栈能元素保存到list中
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < candidates.length; ++i){
            //向路径里添加一个点
            path.push(candidates[i]);
            // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
            dfs(candidates,i,path,target-candidates[i],res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }

    /**
     * 方法二：回溯算法（深度优先搜索 + 剪枝）
     * @param candidates 候选数组
     * @param target     目标值
     * @return 组合结果
     */
    public List<List<Integer>> combinationSum_cut(int[] candidates, int target) {
        //结果List
        List<List<Integer>> res = new ArrayList<>();
        //数组为0时，直接返回res
        if (candidates.length == 0){
            return  res;
        }
        //为剪枝做准备
        Arrays.sort(candidates);
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先搜索函数
        dfs_cut(candidates,0,path,target,res);
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
    private void dfs_cut(int[] candidates,int begin,Stack<Integer> path,int target,List<List<Integer>> res){
        //递归终止条件：当目标值等于0，将栈能元素保存到list中
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < candidates.length; ++i){
            //此处进行剪枝
            //数组进行了排序，如果当前的值已经使target小于0，其candidates[i]之后的值都会使target小于0
            if(target - candidates[i] < 0){
                break;
            }
            //向路径里添加一个点
            path.push(candidates[i]);
            // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
            dfs_cut(candidates,i,path,target-candidates[i],res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }

}
