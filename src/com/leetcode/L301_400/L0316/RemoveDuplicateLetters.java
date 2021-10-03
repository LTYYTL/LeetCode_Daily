package com.leetcode.L301_400.L0316;

import java.util.Stack;

/**
 * 316. 去除重复字母
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 * 注意：该题与 1081 https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters 相同
 *
 * 示例 1：
 * 输入：s = "bcabc"
 * 输出："abc"
 *
 * 示例 2：
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 提示：
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
public class RemoveDuplicateLetters {
    /**
     * 方法：栈
     * 解题思想：
     * 1、建立一个字典。其中 key 为 字符 c，value 为其出现的剩余次数。
     * 2、从左往右遍历字符串，每次遍历到一个字符，其剩余出现次数 - 1.
     * 3、对于每一个字符，如果其对应的剩余出现次数大于 1，我们可以选择丢弃（也可以选择不丢弃），否则不可以丢弃。
     * 保留：当前元素左边没有元素或者比左边元素大
     * 丢弃：当前元素比左边元素小
     *
     * @param s
     * @return
     */
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (stack.contains(ch)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > ch && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(ch);
        }
        char[] res = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        return new String(res);
    }
}
