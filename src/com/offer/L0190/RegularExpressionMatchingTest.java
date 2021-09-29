package com.offer.L0190;

public class RegularExpressionMatchingTest {
    public static void main(String[] args) {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        /**
         * 示例 1:
         * 输入:
         * s = "aa"
         * p = "a"
         * 输出: false
         * 解释: "a" 无法匹配 "aa" 整个字符串。
         */
        System.out.println(regularExpressionMatching.isMatch("aa", "a"));
        /**
         * 示例 2:
         * 输入:
         * s = "aa"
         * p = "a*"
         * 输出: true
         * 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
         */
        System.out.println(regularExpressionMatching.isMatch("aa", "a*"));
        /**
         * 示例 3:
         * 输入:
         * s = "ab"
         * p = ".*"
         * 输出: true
         * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
         */
        System.out.println(regularExpressionMatching.isMatch("ab", ".*"));
        /**
         * 示例 4:
         * 输入:
         * s = "aab"
         * p = "c*a*b"
         * 输出: true
         * 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
         */
        System.out.println(regularExpressionMatching.isMatch("aab", "c*a*b"));
        /**
         * 示例 5:
         * 输入:
         * s = "mississippi"
         * p = "mis*is*p*."
         * 输出: false
         * s 可能为空，且只包含从 a-z 的小写字母。
         * p 可能为空，且只包含从 a-z 的小写字母以及字符 . 和 *，无连续的 '*'。
         */
        System.out.println(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
    }
}
