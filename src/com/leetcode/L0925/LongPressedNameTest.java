package com.leetcode.L0925;

public class LongPressedNameTest {
    public static void main(String[] args) {
        LongPressedName longPressedName = new LongPressedName();
        /**
         * 示例 1：
         * 输入：name = "alex", typed = "aaleex"
         * 输出：true
         * 解释：'alex' 中的 'a' 和 'e' 被长按。
         */
        System.out.println(longPressedName.isLongPressedName("alex","aaleex"));
        /**
         * 示例 2：
         * 输入：name = "saeed", typed = "ssaaedd"
         * 输出：false
         * 解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
         */
        System.out.println(longPressedName.isLongPressedName("saeed","ssaaedd"));
        /**
         * 示例 3：
         * 输入：name = "leelee", typed = "lleeelee"
         * 输出：true
         */
        System.out.println(longPressedName.isLongPressedName("leelee","lleeelee"));
        /**
         * 示例 4：
         * 输入：name = "laiden", typed = "laiden"
         * 输出：true
         * 解释：长按名字中的字符并不是必要的。
         */
        System.out.println(longPressedName.isLongPressedName("laiden","laiden"));
    }
}
