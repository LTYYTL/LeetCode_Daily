package com.leetcode.L0326;

/**
 * 326. 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 *
 * 示例 1：
 * 输入：n = 27
 * 输出：true
 *
 * 示例 2：
 * 输入：n = 0
 * 输出：false
 *
 * 示例 3：
 * 输入：n = 9
 * 输出：true
 *
 * 示例 4：
 * 输入：n = 45
 * 输出：false
 *
 * 提示：
 * -231 <= n <= 231 - 1
 *
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 */
public class PowerThree {
    /**
     * 方法：数学
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    /**
     * 如果两个数都是 3 的幂次方，那么，拿大的数除以小的数一定可以整除，比如 3^3 \% 3^2 = 0
     * 且题目约定了范围是 int 整数范围内，所以，我们可以找到 int 整数范围内最大的 3 的幂次方，让它除以 n ，
     * 如果能整除，说明 n 是 3 的幂次方，可以很轻松地得到 int 范围内最大的 3 的幂次方为 3^{19} = 11622614673
     * @param n
     * @return
     */
    public boolean isPowerOfThree_math(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
