package com.leetcode.L0233;

/**
 * 233. 数字 1 的个数
 * 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
 *
 * 示例 1：
 * 输入：n = 13
 * 输出：6
 *
 * 示例 2：
 * 输入：n = 0
 * 输出：0
 *
 *
 * 提示：
 *
 * 0 <= n <= 2 * 109
 */
public class NumberDigitOne {
    public int countDigitOne(int n) {
        return CountProblem(n, 1);
    }

    public int CountProblem(int n, int k) {
        int cnt = 0;
        for (long base = 1; base <= n; base *= 10) {
            // x, y, z 分别表示第 i 位 前， 中， 后的数值，如12580第3位 - 12,5,80
            long x = n / base / 10, y = (n / base) % 10, z = n % base;
            if (k != 0) {
                // 例：求1~128中 个位1 的个数，则为（12 + 1）* 1 = 13
                if (y > k)
                    cnt += (x + 1) * base;
                    // 例：求1~128中 百位1 的个数，则为 0 * 100 + 28 + 1 = 29
                else if (y == k)
                    cnt += x * base + z + 1;
                    // 例：求1~128中 十位5 的个数，则为 1 * 10
                else
                    cnt += x * base;
            }
            else { // k = 0 情况需要单独处理
                if (y == 0)
                    cnt += (x - 1) * base + z + 1;
                else
                    cnt += x * base;
            }
        }
        return cnt;
    }

}
