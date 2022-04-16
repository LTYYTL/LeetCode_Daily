package com.leetcode.L401_500.L0479;

/**
 * 479. 最大回文数乘积
 * 给定一个整数 n ，返回 可表示为两个 n 位整数乘积的 最大回文整数 。因为答案可能非常大，所以返回它对 1337 取余 。
 *
 * 示例 1:
 * 输入：n = 2
 * 输出：987
 * 解释：99 x 91 = 9009, 9009 % 1337 = 987
 *
 * 示例 2:
 * 输入： n = 1
 * 输出： 9
 *
 * 提示:
 * 1 <= n <= 8
 */
public class LargestPalindromeProduct {
    /**
     * 方法：数学
     * @param n
     * @return
     */
    public int largestPalindrome(int n) {
        //1位数情况
        if (n == 1)
            return 9;
        //左半部分
        long upper = (long) (Math.pow(10,n)-1);
        //结果
        int ans = 0;
        //遍历
        for (long left = upper; ans == 0; --left) {
            //回文数
            long p = left;
            //构建回文数，即将数字反转
            for (long x = left; x > 0 ; x/=10) {
                p = p*10 + x%10;
            }
            //查看此回文数是否被整除
            for (long j = upper; j*j >= p ; --j) {
                if (p%j == 0){
                    ans = (int) (p%1337);
                    break;
                }
            }
        }
        return ans;
    }
}
