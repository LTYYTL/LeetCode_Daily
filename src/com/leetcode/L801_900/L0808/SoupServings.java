package com.leetcode.L801_900.L0808;

import java.util.Arrays;

/**
 * 808. 分汤
 * 有 A 和 B 两种类型 的汤。一开始每种类型的汤有 n 毫升。有四种分配操作：
 * (1)提供 100ml 的 汤A 和 0ml 的 汤B 。
 * (2)提供 75ml 的 汤A 和 25ml 的 汤B 。
 * (3)提供 50ml 的 汤A 和 50ml 的 汤B 。
 * (4)提供 25ml 的 汤A 和 75ml 的 汤B 。
 * 当我们把汤分配给某人之后，汤就没有了。每个回合，我们将从四种概率同为 0.25 的操作中进行分配选择。
 * 如果汤的剩余量不足以完成某次操作，我们将尽可能分配。当两种类型的汤都分配完时，停止操作。
 * <p>
 * 注意 不存在先分配 100 ml 汤B 的操作。
 * 需要返回的值： 汤A 先分配完的概率 +  汤A和汤B 同时分配完的概率 / 2。返回值在正确答案 10-5 的范围内将被认为是正确的。
 * <p>
 * 示例 1:
 * 输入: n = 50
 * 输出: 0.62500
 * 解释:如果我们选择前两个操作，A 首先将变为空。
 * 对于第三个操作，A 和 B 会同时变为空。
 * 对于第四个操作，B 首先将变为空。
 * 所以 A 变为空的总概率加上 A 和 B 同时变为空的概率的一半是 0.25 *(1 + 1 + 0.5 + 0)= 0.625。
 * <p>
 * 示例 2:
 * 输入: n = 100
 * 输出: 0.71875
 * <p>
 * 提示:
 * 0 <= n <= 109
 */
public class SoupServings {
    /**
     * 方法：动态规划
     */
    public double soupServings(int n) {
        //  计算份数
        n = (int) Math.ceil((double) n / 25);

        // 超过179，概率接近1
        if (n >= 179) {
            return 1.0;
        }

        // 记录概率，dp[i][j]表示i份A和j份B
        double[][] dp = new double[n + 1][n + 1];

        // 没有A的情况
        Arrays.fill(dp[0], 1.0);

        // A和B都分配完
        dp[0][0] = 0.5;

        // 遍历
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (
                        dp[Math.max(0, i - 4)][j] //操作1
                                + dp[Math.max(0, i - 3)][Math.max(0, j - 1)] // 操作2
                                + dp[Math.max(0, i - 2)][Math.max(0, j - 2)] // 操作3
                                + dp[Math.max(0, i - 1)][Math.max(0, j - 3)] // 操作4
                ) / 4.0;
            }
        }

        return dp[n][n];
    }
}