package com.leetcode.L0856;

import java.util.Stack;

/**
 * 856. 括号的分数
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * （1）() 得 1 分。
 * （2）AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * （3）(A) 得 2 * A 分，其中 A 是平衡括号字符串。
 *
 * 示例 1：
 * 输入： "()"
 * 输出： 1
 *
 * 示例 2：
 * 输入： "(())"
 * 输出： 2
 *
 * 示例 3：
 * 输入： "()()"
 * 输出： 2
 *
 * 示例 4：
 * 输入： "(()(()))"
 * 输出： 6
 *
 * 提示：
 * S 是平衡括号字符串，且只含有 ( 和 ) 。
 * 2 <= S.length <= 50
 */
public class ScoreParentheses {
    /**
     * 方法：栈
     * @param s
     * @return
     */
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c =='('){
                stack.push(0);
            }else {
                int cur = stack.pop();
                int pre = stack.pop();
                stack.push(pre + Math.max(2*cur,1));
            }
        }
        return stack.pop();
    }
}
