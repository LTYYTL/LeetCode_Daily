package com.leetcode.L2501_2600.L2506;

public class SimilarStrPairCounterTest {
    public static void main(String[] args) {
        SimilarStrPairCounter similarStrPairCounter = new SimilarStrPairCounter();
        /*
         * 示例 1：
         * 输入：words = ["aba","aabb","abcd","bac","aabc"]
         * 输出：2
         * 解释：共有 2 对满足条件：
         * - i = 0 且 j = 1 ：words[0] 和 words[1] 只由字符 'a' 和 'b' 组成。
         * - i = 3 且 j = 4 ：words[3] 和 words[4] 只由字符 'a'、'b' 和 'c' 。
         */
        System.out.println(similarStrPairCounter.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
        /*
         * 示例 2：
         * 输入：words = ["aabb","ab","ba"]
         * 输出：3
         * 解释：共有 3 对满足条件：
         * - i = 0 且 j = 1 ：words[0] 和 words[1] 只由字符 'a' 和 'b' 组成。
         * - i = 0 且 j = 2 ：words[0] 和 words[2] 只由字符 'a' 和 'b' 组成。
         * - i = 1 且 j = 2 ：words[1] 和 words[2] 只由字符 'a' 和 'b' 组成。
         */
        System.out.println(similarStrPairCounter.similarPairs(new String[]{"aabb", "ab", "ba"}));
        /*
         * 示例 3：
         * 输入：words = ["nba","cba","dba"]
         * 输出：0
         * 解释：不存在满足条件的下标对，返回 0 。
         */
        System.out.println(similarStrPairCounter.similarPairs(new String[]{"nba", "cba", "dba"}));
    }
}
