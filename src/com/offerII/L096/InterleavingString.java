package com.offerII.L096;

/**
 * 剑指 Offer II 096. 字符串交织
 * 给定三个字符串 s1、s2、s3，请判断 s3 能不能由 s1 和 s2 交织（交错） 组成。
 * 两个字符串 s 和 t 交织 的定义与过程如下，其中每个字符串都会被分割成若干 非空 子字符串：
 * s = s1 + s2 + ... + sn
 * t = t1 + t2 + ... + tm
 * |n - m| <= 1
 * 交织 是 s1 + t1 + s2 + t2 + s3 + t3 + ... 或者 t1 + s1 + t2 + s2 + t3 + s3 + ...
 * 提示：a + b 意味着字符串 a 和 b 连接。
 *
 * 示例 1：
 * 输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * 输出：true
 *
 * 示例 2：
 * 输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * 输出：false
 *
 * 示例 3：
 * 输入：s1 = "", s2 = "", s3 = ""
 * 输出：true
 *
 * 提示：
 * 0 <= s1.length, s2.length <= 100
 * 0 <= s3.length <= 200
 * s1、s2、和 s3 都由小写英文字母组成
 *
 * 注意：本题与主站 97 题相同： https://leetcode-cn.com/problems/interleaving-string/
 */
public class InterleavingString {
    /**
     * 方法：动态规划
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        //字符串长度
        int m = s1.length();
        int n = s2.length();
        int t = s3.length();

        //不能组成s3
        if (m + n != t)
            return false;
        //dp[i][j]：表示s1到i，s2到j是否能组成从i+j的s3
        boolean[][] dp = new boolean[m+1][n+1];
        //空串
        dp[0][0] = true;
        //遍历
        for (int i = 0; i <= m ; i++) {
            for (int j = 0; j <= n ; j++) {
                //s3的i+j-1个元素
                int p = i +j - 1;
                if (i > 0)
                    //s3的i+j = s1的i + s2的j，s1的i-1与s3的i+j-1相等，dp[i][j] 取决于dp[i-1][j]
                    dp[i][j] = dp[i][j] || (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(p));
                if (j > 0)
                    //s3的i+j = s1的i + s2的j，s2的j-1与s3的i+j-1相等，dp[i][j] 取决于dp[i][j-1]
                    dp[i][j] = dp[i][j] || (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(p));
            }
        }
        return dp[m][n];
    }
}
