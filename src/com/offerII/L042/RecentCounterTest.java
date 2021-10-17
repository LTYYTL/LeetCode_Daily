package com.offerII.L042;

public class RecentCounterTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * 输入：
         * ["RecentCounter", "ping", "ping", "ping", "ping"]
         * [[], [1], [100], [3001], [3002]]
         * 输出：
         * [null, 1, 2, 3, 3]
         * 解释：
         * RecentCounter recentCounter = new RecentCounter();
         * recentCounter.ping(1);     // requests = [1]，范围是 [-2999,1]，返回 1
         * recentCounter.ping(100);   // requests = [1, 100]，范围是 [-2900,100]，返回 2
         * recentCounter.ping(3001);  // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3
         * recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3
         */
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}
