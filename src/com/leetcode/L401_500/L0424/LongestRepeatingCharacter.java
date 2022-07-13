package com.leetcode.L401_500.L0424;

/**
 * 424. 替换后的最长重复字符
 * 给你一个字符串 s 和一个整数 k 。你可以选择字符串中的任一字符，并将其更改为任何其他大写英文字符。该操作最多可执行 k 次。
 * 在执行上述操作后，返回包含相同字母的最长子字符串的长度。
 * <p>
 * 示例 1：
 * 输入：s = "ABAB", k = 2
 * 输出：4
 * 解释：用两个'A'替换为两个'B',反之亦然。
 * <p>
 * 示例 2：
 * 输入：s = "AABABBA", k = 1
 * 输出：4
 * 解释：
 * 将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
 * 子串 "BBBB" 有最长重复字母, 答案为 4。
 * <p>
 * 提示：
 * 1 <= s.length <= 105
 * s 仅由大写英文字母组成
 * 0 <= k <= s.length
 */
public class LongestRepeatingCharacter {
    /**
     * 方法：滑动窗口
     *
     * @param s
     * @param k
     * @return
     */
    public int characterReplacement(String s, int k) {
        //长度
        int n = s.length();
        //双指针
        int left = 0;
        int right = 0;
        //记录字母个数
        int[] map = new int[26];
        //历史最大值
        int max = 0;

        while (right < n) {
            //获取字母
            int index = s.charAt(right) - 'A';
            //计数
            map[index]++;

            //记录最大值
            max = Math.max(map[index], max);
            //长度超出给定数值
            if (right - left + 1 > max + k) {
                //缩小窗口
                map[s.charAt(left++) - 'A']--;
            }
            right++;
        }

        return n - left;
    }
}
