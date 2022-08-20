package com.offerII.L101;

/**
 * 剑指 Offer II 101. 分割等和子集
 * 给定一个非空的正整数数组 nums ，请判断能否将这些数字分成元素和相等的两部分。
 *
 * 示例 1：
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：nums 可以分割成 [1, 5, 5] 和 [11] 。
 *
 * 示例 2：
 * 输入：nums = [1,2,3,5]
 * 输出：false
 * 解释：nums 不可以分为和相等的两部分
 *
 * 提示：
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 *
 * 注意：本题与主站 416 题相同： <a href="https://leetcode-cn.com/problems/partition-equal-subset-sum/">https://leetcode-cn.com/problems/partition-equal-subset-sum/</a>
 */
public class PartitionStringSum {
    /**
     * 方法：动态规划
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        //求整个数组的和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // 特判：如果是奇数，就不符合要求
        if ((sum & 1) == 1) {
            return false;
        }
        //目标值
        int target = sum / 2;
        // 创建二维状态数组，行：物品索引，列：容量（包括 0）
        boolean[][] dp = new boolean[len][target + 1];

        // 先填表格第 0 行，第 1 个数只能让容积为它自己的背包恰好装满
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        //遍历
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= target; j++) {
                // 直接从上一行先把结果抄下来，然后再修正
                dp[i][j] = dp[i - 1][j];
                //容量等于自己的背包一定能装下自己
                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                //容量比当前物品大
                if (nums[i] < j) {
                    //dp[i-1][j]：不装当前物品
                    //dp[i-1][j-nums[i]]：装当前物品，剩余装前面的物品
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[len - 1][target];
    }
}
