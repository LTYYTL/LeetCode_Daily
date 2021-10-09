package com.leetcode.L401_500.L0434;

/**
 * 434. 字符串中的单词数
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 */
public class NumberSegmentsString {
    /**
     * 方法：模拟
     * @param s
     * @return
     */
    public int countSegments(String s) {
        int res = 0;
        for (String s1 : s.split(" ")) {
            if (!"".equals(s1))
                res++;
        }
        return res;
    }
}
