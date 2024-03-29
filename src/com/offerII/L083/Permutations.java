package com.offerII.L083;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer II 083. 没有重复元素集合的全排列
 * 给定一个不含重复数字的整数数组 nums ，返回其 所有可能的全排列 。可以 按任意顺序 返回答案。
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * 示例 2：
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 *
 * 示例 3：
 * 输入：nums = [1]
 * 输出：[[1]]
 *
 * 提示：
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 *
 *
 * 注意：本题与主站 46 题相同：<a href="https://leetcode-cn.com/problems/permutations/">https://leetcode-cn.com/problems/permutations/</a>
 */
public class Permutations {
    /**
     * 方法：回溯算法
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        //存储所有的全排序
        List<List<Integer>> res = new ArrayList<>();
        //空值情况
        if (nums.length == 0 || nums == null)
            return res;
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //当前位置是否被使用的状态变量
        boolean[] state = new boolean[nums.length];
        //调用深度优先搜索函数，从第0个索引位置开始
        dsf(nums,path,res,state);
        return res;
    }

    /**
     * 深度优先搜索
     * @param nums       候选数组
     * @param path       从根节点到叶子节点的路径
     * @param state      状态变量
     * @param res        结果List
     */
    private void dsf(int[] nums, Stack<Integer> path, List<List<Integer>> res, boolean[] state) {
        //递归终止条件：排列组合完成，将栈能元素保存到list中
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = 0; i < nums.length; i++){
            //当前位置已经被使用过
            if (state[i])
                continue;
            //向路径里添加一个点
            path.add(nums[i]);
            //将当前位置的状态改变成使用
            state[i] = true;
            // 注意：每次排列组合除去使用过的数其他的都可再次使用，下一轮搜索的起点依然是0，这里非常容易弄错
            dsf(nums,path, res, state);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
            //此处结束后，将当前位置的状态改变成未使用，表示下次还可以使用
            state[i] = false;
        }
    }
}
