package com.leetcode.L801_900.L0859;

public class BuddyStringsTest {
    public static void main(String[] args) {
        BuddyStrings buddyStrings = new BuddyStrings();
        /**示例 1：
         * 输入：s = "ab", goal = "ba"
         * 输出：true
         * 解释：你可以交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 相等。
         */
        System.out.println(buddyStrings.buddyStrings("ab", "ba"));
        /**
         * 示例 2：
         * 输入：s = "ab", goal = "ab"
         * 输出：false
         * 解释：你只能交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 不相等。
         */
        System.out.println(buddyStrings.buddyStrings("ab", "ab"));
        /**
         * 示例 3：
         * 输入：s = "aa", goal = "aa"
         * 输出：true
         * 解释：你可以交换 s[0] = 'a' 和 s[1] = 'a' 生成 "aa"，此时 s 和 goal 相等。
         */
        System.out.println(buddyStrings.buddyStrings("aa", "aa"));
        /**
         * 示例 4：
         * 输入：s = "aaaaaaabc", goal = "aaaaaaacb"
         * 输出：true
         */
        System.out.println(buddyStrings.buddyStrings("aaaaaaabc", "aaaaaaabc"));
    }
}
