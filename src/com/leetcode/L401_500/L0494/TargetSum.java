package com.leetcode.L401_500.L0494;

/**
 * 494. 目标和
 * 给你一个整数数组 nums 和一个整数 target 。
 * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 *
 * 示例 1：
 * 输入：nums = [1,1,1,1,1], target = 3
 * 输出：5
 * 解释：一共有 5 种方法让最终目标和为 3 。
 * -1 + 1 + 1 + 1 + 1 = 3
 * +1 - 1 + 1 + 1 + 1 = 3
 * +1 + 1 - 1 + 1 + 1 = 3
 * +1 + 1 + 1 - 1 + 1 = 3
 * +1 + 1 + 1 + 1 - 1 = 3
 *
 * 示例 2：
 * 输入：nums = [1], target = 1
 * 输出：1
 *
 * 提示：
 * 1 <= nums.length <= 20
 * 0 <= nums[i] <= 1000
 * 0 <= sum(nums[i]) <= 1000
 * -1000 <= target <= 1000
 */
public class TargetSum {
    int count = 0;

    /**
     * 方法一：回溯算法
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums,target,0,0);
        return count;
    }

    /**
     * 回溯算法
     * @param nums      数组
     * @param target    目标值
     * @param index     索引
     * @param sum       和
     */
    private void backtrack(int[] nums, int target, int index, int sum) {
        //当遍历到数组末尾
        if (index == nums.length){
            //和等于目标值时，结果+1
            if (sum == target)
                count++;
        }else{
            //加上当前值，索引向后
            backtrack(nums, target, index+1, sum + nums[index]);
            //减去当前值，索引向后
            backtrack(nums, target, index+1, sum - nums[index]);
        }
    }

    /**
     * 方法二：动态规划
     * 作者：cheungq-6
     * 链接：https://leetcode-cn.com/problems/target-sum/solution/dong-tai-gui-hua-by-cheungq-6-h1dz/
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays_dp(int[] nums, int target) {
        //和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        //判断目标是是不是超过-sum~sum
        if (target > sum || target < -sum)
            return 0;
        //行:数组索引
        //列：-sum~sum
        int[][] dp = new int[nums.length+1][sum * 2 + 1];
        //没有数，目标值为0的位置
        dp[0][sum] = 1;
        //遍历
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                //上一层不为0的位置，在它的基础上做操作
                if (dp[i-1][j] != 0){
                    dp[i][j-nums[i-1]] += dp[i-1][j];
                    dp[i][j+nums[i-1]] += dp[i-1][j];
                }
            }
        }
        //最后一行，目标值
        return dp[dp.length - 1][sum + target];
    }
}



