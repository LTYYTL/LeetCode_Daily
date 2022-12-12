package com.leetcode.L1701_1800.L1758;

/**
 * 1758. 生成交替二进制字符串的最少操作数
 * 给你一个仅由字符 '0' 和 '1' 组成的字符串 s 。一步操作中，你可以将任一 '0' 变成 '1' ，或者将 '1' 变成 '0' 。
 * 交替字符串 定义为：如果字符串中不存在相邻两个字符相等的情况，那么该字符串就是交替字符串。例如，字符串 "010" 是交替字符串，而字符串 "0100" 不是。
 * 返回使 s 变成 交替字符串 所需的 最少 操作数。
 * <p>
 * 示例 1：
 * 输入：s = "0100"
 * 输出：1
 * 解释：如果将最后一个字符变为 '1' ，s 就变成 "0101" ，即符合交替字符串定义。
 * <p>
 * 示例 2：
 * 输入：s = "10"
 * 输出：0
 * 解释：s 已经是交替字符串。
 * <p>
 * 示例 3：
 * 输入：s = "1111"
 * 输出：2
 * 解释：需要 2 步操作得到 "0101" 或 "1010" 。
 * <p>
 * 提示：
 * 1 <= s.length <= 104
 * s[i] 是 '0' 或 '1'
 */
public class MinChangesString {
    /**
     * 方法：模拟
     */
    public int minOperations(String s) {
        // 结果
        int res = 0;
        // 转换成数组
        char[] chars = s.toCharArray();
        // 第一个字符
        char pre = chars[0];

        // 遍历
        for (int i = 1; i < chars.length; i++) {
            // 跟前一个一样
            if (pre == chars[i]) {
                // 记录反转次数
                res++;
                // 反转
                pre = (char) (pre ^ 1);
            } else {
                // 直接记录
                pre = chars[i];
            }
        }

        return Math.min(res, s.length() - res);
    }
}
