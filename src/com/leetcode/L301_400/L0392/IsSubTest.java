package com.leetcode.L301_400.L0392;

public class IsSubTest {
    public static void main(String[] args) {
        IsSub isSub = new IsSub();
        /**
         * 示例 1：
         * 输入：s = "abc", t = "ahbgdc"
         * 输出：true
         */
        System.out.println(isSub.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSub.isSubsequence_binary("abc", "ahbgdc"));
        /**
         * 示例 2：
         * 输入：s = "axc", t = "ahbgdc"
         * 输出：false
         */
        System.out.println(isSub.isSubsequence("axc", "ahbgdc"));
        System.out.println(isSub.isSubsequence_binary("axc", "ahbgdc"));
    }
}
