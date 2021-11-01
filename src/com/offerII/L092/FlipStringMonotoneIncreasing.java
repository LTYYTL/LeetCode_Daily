package com.offerII.L092;

/**
 * 剑指 Offer II 092. 翻转字符
 * 如果一个由 '0' 和 '1' 组成的字符串，是以一些 '0'（可能没有 '0'）后面跟着一些 '1'（也可能没有 '1'）的形式组成的，那么该字符串是 单调递增 的。
 * 我们给出一个由字符 '0' 和 '1' 组成的字符串 s，我们可以将任何 '0' 翻转为 '1' 或者将 '1' 翻转为 '0'。
 * 返回使 s 单调递增 的最小翻转次数。
 *
 * 示例 1：
 * 输入：s = "00110"
 * 输出：1
 * 解释：我们翻转最后一位得到 00111.
 *
 * 示例 2：
 * 输入：s = "010110"
 * 输出：2
 * 解释：我们翻转得到 011111，或者是 000111。
 *
 * 示例 3：
 * 输入：s = "00011000"
 * 输出：2
 * 解释：我们翻转得到 00000000。
 *
 * 提示：
 * 1 <= s.length <= 20000
 * s 中只包含字符 '0' 和 '1'
 *
 * 注意：本题与主站 926 题相同： https://leetcode-cn.com/problems/flip-string-to-monotone-increasing/
 */
public class FlipStringMonotoneIncreasing {
    /**
     * 方法：动态规划
     * @param s
     * @return
     */
    public int minFlipsMonoIncr(String s) {
        //dp[i][x] : 表示前i个元素以x结尾的最小反转次数，i:位置，x:结尾数
        int[][] dp = new int[s.length()][2];
        //第一个字符是0，以1结尾就需要反转一下，否则，以0结尾就要反转
        if (s.charAt(0) == '0')
            dp[0][1] = 1;
        else
            dp[0][0] = 1;
        //遍历
        for (int i = 1; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //以1结尾不用考虑前面是0还是1，只考虑当前位就可以
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][1]) + (c == '1' ? 0 : 1);
            //以0结尾，前边必须都是0
            dp[i][0] = dp[i-1][0] + (c == '0' ? 0 : 1);
        }
        return Math.min(dp[s.length()-1][0],dp[s.length()-1][1]);
    }
}
