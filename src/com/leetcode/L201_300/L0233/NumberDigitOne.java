package com.leetcode.L201_300.L0233;

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
        //当前是什么位
        int digit = 1;
        //结果
        int res = 0;
        //高位
        int high = n / 10;
        //当前位
        int cur = n % 10;
        //低位
        int low = 0;
        while (high != 0 || cur != 0){
            if (cur < k){
                res += high * digit;
            }else if (cur == k){
                res += high * digit + low + 1;
            }else {
                res += (high + 1) * digit;
            }
            //重新计算各位
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }

}
