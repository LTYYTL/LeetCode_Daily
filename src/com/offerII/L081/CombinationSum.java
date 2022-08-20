package com.offerII.L081;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer II 081. 允许重复选择元素的组合
 * 给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
 * candidates 中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。
 * 对于给定的输入，保证和为 target 的唯一组合数少于 150 个。
 *
 * 示例 1：
 * 输入: candidates = [2,3,6,7], target = 7
 * 输出: [[7],[2,2,3]]
 *
 * 示例 2：
 * 输入: candidates = [2,3,5], target = 8
 * 输出: [[2,2,2,2],[2,3,3],[3,5]]
 *
 * 示例 3：
 * 输入: candidates = [2], target = 1
 * 输出: []
 *
 * 示例 4：
 * 输入: candidates = [1], target = 1
 * 输出: [[1]]
 *
 * 示例 5：
 * 输入: candidates = [1], target = 2
 * 输出: [[1,1]]
 *
 * 提示：
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都是独一无二的。
 * 1 <= target <= 500
 *
 * 注意：本题与主站 39 题相同： <a href="https://leetcode-cn.com/problems/combination-sum/">https://leetcode-cn.com/problems/combination-sum/</a>
 */
public class CombinationSum {
    /**
     * 方法：回溯算法（深度优先搜索 + 剪枝）
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
        //为剪枝做准备
        Arrays.sort(candidates);
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先搜索函数，从第0个索引位置开始
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
            dfs(candidates,i,path,target-candidates[i],res);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }
}
