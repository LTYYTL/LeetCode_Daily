package com.leetcode.L1201_1300.L1235;

public class MaxProfitJobTest {
    public static void main(String[] args) {
        MaxProfitJob maxProfitJob = new MaxProfitJob();
        /*
          示例 1：
          输入：startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
          输出：120
          解释：
          我们选出第 1 份和第 4 份工作，
          时间范围是 [1-3]+[3-6]，共获得报酬 120 = 50 + 70。
         */
        System.out.println(maxProfitJob.jobScheduling(new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}));
        /*
          示例 2：
          输入：startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
          输出：150
          解释：
          我们选择第 1，4，5 份工作。
          共获得报酬 150 = 20 + 70 + 60。
         */
        System.out.println(maxProfitJob.jobScheduling(new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}));
        /*
          示例 3：
          输入：startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
          输出：6
         */
        System.out.println(maxProfitJob.jobScheduling(new int[]{1, 1, 1}, new int[]{2, 3, 4}, new int[]{5, 6, 4}));
    }
}
