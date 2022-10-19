package com.leetcode.L901_1000.L0902;

/**
 * 902. 最大为 N 的数字组合
 * 给定一个按 非递减顺序 排列的数字数组 digits 。你可以用任意次数 digits[i] 来写的数字。
 * 例如，如果 digits = ['1','3','5']，我们可以写数字，如 '13', '551', 和 '1351315'。
 * <p>
 * 返回 可以生成的小于或等于给定整数 n 的正整数的个数 。
 * <p>
 * 示例 1：
 * 输入：digits = ["1","3","5","7"], n = 100
 * 输出：20
 * 解释：
 * 可写出的 20 个数字是：
 * 1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.
 * <p>
 * 示例 2：
 * 输入：digits = ["1","4","9"], n = 1000000000
 * 输出：29523
 * 解释：
 * 我们可以写 3 个一位数字，9 个两位数字，27 个三位数字，
 * 81 个四位数字，243 个五位数字，729 个六位数字，
 * 2187 个七位数字，6561 个八位数字和 19683 个九位数字。
 * 总共，可以使用D中的数字写出 29523 个整数。
 * <p>
 * 示例 3:
 * 输入：digits = ["7"], n = 8
 * 输出：1
 * <p>
 * 提示：
 * 1 <= digits.length <= 9
 * digits[i].length == 1
 * digits[i] 是从 '1' 到 '9' 的数
 * digits 中的所有值都 不同
 * digits 按 非递减顺序 排列
 * 1 <= n <= 109
 */
public class MostNSet {
    /**
     * 方法：数学
     */
    public int atMostNGivenDigitSet(String[] digits, int n) {
        // 转化成字符串
        char[] chars = String.valueOf(n).toCharArray();
        // 字符长度
        int dl = digits.length;
        // 数字长度
        int nl = chars.length;
        // 结果
        int res = 0;

        // 除去最高位的其他位组装，与n的大小比较，与最高位有关，后面的可以随机组合
        for (int i = 1; i < nl; i++) {
            res += Math.pow(dl, i);
        }

        // 处理最高的情况
        for (int i = 0; i < nl; i++) {
            // 是否需要对比下一个数
            boolean compareNext = false;
            // 遍历
            for (String digit : digits) {
                // 获取字符
                char c = digit.charAt(0);
                // 字符比n的最高位小
                if (c < chars[i]) {
                    res += Math.pow(dl, nl - i - 1);
                } else {
                    // 字符与最高位相等需要对比下一位
                    if (c == chars[i]) {
                        compareNext = true;
                        break;
                    }
                }
            }
            // 全小于的情况
            if (!compareNext) {
                return res;
            }
        }
        // 如果到最后1位依然满足compareNext，因为最后1位无法再向后对比了，所以最终结果+1
        return ++res;
    }
}
