package com.leetcode.L801_900.L0813;

/**
 * 813. 最大平均值和的分组
 * 给定数组 nums 和一个整数 k 。我们将给定的数组 nums 分成 最多 k 个相邻的非空子数组 。 分数 由每个子数组内的平均值的总和构成。
 * 注意我们必须使用 nums 数组中的每一个数进行分组，并且分数不一定需要是整数。
 * 返回我们所能得到的最大 分数 是多少。答案误差在 10-6 内被视为是正确的。
 * <p>
 * 示例 1:
 * 输入: nums = [9,1,2,3,9], k = 3
 * 输出: 20.00000
 * 解释:
 * nums 的最优分组是[9], [1, 2, 3], [9]. 得到的分数是 9 + (1 + 2 + 3) / 3 + 9 = 20.
 * 我们也可以把 nums 分成[9, 1], [2], [3, 9].
 * 这样的分组得到的分数为 5 + 2 + 6 = 13, 但不是最大值.
 * <p>
 * 示例 2:
 * 输入: nums = [1,2,3,4,5,6,7], k = 4
 * 输出: 20.50000
 * <p>
 * 提示:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
public class LargestSumAve {
    /**
     * 方法：动态规划
     */
    public double largestSumOfAverages(int[] nums, int k) {
        // 长度
        int n = nums.length;

        // 前缀和
        double[] prefix = new double[n + 1];

        // 计算前缀和
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // dp[i][j]:从0~i个元素分成j份的平均和
        double[][] dp = new double[n + 1][k + 1];

        // 一份时就是前缀和
        for (int i = 1; i <= n; i++) {
            dp[i][1] = prefix[i] / i;
        }

        // 遍历
        for (int j = 2; j <= k; j++) {
            // 保证最少份数
            for (int i = j; i <= n; i++) {
                for (int x = j - 1; x < i; x++) {
                    dp[i][j] = Math.max(dp[i][j], dp[x][j - 1] + (prefix[i] - prefix[x]) / (i - x));
                }
            }
        }
        return dp[n][k];
    }
}
