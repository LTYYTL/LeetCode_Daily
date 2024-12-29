package com.leetcode.L1301_1400.L1336;

public class TeamRankByVotingTest {
    public static void main(String[] args) {
        TeamRankByVoting teamRankByVoting = new TeamRankByVoting();
        /*
         * 示例 1：
         * 输入：votes = ["ABC","ACB","ABC","ACB","ACB"]
         * 输出："ACB"
         * 解释：
         * A 队获得五票「排位第一」，没有其他队获得「排位第一」，所以 A 队排名第一。
         * B 队获得两票「排位第二」，三票「排位第三」。
         * C 队获得三票「排位第二」，两票「排位第三」。
         * 由于 C 队「排位第二」的票数较多，所以 C 队排第二，B 队排第三。
         */
        System.out.println(teamRankByVoting.rankTeams(new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"}));
        /*
         * 示例 2：
         * 输入：votes = ["WXYZ","XYZW"]
         * 输出："XWYZ"
         * 解释：
         * X 队在并列僵局打破后成为排名第一的团队。X 队和 W 队的「排位第一」票数一样，但是 X 队有一票「排位第二」，而 W 没有获得「排位第二」。
         */
        System.out.println(teamRankByVoting.rankTeams(new String[]{"WXYZ", "XYZW"}));
        /*
         * 示例 3：
         * 输入：votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]
         * 输出："ZMNAGUEDSJYLBOPHRQICWFXTVK"
         * 解释：只有一个投票者，所以排名完全按照他的意愿。
         */
        System.out.println(teamRankByVoting.rankTeams(new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
    }
}
