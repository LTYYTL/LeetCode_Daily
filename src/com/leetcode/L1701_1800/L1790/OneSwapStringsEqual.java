package com.leetcode.L1701_1800.L1790;

/**
 * 1790. 仅执行一次字符串交换能否使两个字符串相等
 * 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 * <p>
 * 示例 1：
 * 输入：s1 = "bank", s2 = "kanb"
 * 输出：true
 * 解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
 * <p>
 * 示例 2：
 * 输入：s1 = "attack", s2 = "defend"
 * 输出：false
 * 解释：一次字符串交换无法使两个字符串相等
 * <p>
 * 示例 3：
 * 输入：s1 = "kelb", s2 = "kelb"
 * 输出：true
 * 解释：两个字符串已经相等，所以不需要进行字符串交换
 * <p>
 * 示例 4：
 * 输入：s1 = "abcd", s2 = "dcba"
 * 输出：false
 * <p>
 * 提示：
 * 1 <= s1.length, s2.length <= 100
 * s1.length == s2.length
 * s1 和 s2 仅由小写英文字母组成
 */
public class OneSwapStringsEqual {
    /**
     * 方法：双指针
     */
    public boolean areAlmostEqual(String s1, String s2) {
        // 不同的位数
        int diff = 0;
        // 记录不同的字符
        char[] ch1 = new char[2];
        char[] ch2 = new char[2];

        // 索引
        int index = 0;
        // 遍历
        for (int i = 0; i < s1.length(); i++) {
            // 字符
            char c = s1.charAt(i);
            char d = s2.charAt(i);
            // 不同的字符
            if (c != d) {
                // 记录位数
                diff++;
                // 超过2位，不符合条件
                if (diff > 2)
                    return false;
                // 记录字符
                ch1[index] = c;
                ch2[index] = d;
                // 索引后移
                index++;
            }
        }

        // 没有不同或者两位不同，字符交换相等
        return diff == 0 || (diff == 2 && ch1[0] == ch2[1] && ch1[1] == ch2[0]);
    }
}
