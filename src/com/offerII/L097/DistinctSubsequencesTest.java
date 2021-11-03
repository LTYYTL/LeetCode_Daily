package com.offerII.L097;


public class DistinctSubsequencesTest {
    public static void main(String[] args) {
        DistinctSubsequences distinctSubsequences = new DistinctSubsequences();
        /**
         * 示例 1：
         * 输入：s = "rabbbit", t = "rabbit"
         * 输出：3
         * 解释：
         * 如下图所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。
         * rabbbit
         * rabbbit
         * rabbbit
         */
        System.out.println(distinctSubsequences.numDistinct("rabbbit", "rabbit"));
        /**
         * 示例 2：
         * 输入：s = "babgbag", t = "bag"
         * 输出：5
         * 解释：
         * 如下图所示, 有 5 种可以从 s 中得到 "bag" 的方案。
         * babgbag
         * babgbag
         * babgbag
         * babgbag
         * babgbag
         */
        System.out.println(distinctSubsequences.numDistinct("babgbag", "bag"));
    }
}
