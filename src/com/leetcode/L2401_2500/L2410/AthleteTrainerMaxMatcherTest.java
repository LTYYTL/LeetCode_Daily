package com.leetcode.L2401_2500.L2410;

public class AthleteTrainerMaxMatcherTest {
    public static void main(String[] args) {
        AthleteTrainerMaxMatcher athleteTrainerMaxMatcher = new AthleteTrainerMaxMatcher();
        /*
         * 示例 1：
         * 输入：players = [4,7,9], trainers = [8,2,5,8]
         * 输出：2
         * 解释：
         * 得到两个匹配的一种方案是：
         * - players[0] 与 trainers[0] 匹配，因为 4 <= 8 。
         * - players[1] 与 trainers[3] 匹配，因为 7 <= 8 。
         * 可以证明 2 是可以形成的最大匹配数。
         */
        System.out.println(athleteTrainerMaxMatcher.matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}));
        /*
         * 示例 2：
         * 输入：players = [1,1,1], trainers = [10]
         * 输出：1
         * 解释：
         * 训练师可以匹配所有 3 个运动员
         * 每个运动员至多只能匹配一个训练师，所以最大答案是 1 。
         */
        System.out.println(athleteTrainerMaxMatcher.matchPlayersAndTrainers(new int[]{1, 1, 1}, new int[]{10}));
    }
}
