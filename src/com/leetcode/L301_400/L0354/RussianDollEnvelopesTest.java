package com.leetcode.L301_400.L0354;

public class RussianDollEnvelopesTest {
    public static void main(String[] args) {
        RussianDollEnvelopes russianDollEnvelopes = new RussianDollEnvelopes();
        /*
          示例 1：
          输入：envelopes = [[5,4],[6,4],[6,7],[2,3]]
          输出：3
          解释：最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
         */
        System.out.println(russianDollEnvelopes.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        /*
          示例 2：
          输入：envelopes = [[1,1],[1,1],[1,1]]
          输出：1
         */
        System.out.println(russianDollEnvelopes.maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}}));
    }
}
