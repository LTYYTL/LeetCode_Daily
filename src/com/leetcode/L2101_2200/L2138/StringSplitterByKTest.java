package com.leetcode.L2101_2200.L2138;

import java.util.Arrays;

public class StringSplitterByKTest {

    public static void main(String[] args) {
        StringSplitterByK stringSplitterByK = new StringSplitterByK();
        /*
         * 示例 1：
         * 输入：s = "abcdefghi", k = 3, fill = "x"
         * 输出：["abc","def","ghi"]
         * 解释：
         * 前 3 个字符是 "abc" ，形成第一组。
         * 接下来 3 个字符是 "def" ，形成第二组。
         * 最后 3 个字符是 "ghi" ，形成第三组。
         * 由于所有组都可以由字符串中的字符完全填充，所以不需要使用填充字符。
         * 因此，形成 3 组，分别是 "abc"、"def" 和 "ghi" 。
         */
        String[] strings = stringSplitterByK.divideString("abcdefghi", 3, 'x');
        System.out.println(Arrays.toString(strings));
        /*
         * 示例 2：
         * 输入：s = "abcdefghij", k = 3, fill = "x"
         * 输出：["abc","def","ghi","jxx"]
         * 解释：
         * 与前一个例子类似，形成前三组 "abc"、"def" 和 "ghi" 。
         * 对于最后一组，字符串中仅剩下字符 'j' 可以用。为了补全这一组，使用填充字符 'x' 两次。
         * 因此，形成 4 组，分别是 "abc"、"def"、"ghi" 和 "jxx" 。
         */

        strings = stringSplitterByK.divideString("abcdefghij", 3, 'x');
        System.out.println(Arrays.toString(strings));
    }
}
