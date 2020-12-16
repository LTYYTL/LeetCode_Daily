package com.leetcode.L0738;

/**
 * 738. 单调递增的数字
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 *
 * 示例 1:
 * 输入: N = 10
 * 输出: 9
 *
 * 示例 2:
 * 输入: N = 1234
 * 输出: 1234
 *
 * 示例 3:
 * 输入: N = 332
 * 输出: 299
 * 说明: N 是在 [0, 10^9] 范围内的一个整数。
 */
public class MonotoneIncreasingDigits {
    /**
     * 方法：贪心算法
     * @param N
     * @return
     */
    public int monotoneIncreasingDigits(int N) {
        //转换成char数组
        char[] chars = Integer.toString(N).toCharArray();
        int max = -1, idx = -1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (max < chars[i]) {
                max = chars[i];
                idx = i;
            }
            if (chars[i] > chars[i + 1]) {
                chars[idx] -= 1;
                for(int j = idx + 1;j < chars.length;j++) {
                    chars[j] = '9';
                }
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
