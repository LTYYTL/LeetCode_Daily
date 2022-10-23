package com.leetcode.L1201_1300.L1235;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1235. 规划兼职工作
 * 你打算利用空闲时间来做兼职工作赚些零花钱。
 * 这里有 n 份兼职工作，每份工作预计从 startTime[i] 开始到 endTime[i] 结束，报酬为 profit[i]。
 * 给你一份兼职工作表，包含开始时间 startTime，结束时间 endTime 和预计报酬 profit 三个数组，请你计算并返回可以获得的最大报酬。
 * 注意，时间上出现重叠的 2 份工作不能同时进行。
 * 如果你选择的工作在时间 X 结束，那么你可以立刻进行在时间 X 开始的下一份工作。
 * <p>
 * 示例 1：
 * 输入：startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
 * 输出：120
 * 解释：
 * 我们选出第 1 份和第 4 份工作，
 * 时间范围是 [1-3]+[3-6]，共获得报酬 120 = 50 + 70。
 * <p>
 * 示例 2：
 * 输入：startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
 * 输出：150
 * 解释：
 * 我们选择第 1，4，5 份工作。
 * 共获得报酬 150 = 20 + 70 + 60。
 * <p>
 * 示例 3：
 * 输入：startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
 * 输出：6
 * <p>
 * 提示：
 * 1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4
 * 1 <= startTime[i] < endTime[i] <= 10^9
 * 1 <= profit[i] <= 10^4
 */
public class MaxProfitJob {
    /**
     * 方法：动态规划
     */
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        // 长度
        int n = profit.length;
        // 转换成数组
        Work[] works = new Work[n];

        // 初始化
        for (int i = 0; i < n; i++) {
            works[i] = new Work(startTime[i], endTime[i], profit[i]);
        }

        // 按照完成时间排序
        Arrays.sort(works, Comparator.comparingInt(o -> o.end));

        // dp[i]:表示到第i个兼职的最大收入
        int[] dp = new int[n + 1];
        // base
        dp[0] = 0;
        // 遍历
        for (int i = 1; i <= n; i++) {
            // 前一个完成的兼职
            int pre = 0;
            // 寻找前一个完成的兼职
            for (int j = i - 1; j >= 0; j--) {
                if (works[j].end <= works[i - 1].start) {
                    pre = j + 1;
                    break;
                }
            }
            // 记录最大值
            dp[i] = Math.max(dp[i - 1], dp[pre] + works[i - 1].price);
        }

        return dp[n];

    }

    static class Work {
        int start;
        int end;
        int price;

        public Work(int start, int end, int price) {
            this.start = start;
            this.end = end;
            this.price = price;
        }
    }
}
