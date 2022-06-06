package com.leetcode.L701_800.L0829;

/**
 * 829. 连续整数求和
 * 给定一个正整数 n，返回 连续正整数满足所有数字之和为 n 的组数 。
 * <p>
 * 示例 1:
 * 输入: n = 5
 * 输出: 2
 * 解释: 5 = 2 + 3，共有两组连续整数([5],[2,3])求和后为 5。
 * <p>
 * 示例 2:
 * 输入: n = 9
 * 输出: 3
 * 解释: 9 = 4 + 5 = 2 + 3 + 4
 * <p>
 * 示例 3:
 * 输入: n = 15
 * 输出: 4
 * 解释: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
 * <p>
 * 提示:
 * 1 <= n <= 109
 */
public class ConsecutiveNumbersSum {
    /**
     * 方法：数学
     *
     * @param n
     * @return
     */
    public int consecutiveNumbersSum(int n) {
        //结果
        int ans = 0;
        //遍历
        for (int k = 1; k * k < 2 * n; k++) {
            if (2 * n % k == 0 && (2 * n / k - k + 1) % 2 == 0)
                ans++;
        }
        return ans;
    }
}
