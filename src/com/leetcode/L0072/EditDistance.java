package com.leetcode.L0072;

/**
 * 72. 编辑距离
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 * 你可以对一个单词进行如下三种操作：
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *
 * 示例 1：
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 * horse -> rorse (将 'h' 替换为 'r')
 * rorse -> rose (删除 'r')
 * rose -> ros (删除 'e')
 *
 * 示例 2：
 * 输入：word1 = "intention", word2 = "execution"
 * 输出：5
 * 解释：
 * intention -> inention (删除 't')
 * inention -> enention (将 'i' 替换为 'e')
 * enention -> exention (将 'n' 替换为 'x')
 * exention -> exection (将 'n' 替换为 'c')
 * exection -> execution (插入 'u')
 *
 * 提示：
 * 0 <= word1.length, word2.length <= 500
 * word1 和 word2 由小写英文字母组成
 */
public class EditDistance {
    /**
     * 方法：动态规划
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        //base case
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        //自底向上求解
        for (int i = 1; i <= m; i++) {
            //当前word1的字符
            char c1 = word1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                //当前word2的字符
                char c2 = word2.charAt(j - 1);
                //相等时，跳过
                if (c1 == c2)
                    dp[i][j] = dp[i-1][j-1];
                else
                    //dp[i-1][j]:插入
                    //dp[i][j-1]:删除
                    //dp[i-1][j-1]：替换
                    dp[i][j] = min(
                                dp[i-1][j]+1,
                                dp[i][j-1]+1,
                                dp[i-1][j-1]+1
                    );
            }
        }
        return dp[m][n];
    }

    /**
     * 求最小值
     * @param a
     * @param b
     * @param c
     * @return
     */
    private int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}