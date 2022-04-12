package com.leetcode.L801_900.L0806;

import java.util.Arrays;

public class LinesWriteStringTest {
    public static void main(String[] args) {
        LinesWriteString linesWriteString = new LinesWriteString();
        /**
         * 示例 1:
         * 输入:
         * widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
         * S = "abcdefghijklmnopqrstuvwxyz"
         * 输出: [3, 60]
         * 解释:
         * 所有的字符拥有相同的占用单位10。所以书写所有的26个字母，
         * 我们需要2个整行和占用60个单位的一行。
         */
        System.out.println(Arrays.toString(linesWriteString.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                "abcdefghijklmnopqrstuvwxyz")));
        /**
         * 示例 2:
         * 输入:
         * widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
         * S = "bbbcccdddaaa"
         * 输出: [2, 4]
         * 解释:
         * 除去字母'a'所有的字符都是相同的单位10，并且字符串 "bbbcccdddaa" 将会覆盖 9 * 10 + 2 * 4 = 98 个单位.
         * 最后一个字母 'a' 将会被写到第二行，因为第一行只剩下2个单位了。
         * 所以，这个答案是2行，第二行有4个单位宽度。
         */
        System.out.println(Arrays.toString(linesWriteString.numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                "bbbcccdddaaa")));
    }
}
