package com.offerII.L079;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer II 079. 所有子集
 * 给定一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * 示例 2：
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 * 提示：
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 *
 *
 * 注意：本题与主站 78 题相同： <a href="https://leetcode-cn.com/problems/subsets/">https://leetcode-cn.com/problems/subsets/</a>
 */
public class Subsets {
    /**
     * 方法：回溯算法
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        //结果list
        List<List<Integer>> res = new ArrayList<>();
        //空值情况
        if (nums.length == 0)
            return res;
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //空集是所有集合的子集
        res.add(new ArrayList<>());
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
            //将当前元素加入
            path.push(nums[i]);
            // 由于每一个元素不可以重复使用，下一轮搜索的起点是 i+1，这里非常容易弄错
            dfs(nums, i+1, path, res, count);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }
}
