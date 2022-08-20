package com.leetcode.L1601_1700.L1688;

public class CountMatchesTournamentTest {
    public static void main(String[] args) {
        CountMatchesTournament countMatchesTournament = new CountMatchesTournament();
        /* 示例 1：
         输入：n = 7
         输出：6
         解释：比赛详情：
         - 第 1 轮：队伍数 = 7 ，配对次数 = 3 ，4 支队伍晋级。
         - 第 2 轮：队伍数 = 4 ，配对次数 = 2 ，2 支队伍晋级。
         - 第 3 轮：队伍数 = 2 ，配对次数 = 1 ，决出 1 支获胜队伍。
         总配对次数 = 3 + 2 + 1 = 6
         */
        System.out.println(countMatchesTournament.numberOfMatches(7));
        /*
          示例 2：
          输入：n = 14
          输出：13
          解释：比赛详情：
          - 第 1 轮：队伍数 = 14 ，配对次数 = 7 ，7 支队伍晋级。
          - 第 2 轮：队伍数 = 7 ，配对次数 = 3 ，4 支队伍晋级。
          - 第 3 轮：队伍数 = 4 ，配对次数 = 2 ，2 支队伍晋级。
          - 第 4 轮：队伍数 = 2 ，配对次数 = 1 ，决出 1 支获胜队伍。
          总配对次数 = 7 + 3 + 2 + 1 = 13
         */
        System.out.println(countMatchesTournament.numberOfMatches(14));
    }
}
