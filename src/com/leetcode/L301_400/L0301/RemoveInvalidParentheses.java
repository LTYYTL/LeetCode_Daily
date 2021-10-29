package com.leetcode.L301_400.L0301;

import java.util.*;

/**
 * 301. 删除无效的括号
 * 给你一个由若干括号和字母组成的字符串 s ，删除最小数量的无效括号，使得输入的字符串有效。
 * 返回所有可能的结果。答案可以按 任意顺序 返回。
 *
 * 示例 1：
 * 输入：s = "()())()"
 * 输出：["(())()","()()()"]
 *
 * 示例 2：
 * 输入：s = "(a)())()"
 * 输出：["(a())()","(a)()()"]
 *
 * 示例 3：
 * 输入：s = ")("
 * 输出：[""]
 *
 * 提示：
 * 1 <= s.length <= 25
 * s 由小写英文字母以及括号 '(' 和 ')' 组成
 * s 中至多含 20 个括号
 */
public class RemoveInvalidParentheses {
    /**
     * 方法一：回溯算法
     * @param s
     * @return
     */
    public List<String> removeInvalidParentheses(String s) {
        //多余的括号
        int left = 0;
        int right = 0;
        //记录多余的括号
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                left++;
            }else if (c == ')'){
                if (left == 0)
                    right++;
                else
                    left--;
            }
        }
        //没有多余直接返回
        if (left == 0 && right == 0)
            return Arrays.asList(s);

        //去重
        Set<String> res = new HashSet<>();
        //深度优先搜索
        dfs(res,s,0,new StringBuilder(),left,right);

        return new ArrayList<>(res);
    }

    /**
     * 方法：深度优先搜索
     * @param res
     * @param s
     * @param i
     * @param sb
     * @param left
     * @param right
     */
    private void dfs(Set<String> res, String s, int i, StringBuilder sb, int left, int right) {
        //字符串尾部
        if (i == s.length()) {
            //没有多余括号且合法
            if (left == 0 && right == 0 && isValid(sb))
                res.add(sb.toString());
            return;
        }

        //当前字符
        char c = s.charAt(i);
        if (c == '('){
            //加入左括号
            sb.append('(');
            //深度优先搜索
            dfs(res, s, i+1, sb, left, right);
            //移除
            sb.deleteCharAt(sb.length() - 1);

            //有多余的左括号，不要这个括号
            if (left > 0)
                dfs(res, s, i+1, sb, left-1, right);
        }else if (c == ')'){
            //加入右括号
            sb.append(')');
            //深度优先搜索
            dfs(res, s, i+1, sb, left, right);
            //移除
            sb.deleteCharAt(sb.length() - 1);

            //有多余的右括号，不要这个括号
            if (right > 0)
                dfs(res, s, i+1, sb, left, right-1);
        }else {
            sb.append(c);
            dfs(res, s, i+1, sb, left, right);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    /**
     * 判断字符串是否合法
     * @param sb
     * @return
     */
    private boolean isValid(StringBuilder sb) {
        int left = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(')
                left++;
            else if (c == ')'){
                if (left == 0)
                    return false;
                else
                    left--;
            }
        }
        return  left == 0;
    }
}
