package com.leetcode.L501_600.L0522;

public class LongUncommonSubIITest {
    public static void main(String[] args) {
        LongUncommonSubII longUncommonSubII = new LongUncommonSubII();
        /**
         * 示例 1：
         * 输入: strs = ["aba","cdc","eae"]
         * 输出: 3
         */
        System.out.println(longUncommonSubII.findLUSlength(new String[]{"aba", "cdc", "eae"}));
        /**
         * 示例 2:
         * 输入: strs = ["aaa","aaa","aa"]
         * 输出: -1
         */
        System.out.println(longUncommonSubII.findLUSlength(new String[]{"aaa", "aaa", "aa"}));
    }
}
