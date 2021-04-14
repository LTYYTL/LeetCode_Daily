package com.interview.L0101;

public class IsUniqueLCCITest {
    public static void main(String[] args) {
        IsUniqueLCCI isUniqueLCCI = new IsUniqueLCCI();
        /**
         * 示例 1：
         * 输入: s = "leetcode"
         * 输出: false
         */
        System.out.println(isUniqueLCCI.isUnique("leetcode"));
        System.out.println(isUniqueLCCI.isUnique_str("leetcode"));
        /**
         * 示例 2：
         * 输入: s = "abc"
         * 输出: true
         */
        System.out.println(isUniqueLCCI.isUnique("abc"));
        System.out.println(isUniqueLCCI.isUnique_str("abc"));
    }
}
