package com.leetcode.L1201_1300.L1220;

/**
 * 1220. 统计元音字母序列的数目
 * 给你一个整数 n，请你帮忙统计一下我们可以按下述规则形成多少个长度为 n 的字符串：
 * 字符串中的每个字符都应当是小写元音字母（'a', 'e', 'i', 'o', 'u'）
 * (1)每个元音 'a' 后面都只能跟着 'e'
 * (2)每个元音 'e' 后面只能跟着 'a' 或者是 'i'
 * (3)每个元音 'i' 后面 不能 再跟着另一个 'i'
 * (4)每个元音 'o' 后面只能跟着 'i' 或者是 'u'
 * (5)每个元音 'u' 后面只能跟着 'a'
 * 由于答案可能会很大，所以请你返回 模 10^9 + 7 之后的结果。
 *
 * 示例 1：
 * 输入：n = 1
 * 输出：5
 * 解释：所有可能的字符串分别是："a", "e", "i" , "o" 和 "u"。
 *
 * 示例 2：
 * 输入：n = 2
 * 输出：10
 * 解释：所有可能的字符串分别是："ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" 和 "ua"。
 *
 * 示例 3：
 * 输入：n = 5
 * 输出：68
 *
 * 提示：
 * 1 <= n <= 2 * 10^4
 */
public class CountVowelsPermutation {
    /**
     * 方法：动态规划
     * @param n
     * @return
     */
    public int countVowelPermutation(int n) {
        //a:0,e:1,i:2,o:3,u:4
        //dp[i][0]:表示长度为i的字符串以a结尾的个数
        //dp[i][1]:表示长度为i的字符串以e结尾的个数
        long[][] dp = new long[n+1][5];
        //模
        long MOD = 1000000007;
        //初值
        for (int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }
        //遍历
        for (int i = 2; i <= n; i++) {
            //a前面可以为e,i,u
            dp[i][0] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][4])%MOD;
            //e前面可以为a,i
            dp[i][1] = (dp[i-1][0] + dp[i-1][2])%MOD;
            //i前面可以为e,o
            dp[i][2] = (dp[i-1][1] + dp[i-1][3])%MOD;
            //o前面可以为i
            dp[i][3] = dp[i-1][2]%MOD;
            //u前面可以为i,o
            dp[i][4] = (dp[i-1][2] + dp[i-1][3])%MOD;
        }

        //计算和
        long res = 0;
        for (int i = 0; i < 5; i++) {
            res = (res + dp[n][i]) % MOD;
        }
        return (int) res;
    }
}
