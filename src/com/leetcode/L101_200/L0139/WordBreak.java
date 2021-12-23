package com.leetcode.L101_200.L0139;

import java.util.List;

/**
 * 139. 单词拆分
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典，判定 s 是否可以由空格拆分为一个或多个在字典中出现的单词。
 * 说明：拆分时可以重复使用字典中的单词。
 *
 * 示例 1：
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 *
 * 示例 2：
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 *
 * 示例 3：
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 *
 * 提示：
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s 和 wordDict[i] 仅有小写英文字母组成
 * wordDict 中的所有字符串 互不相同
 */
public class WordBreak {
    /**
     * 方法：动态规划
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        //dp[i]:以长度为i结尾的字符串是否在字典中
        boolean[] dp = new boolean[s.length() + 1];
        //初值
        dp[0] = true;
        //遍历
        for (int i = 1; i <= s.length(); i++) {
            //从头开始
            for (int j = 0; j < i; j++) {
                //判断j~i组成的字符串是否在字典中，并且只有当0~j组成的字符串也在字典中时，才能认为0~i在字典中
                if (wordDict.contains(s.substring(j,i)) && dp[j])
                    dp[i] = true;
            }
        }
        return dp[s.length()];
    }
}
