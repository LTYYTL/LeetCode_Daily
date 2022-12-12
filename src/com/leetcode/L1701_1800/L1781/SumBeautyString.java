package com.leetcode.L1701_1800.L1781;

/**
 * 1781. 所有子字符串美丽值之和
 * 一个字符串的 美丽值 定义为：出现频率最高字符与出现频率最低字符的出现次数之差。
 * 比方说，"abaacc" 的美丽值为 3 - 1 = 2 。
 * 给你一个字符串 s ，请你返回它所有子字符串的 美丽值 之和。
 * <p>
 * 示例 1：
 * 输入：s = "aabcb"
 * 输出：5
 * 解释：美丽值不为零的字符串包括 ["aab","aabc","aabcb","abcb","bcb"] ，每一个字符串的美丽值都为 1 。
 * <p>
 * 示例 2：
 * 输入：s = "aabcbaa"
 * 输出：17
 * <p>
 * 提示：
 * 1 <= s.length <= 500
 * s 只包含小写英文字母。
 */
public class SumBeautyString {
    /**
     * 方法：模拟
     */
    public int beautySum(String s) {
        // 结果
        int res = 0;
        // 遍历
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // 获取子字符串
                String sub = s.substring(i, j);
                // 计算和
                res += sum(sub);
            }
        }
        return res;
    }


    /**
     * 计算和
     */
    private int sum(String s) {
        // 记录字符出现频率
        int[] c = new int[26];
        // 遍历
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        // 记录最哈和最小频率
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 计算和
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, c[i]);
            if (c[i] > 0) {
                min = Math.min(min, c[i]);
            }

        }

        return max - min;
    }
}
