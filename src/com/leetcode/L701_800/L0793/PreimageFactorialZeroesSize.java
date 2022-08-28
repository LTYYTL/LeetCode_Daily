package com.leetcode.L701_800.L0793;

/**
 * 793. 阶乘函数后 K 个零
 * f(x) 是 x! 末尾是 0 的数量。回想一下 x! = 1 * 2 * 3 * ... * x，且 0! = 1 。
 * 例如， f(3) = 0 ，因为 3! = 6 的末尾没有 0 ；而 f(11) = 2 ，因为 11!= 39916800 末端有 2 个 0 。
 * 给定 k，找出返回能满足 f(x) = k 的非负整数 x 的数量。
 * <p>
 * 示例 1：
 * 输入：k = 0
 * 输出：5
 * 解释：0!, 1!, 2!, 3!, 和 4! 均符合 k = 0 的条件。
 * <p>
 * 示例 2：
 * 输入：k = 5
 * 输出：0
 * 解释：没有匹配到这样的 x!，符合 k = 5 的条件。
 * <p>
 * 示例 3:
 * 输入: k = 3
 * 输出: 5
 * <p>
 * 提示:
 * 0 <= k <= 109
 */
public class PreimageFactorialZeroesSize {
    /**
     * 方法：二分查找
     */
    public int preimageSizeFZF(int k) {
        return (int) (right(k) - left(k) + 1);
    }

    private long left(int k) {
        long lo = 0;
        long hi = Long.MAX_VALUE;

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (trailingZeroes(mid) < k) {
                lo = mid + 1;
            } else if (trailingZeroes(mid) > k) {
                hi = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private long right(int k) {
        long lo = 0;
        long hi = Long.MAX_VALUE;

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (trailingZeroes(mid) < k) {
                lo = mid + 1;
            } else if (trailingZeroes(mid) > k) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo - 1;
    }

    private long trailingZeroes(long n) {
        //计算有多少个5因子
        long res = 0;
        long divisor = 5;
        while (divisor <= n) {
            res += n / divisor;
            divisor *= 5;
        }
        return res;
    }
}
