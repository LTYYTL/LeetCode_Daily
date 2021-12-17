package com.interview.L1010;

public class StreamRankTest {
    public static void main(String[] args) {
        /**
         * 示例:
         * 输入:
         * ["StreamRank", "getRankOfNumber", "track", "getRankOfNumber"]
         * [[], [1], [0], [0]]
         * 输出:
         * [null,0,null,1]
         */
        StreamRank streamRank = new StreamRank();
        System.out.println(streamRank.getRankOfNumber(1));
        streamRank.track(0);
        System.out.println(streamRank.getRankOfNumber(0));
    }
}
