package com.leetcode.L301_400.L0377;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 377. 组合总和 Ⅳ
 * 给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。
 * 题目数据保证答案符合 32 位整数范围。
 *
 * 示例 1：
 * 输入：nums = [1,2,3], target = 4
 * 输出：7
 * 解释：
 * 所有可能的组合为：
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * 请注意，顺序不同的序列被视作不同的组合。
 *
 * 示例 2：
 * 输入：nums = [9], target = 3
 * 输出：0
 *
 * 提示：
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 1000
 * nums 中的所有元素 互不相同
 * 1 <= target <= 1000
 * 进阶：如果给定的数组中含有负数会发生什么？问题会产生何种变化？如果允许负数出现，需要向题目中添加哪些限制条件？
 */
public class CombinationSumIV {
    /**
     * 方法：回溯算法（超时操作）
     * @param nums
     * @param target
     * @return
     */
    public int combinationSum4(int[] nums, int target) {
        //结果List
        List<List<Integer>> res = new ArrayList<>();
        //数组排序用于剪枝
        Arrays.sort(nums);
        if (nums[0] > target || nums.length == 0) {
            return 0;
        }
        //用于深度优先搜索的栈
        Stack<Integer> path = new Stack<>();
        //调用深度优先搜索函数
        dfs(nums,res,path,target,0);
        return res.size();
    }

    private void dfs(int[] nums, List<List<Integer>> res, Stack<Integer> path, int target, int begin) {
        //递归终止条件：当目标值等于0，将栈能元素保存到list中
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        //从begin开始搜索
        for (int i = begin; i < nums.length; ++i){
            //此处进行剪枝
            //数组进行了排序，如果当前的值已经使target小于0，其candidates[i]之后的值都会使target小于0
            if(target - nums[i] < 0){
                break;
            }
            //向路径里添加一个点
            path.push(nums[i]);
            // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
            dfs(nums,res,path,target-nums[i],0);
            //深度优先遍历有回头的过程，因此递归之前做了什么，需要将此次循环添加的数移除
            path.pop();
        }
    }

    /**
     * 方法二：
     * @param nums
     * @param target
     * @return
     */
    public int combinationSum4_dp(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

}
