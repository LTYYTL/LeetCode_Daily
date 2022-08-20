package com.leetcode.L401_500.L0467;

import java.util.Arrays;

/**
 * 467. 环绕字符串中唯一的子字符串
 * 把字符串 s 看作 "abcdefghijklmnopqrstuvwxyz" 的无限环绕字符串，所以 s 看起来是这样的：
 * "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd...." 。
 * 现在给定另一个字符串 p 。返回 s 中 不同 的 p 的 非空子串 的数量 。
 * <p>
 * 示例 1：
 * 输入：p = "a"
 * 输出：1
 * 解释：字符串 s 中只有 p 的一个 "a" 子字符。
 * <p>
 * 示例 2：
 * 输入：p = "cac"
 * 输出：2
 * 解释：字符串 s 中只有 p 的两个子串 ("a", "c") 。
 * <p>
 * 示例 3：
 * 输入：p = "zab"
 * 输出：6
 * 解释：在字符串 s 中有 p 的六个子串 ("z", "a", "b", "za", "ab", "zab") 。
 * <p>
 * 提示：
 * 1 <= p.length <= 105
 * p 由小写英文字母组成
 */
public class UniqueSubstringsWraparound {
    /**
     * 方法：动态规划
     *
     * @param p
     * @return
     */
    public int findSubstringInWraproundString(String p) {
        //以i结尾的最大长度
        int[] dp = new int[26];
        //长度
        int k = 0;
        //遍历
        for (int i = 0; i < p.length(); i++) {
            //字符相差1或者-25
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) + 26) % 26 == 1) {
                //增加长度
                ++k;
            } else {
                //回归初始化
                k = 1;
            }
            int index = p.charAt(i) - 'a';
            //记录最大的长度
            dp[index] = Math.max(dp[index], k);
        }
        //计算所有长度
        return Arrays.stream(dp).sum();
    }
}
