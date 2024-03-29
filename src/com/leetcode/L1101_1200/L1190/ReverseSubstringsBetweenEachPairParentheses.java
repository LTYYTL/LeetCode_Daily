package com.leetcode.L1101_1200.L1190;

import java.util.Stack;

/**
 * 1190. 反转每对括号间的子串
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * 注意，您的结果中 不应 包含任何括号。
 *
 * 示例 1：
 * 输入：s = "(abcd)"
 * 输出："dcba"
 *
 * 示例 2：
 * 输入：s = "(u(love)i)"
 * 输出："iloveu"
 *
 * 示例 3：
 * 输入：s = "(ed(et(oc))el)"
 * 输出："leetcode"
 *
 * 示例 4：
 * 输入：s = "a(bcdefghijkl(mno)p)q"
 * 输出："apmnolkjihgfedcbq"
 *
 * 提示：
 * 0 <= s.length <= 2000
 * s 中只有小写英文字母和括号
 * 我们确保所有括号都是成对出现的
 */
public class ReverseSubstringsBetweenEachPairParentheses {
    /**
     * 方法：栈
     * @param s
     * @return
     */
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                stack.push(res.toString());
                res.setLength(0);
            }else if (c == ')'){
                res.reverse();
                res.insert(0,stack.pop());
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
