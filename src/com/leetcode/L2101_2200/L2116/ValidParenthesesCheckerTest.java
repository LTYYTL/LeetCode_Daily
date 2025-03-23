package com.leetcode.L2101_2200.L2116;

public class ValidParenthesesCheckerTest {
    public static void main(String[] args) {
        ValidParenthesesChecker validParenthesesChecker = new ValidParenthesesChecker();
        /*
         * 示例 1：
         * 输入：s = "))()))", locked = "010100"
         * 输出：true
         * 解释：locked[1] == '1' 和 locked[3] == '1' ，所以我们无法改变 s[1] 或者 s[3] 。
         * 我们可以将 s[0] 和 s[4] 变为 '(' ，不改变 s[2] 和 s[5] ，使 s 变为有效字符串。
         */
        System.out.println(validParenthesesChecker.canBeValid("))()))", "010100"));
        /*
         * 示例 2：
         * 输入：s = "()()", locked = "0000"
         * 输出：true
         * 解释：我们不需要做任何改变，因为 s 已经是有效字符串了。
         */
        System.out.println(validParenthesesChecker.canBeValid("()()", "0000"));
        /*
         * 示例 3：
         * 输入：s = ")", locked = "0"
         * 输出：false
         * 解释：locked 允许改变 s[0] 。
         * 但无论将 s[0] 变为 '(' 或者 ')' 都无法使 s 变为有效字符串。
         */
        System.out.println(validParenthesesChecker.canBeValid(")", "0"));
        /*
         * 示例 4：
         * 输入：s = "(((())(((())", locked = "111111010111"
         * 输出：true
         * 解释：locked 允许我们改变 s[6] 和 s[8]。
         * 我们将 s[6] 和 s[8] 改为 ')' 使 s 变为有效字符串。
         */
        System.out.println(validParenthesesChecker.canBeValid("(((())(((())", "111111010111"));
    }
}
