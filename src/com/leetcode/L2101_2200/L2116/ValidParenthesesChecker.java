package com.leetcode.L2101_2200.L2116;

import java.util.Stack;

/**
 * 2116. 判断一个括号字符串是否有效
 * 一个括号字符串是只由 '(' 和 ')' 组成的 非空 字符串。如果一个字符串满足下面 任意 一个条件，那么它就是有效的：
 * a.字符串为 ().
 * b.它可以表示为 AB（A 与 B 连接），其中A 和 B 都是有效括号字符串。
 * c.它可以表示为 (A) ，其中 A 是一个有效括号字符串。
 *
 * 给你一个括号字符串 s 和一个字符串 locked ，两者长度都为 n 。
 * locked 是一个二进制字符串，只包含 '0' 和 '1' 。对于 locked 中 每一个 下标 i ：
 * a.如果 locked[i] 是 '1' ，你 不能 改变 s[i] 。
 * b.如果 locked[i] 是 '0' ，你 可以 将 s[i] 变为 '(' 或者 ')' 。
 *
 * 如果你可以将 s 变为有效括号字符串，请你返回 true ，否则返回 false 。
 *
 * 示例 1：
 * 输入：s = "))()))", locked = "010100"
 * 输出：true
 * 解释：locked[1] == '1' 和 locked[3] == '1' ，所以我们无法改变 s[1] 或者 s[3] 。
 * 我们可以将 s[0] 和 s[4] 变为 '(' ，不改变 s[2] 和 s[5] ，使 s 变为有效字符串。
 *
 * 示例 2：
 * 输入：s = "()()", locked = "0000"
 * 输出：true
 * 解释：我们不需要做任何改变，因为 s 已经是有效字符串了。
 *
 * 示例 3：
 * 输入：s = ")", locked = "0"
 * 输出：false
 * 解释：locked 允许改变 s[0] 。
 * 但无论将 s[0] 变为 '(' 或者 ')' 都无法使 s 变为有效字符串。
 *
 * 示例 4：
 * 输入：s = "(((())(((())", locked = "111111010111"
 * 输出：true
 * 解释：locked 允许我们改变 s[6] 和 s[8]。
 * 我们将 s[6] 和 s[8] 改为 ')' 使 s 变为有效字符串。
 *
 * 提示：
 * n == s.length == locked.length
 * 1 <= n <= 105
 * s[i] 要么是 '(' 要么是 ')' 。
 * locked[i] 要么是 '0' 要么是 '1' 。
 */
public class ValidParenthesesChecker {
    /**
     * 1.括号匹配，则字符串长度一定为偶数；如果为奇数，一定不为有效；
     * 2.定义括号匹配的最大分数和最小分数；
     * 3.如果当前字符不可修改，根据当前字符更新最大最小分数；一旦最大分数都小于 0，说明前面的字符串无论怎么修改都会出现多余的右括号，则无法有效；
     * 4.如果当前字符可修改，最大分数往大了，最小分数往小了减；
     * 5.如果最小分数出现负数，则把负数去掉，最小分数应该为 1；
     *
     * 作者：画图小匠
     * 链接：https://leetcode.cn/problems/check-if-a-parentheses-string-can-be-valid/solutions/3624289/javapython3ctan-xin-shu-xue-xiu-gai-gua-30fg5/
     */
    public boolean canBeValid(String s, String locked) {
        // 获取字符串 s 的长度
        int length = s.length();
        // 若字符串长度为奇数，不可能构成有效的括号字符串，直接返回 false
        if (length % 2 != 0){
            return false;
        }
        // 记录当前最大可能的左括号数量
        int max = 0;
        int min = 0;

        for (int i = 0; i < length; i++) {
            // 若当前字符为 '('，sc 记为 1；若为 ')'，sc 记为 -1
            int sc = s.charAt(i) == '(' ? 1 : -1;
            // 获取 locked 字符串中对应位置的字符，判断该位置括号是否锁定
            char change = locked.charAt(i);
            // 若该位置括号被锁定
            if (change == '1'){
                // 根据当前字符更新最最小值和最大值
                max += sc;
                min += sc;
                //  最大值为负数，说明前面再怎么修改都会出现右括号多于左括号的情况
                if (max < 0){
                    return false;
                }
            } else {
                max++;
                min--;
            }
            if (min < 0){
                min = 1;
            }
        }
        return min == 0;
    }
}
