package com.leetcode.L1999;

public class ReversePrefixWordTest {
    public static void main(String[] args) {
        ReversePrefixWord reversePrefixWord = new ReversePrefixWord();
        /**
         * 示例 1：
         * 输入：word = "abcdefd", ch = "d"
         * 输出："dcbaefd"
         * 解释："d" 第一次出现在下标 3 。
         * 反转从下标 0 到下标 3（含下标 3）的这段字符，结果字符串是 "dcbaefd" 。
         */
        System.out.println(reversePrefixWord.reversePrefix("abcdefd", 'd'));
        /**
         * 示例 2：
         * 输入：word = "xyxzxe", ch = "z"
         * 输出："zxyxxe"
         * 解释："z" 第一次也是唯一一次出现是在下标 3 。
         * 反转从下标 0 到下标 3（含下标 3）的这段字符，结果字符串是 "zxyxxe" 。
         */
        System.out.println(reversePrefixWord.reversePrefix("xyxzxe", 'z'));
        /**
         * 示例 3：
         * 输入：word = "abcd", ch = "z"
         * 输出："abcd"
         * 解释："z" 不存在于 word 中。
         * 无需执行反转操作，结果字符串是 "abcd" 。
         */
        System.out.println(reversePrefixWord.reversePrefix("abcd", 'z'));
    }
}
