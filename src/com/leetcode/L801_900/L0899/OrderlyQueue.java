package com.leetcode.L801_900.L0899;

import java.util.Arrays;

/**
 * 899. 有序队列
 * 给定一个字符串 s 和一个整数 k 。你可以从 s 的前 k 个字母中选择一个，并把它加到字符串的末尾。
 * 返回 在应用上述步骤的任意数量的移动后，字典上最小的字符串 。
 * <p>
 * 示例 1：
 * 输入：s = "cba", k = 1
 * 输出："acb"
 * 解释：
 * 在第一步中，我们将第一个字符（“c”）移动到最后，获得字符串 “bac”。
 * 在第二步中，我们将第一个字符（“b”）移动到最后，获得最终结果 “acb”。
 * <p>
 * 示例 2：
 * 输入：s = "baaca", k = 3
 * 输出："aaabc"
 * 解释：
 * 在第一步中，我们将第一个字符（“b”）移动到最后，获得字符串 “aacab”。
 * 在第二步中，我们将第三个字符（“c”）移动到最后，获得最终结果 “aaabc”。
 * <p>
 * 提示：
 * 1 <= k <= S.length <= 1000
 * s 只由小写字母组成。
 */
public class OrderlyQueue {
    /**
     * 方法：模拟
     *
     * @param s
     * @param k
     * @return
     */
    public String orderlyQueue(String s, int k) {
        // k为1，表示为一个环，移动每一个字符，寻找最小字符串
        if (k == 1) {
            StringBuilder str = new StringBuilder(s);
            for (int i = 1; i < s.length(); i++) {
                str.append(s.charAt(0)).deleteCharAt(0);
                if (str.toString().compareTo(s) < 0)
                    s = str.toString();
            }
            return s;
        } else {
            //超过1个字符，相当全排序
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
