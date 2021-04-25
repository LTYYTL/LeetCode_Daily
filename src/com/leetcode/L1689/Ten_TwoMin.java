package com.leetcode.L1689;

/**
 * 5626. 十-二进制数的最少数目
 * 如果一个十进制数字不含任何前导零，且每一位上的数字不是 0 就是 1 ，那么该数字就是一个 十-二进制数 。
 * 例如，101 和 1100 都是 十-二进制数，而 112 和 3001 不是。
 * 给你一个表示十进制整数的字符串 n ，返回和为 n 的 十-二进制数 的最少数目。
 *
 * 示例 1：
 * 输入：n = "32"
 * 输出：3
 * 解释：10 + 11 + 11 = 32
 *
 * 示例 2：
 * 输入：n = "82734"
 * 输出：8
 *
 * 示例 3：
 * 输入：n = "27346209830709182346"
 * 输出：9
 *
 * 提示：
 * 1 <= n.length <= 105
 * n 仅由数字组成
 * n 不含任何前导零并总是表示正整数
 */
public class Ten_TwoMin {
    /**
     * 方法：贪心算法
     * @param n
     * @return
     */
    public int minPartitions(String n) {
        //将字符串转换成char数组
        char[] chars = n.toCharArray();
        //存储最大值
        int max = chars[0] - 48;
        for (int i = 1; i < chars.length; ++i){
            //当前数字
            int temp = chars[i] - 48;
            //最大值
            max = Math.max(max,temp);
        }
        return max;
    }
}
