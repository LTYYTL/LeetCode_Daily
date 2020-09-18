package com.leetcode.L0047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */
public class PermutationsII {
    /**
     * 方法：回溯算法
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        //存储所有的全排序
        List<List<Integer>> res = new ArrayList<>();
        //空值情况
        if (nums.length == 0 || nums == null)
            return res;
        //对数组进行排列，用于剪枝
        Arrays.sort(nums);
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //当前位置是否被使用的状态变量
        boolean[] state = new boolean[nums.length];
        //调用深度优先搜索函数，从第0个索引位置开始
        dsf(nums,0,path,res,state);
        return res;
    }

    /**
     * 深度优先搜索
     * @param nums       候选数组
     * @param begin      搜索起点
     * @param path       从根节点到叶子节点的路径
     * @param state      状态变量
     * @param res        结果List
     */
    private void dsf(int[] nums, int begin, Stack<Integer> path, List<List<Integer>> res, boolean[] state) {
        //递归终止条件：排列组合完成，将栈能元素保存到list中
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < nums.length; i++){
            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !state[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && nums[i] == nums[i-1] && !state[i-1])
                continue;
            //当前位置已经被使用过
            if (state[i])
                continue;
            //向路径里添加一个点
            path.add(nums[i]);
            //将当前位置的状态改变成使用
            state[i] = true;
            // 注意：每次排列组合除去使用过的数其他的都可再次使用，下一轮搜索的起点依然是0，这里非常容易弄错
            dsf(nums, 0, path, res, state);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
            //此处结束后，将当前位置的状态改变成未使用，表示下次还可以使用
            state[i] = false;
        }
    }
}
