package com.leetcode.L0389;

import java.util.HashMap;
import java.util.Map;

/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例 1：
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 *
 * 示例 2：
 * 输入：s = "", t = "y"
 * 输出："y"
 *
 * 示例 3：
 * 输入：s = "a", t = "aa"
 * 输出："a"
 *
 * 示例 4：
 * 输入：s = "ae", t = "aea"
 * 输出："a"
 *
 * 提示：
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s 和 t 只包含小写字母
 */
public class FindTheDifference {
    /**
     * 方法一：哈希表
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int[] counter = new int[26];
        for (char c: s.toCharArray()) {
            counter[c - 'a']++;
        }
        for (char c: t.toCharArray()) {
            if (--counter[c - 'a'] < 0) {
                return c;
            }
        }
        return 0;
    }

    /**
     * 方法二：求和
     * 思路：用两个字符串的ACSII码的差值算出字母
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference_sum(String s, String t) {
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }

    /**
     * 方法三：异或
     * 思路：因为 t 只比 s 多了一个字母，相当于 只有 1 个字母出现了奇数次，其它字母全部出现了偶数次。
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference_XOR(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); ++i) {
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            ret ^= t.charAt(i);
        }
        return (char) ret;
    }
}
