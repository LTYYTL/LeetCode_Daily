package com.leetcode.L701_800.L0709;

/**
 * 709. 转换成小写字母
 * 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
 *
 * 示例 1：
 * 输入：s = "Hello"
 * 输出："hello"
 *
 * 示例 2：
 * 输入：s = "here"
 * 输出："here"
 *
 * 示例 3：
 * 输入：s = "LOVELY"
 * 输出："lovely"
 *
 * 提示：
 * 1 <= s.length <= 100
 * s 由 ASCII 字符集中的可打印字符组成
 */
public class ToLowerCase {
    /**
     * 方法：模拟
     * @param s
     * @return
     */
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase_moni(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch |= 32;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

}
