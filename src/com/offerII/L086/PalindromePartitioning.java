package com.offerII.L086;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer II 086. 分割回文子字符串
 * 给定一个字符串 s ，请将 s 分割成一些子串，使每个子串都是 回文串 ，返回 s 所有可能的分割方案。
 * 回文串 是正着读和反着读都一样的字符串。
 *
 * 示例 1：
 * 输入：s = "google"
 * 输出：[["g","o","o","g","l","e"],["g","oo","g","l","e"],["goog","l","e"]]
 *
 * 示例 2：
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 *
 * 示例 3：
 * 输入：s = "a"
 * 输出：[["a"]
 *
 * 提示：
 * 1 <= s.length <= 16
 * s 仅由小写英文字母组成
 *
 * 注意：本题与主站 131 题相同： https://leetcode-cn.com/problems/palindrome-partitioning/
 */
public class PalindromePartitioning {
    /**
     * 方法：回溯算法
     * @param s
     * @return
     */
    public String[][] partition(String s) {
        //结果集
        List<List<String>> res = new ArrayList<>();
        //特殊情况
        if (s == null || s.length() == 0)
            return null;

        Stack<String> path = new Stack<>();
        //深度优先搜索
        dfs(s,0,path,res);

        int rn = res.size();
        String [][] ans = new String [rn][];
        for (int i = 0; i < rn; i ++) {
            ans[i] = res.get(i).toArray(new String [res.get(i).size()]);
        }

       return ans;
    }

    private void dfs(String s, int begin, Stack<String> path, List<List<String>> res) {
        //起始位置大于s的大小，说明找到一个分割方案
        if (begin >= s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        //遍历
        for (int i = begin; i < s.length(); i++) {
            //不是回文串
            if (!isValid(s,begin,i))
                continue;
            //是回文串存入
            path.push(s.substring(begin,i+1));
            //进入下一层
            dfs(s, i+1, path, res);
            //回退
            path.pop();
        }
    }

    /**
     * 判断是否是回文串
     * @param s
     * @return
     */
    private boolean isValid(String s, int left, int right){
        while (left < right){
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}
