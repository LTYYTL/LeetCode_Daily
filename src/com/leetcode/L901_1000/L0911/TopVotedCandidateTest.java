package com.leetcode.L901_1000.L0911;

public class TopVotedCandidateTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * 输入：
         * ["TopVotedCandidate", "q", "q", "q", "q", "q", "q"]
         * [[[0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]], [3], [12], [25], [15], [24], [8]]
         * 输出：
         * [null, 0, 1, 1, 0, 0, 1]
         * 解释：
         * TopVotedCandidate topVotedCandidate = new TopVotedCandidate([0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]);
         * topVotedCandidate.q(3); // 返回 0 ，在时刻 3 ，票数分布为 [0] ，编号为 0 的候选人领先。
         * topVotedCandidate.q(12); // 返回 1 ，在时刻 12 ，票数分布为 [0,1,1] ，编号为 1 的候选人领先。
         * topVotedCandidate.q(25); // 返回 1 ，在时刻 25 ，票数分布为 [0,1,1,0,0,1] ，编号为 1 的候选人领先。（在平局的情况下，1 是最近获得投票的候选人）。
         * topVotedCandidate.q(15); // 返回 0
         * topVotedCandidate.q(24); // 返回 0
         * topVotedCandidate.q(8); // 返回 1
         */
        TopVotedCandidate topVotedCandidate = new TopVotedCandidate(new int[]{0, 1, 1, 0, 0, 1, 0},new int[]{0, 5, 10, 15, 20, 25, 30});
        System.out.println(topVotedCandidate.q(3));
        System.out.println(topVotedCandidate.q(12));
        System.out.println(topVotedCandidate.q(25));
        System.out.println(topVotedCandidate.q(15));
        System.out.println(topVotedCandidate.q(24));
        System.out.println(topVotedCandidate.q(8));
    }
}
