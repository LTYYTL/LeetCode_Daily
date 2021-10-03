package com.leetcode.L1_100.L0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 90. 子集 II
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 * 输入: [1,2,2]
 * 输出:
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 */
public class SubsetsII {
    /**
     * 方法：回溯算法
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //结果list
        List<List<Integer>> res = new ArrayList<>();
        //空值情况
        if (nums.length == 0)
            return res;
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //空集是所有集合的子集
        res.add(new ArrayList<>());
        //排序数组，用于剪枝
        Arrays.sort(nums);
        //用于控制子集中数量的多少
        //最少一个，最多为整个数组
        for (int i = 1; i <= nums.length; i++){
            //调用深度优先搜素函数，每次都从数组第一个开始，即索引为0的位置
            dfs(nums,0,path,res,i);
        }
        return res;
    }

    /**
     * 深度优先搜索
     * @param nums  候选数组
     * @param begin 每次调用开始的位置
     * @param path  子集
     * @param res   结果list
     * @param count 子集中元素个数
     */
    private void dfs(int[] nums, int begin, Stack<Integer> path, List<List<Integer>> res, int count) {
        //递归结束条件:当前栈能元素个数满足当前子集个数时
        if (path.size() == count){
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < nums.length; i++){
            //此处进行剪枝
            //如果以当前结点为头结点的所有组合都找完了，那么下一个与他相同的头结点就不用去找了。
            if(i > begin && nums[i] == nums[i-1])
                continue;
            //将当前元素加入
            path.push(nums[i]);
            // 由于每一个元素不可以重复使用，下一轮搜索的起点是 i+1，这里非常容易弄错
            dfs(nums, i+1, path, res, count);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }
}
