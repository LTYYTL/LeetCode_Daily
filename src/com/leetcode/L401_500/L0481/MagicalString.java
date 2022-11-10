package com.leetcode.L401_500.L0481;

/**
 * 481. 神奇字符串
 * 神奇字符串 s 仅由 '1' 和 '2' 组成，并需要遵守下面的规则：
 * 神奇字符串 s 的神奇之处在于，串联字符串中 '1' 和 '2' 的连续出现次数可以生成该字符串。
 * s 的前几个元素是 s = "1221121221221121122……" 。如果将 s 中连续的若干 1 和 2 进行分组，可以得到 "1 22 11 2 1 22 1 22 11 2 11 22 ......" 。
 * 每组中 1 或者 2 的出现次数分别是 "1 2 2 1 1 2 1 2 2 1 2 2 ......" 。上面的出现次数正是 s 自身。
 * 给你一个整数 n ，返回在神奇字符串 s 的前 n 个数字中 1 的数目。
 * <p>
 * 示例 1：
 * 输入：n = 6
 * 输出：3
 * 解释：神奇字符串 s 的前 6 个元素是 “122112”，它包含三个 1，因此返回 3 。
 * <p>
 * 示例 2：
 * 输入：n = 1
 * 输出：1
 * <p>
 * 提示：
 * 1 <= n <= 105
 */
public class MagicalString {
    /**
     * 方法：双指针
     * 题解：https://leetcode.cn/problems/magical-string/solution/zhua-wa-mou-si-tu-jie-leetcode-by-muse-7-i2z6/
     */
    public int magicalString(int n) {
        // 构建神奇字符串
        int[] magic = new int[n + 1];
        // 第一位是1
        magic[0] = 1;
        // 指针
        int tail = 1;
        // 组号
        int p = 1;
        // 结果
        int result = 1;
        // 填入的数字是1还是2
        int value = 1;
        // 当前应该填写数字的个数
        int count = 2;
        // 遍历
        while (tail < n) {
            // 进行反转，1变2，2变1
            value = value ^ 3;
            // 填写count个数字，保证不越界
            while (count-- > 0 && tail < n) {
                // 指针后移
                magic[tail++] = value;
                // 是1记录
                if (value == 1) {
                    result++;
                }
            }
            // 下一组数字的个数
            count = magic[++p];
        }
        return result;
    }
}
