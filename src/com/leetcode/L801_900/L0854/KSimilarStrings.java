package com.leetcode.L801_900.L0854;

/**
 * 854. 相似度为 K 的字符串
 * 对于某些非负整数 k ，如果交换 s1 中两个字母的位置恰好 k 次，能够使结果字符串等于 s2 ，则认为字符串 s1 和 s2 的 相似度为 k 。
 * 给你两个字母异位词 s1 和 s2 ，返回 s1 和 s2 的相似度 k 的最小值。
 * <p>
 * 示例 1：
 * 输入：s1 = "ab", s2 = "ba"
 * 输出：1
 * <p>
 * 示例 2：
 * 输入：s1 = "abc", s2 = "bca"
 * 输出：2
 * <p>
 * 提示：
 * 1 <= s1.length <= 20
 * s2.length == s1.length
 * s1 和 s2  只包含集合 {'a', 'b', 'c', 'd', 'e', 'f'} 中的小写字母
 * s2 是 s1 的一个字母异位词
 */
public class KSimilarStrings {
    int result = Integer.MAX_VALUE;

    /**
     * 方法：回溯算法
     */
    public int kSimilarity(String s1, String s2) {
        return back(s1.toCharArray(), s2.toCharArray(), 0, 0);
    }

    private int back(char[] s1, char[] s2, int start, int cur) {
        // 当前交换次数比记录的最小值还大
        if (cur >= result) {
            return result;
        }
        // 遍历结束
        if (start == s1.length) {
            return result = Math.min(result, cur);
        }

        // 遍历
        for (int i = start; i < s1.length; i++) {
            // 两个字符不等
            if (s1[i] != s2[i]) {
                // 在后面寻找
                for (int j = i + 1; j < s2.length; j++) {
                    if (s1[i] == s2[j]) {
                        // 交换
                        swap(s2, i, j);
                        // 进入回溯算法
                        back(s1, s2, i + 1, cur + 1);
                        // 回溯
                        swap(s2, i, j);
                    }
                }
                return result;
            }
        }
        return result = Math.min(result, cur);
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
