package com.leetcode.L1701_1800.L1784;

/**
 * 1784. 检查二进制字符串字段
 * 给你一个二进制字符串 s ，该字符串 不含前导零 。
 * 如果 s 包含 零个或一个由连续的 '1' 组成的字段 ，返回 true 。否则，返回 false 。
 * 如果 s 中 由连续若干个 '1' 组成的字段 数量不超过 1，返回 true 。否则，返回 false 。
 * <p>
 * 示例 1：
 * 输入：s = "1001"
 * 输出：false
 * 解释：由连续若干个 '1' 组成的字段数量为 2，返回 false
 * <p>
 * 示例 2：
 * 输入：s = "110"
 * 输出：true
 * <p>
 * 提示：
 * 1 <= s.length <= 100
 * s[i] 为 '0' 或 '1'
 * s[0] 为 '1'
 */
public class CheckStringSegment {
    /**
     * 方法：模拟
     */
    public boolean checkOnesSegment(String s) {
        // 将0都替换成空格
        String replace = s.replaceAll("0", " ");
        // 按照空格分割
        String[] arr = replace.trim().split("\\s+");
        return arr.length <= 1;
    }
}
