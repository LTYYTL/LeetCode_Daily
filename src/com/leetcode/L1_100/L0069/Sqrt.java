package com.leetcode.L1_100.L0069;

/**
 * 69. Sqrt(x)
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 *
 * 示例 1：
 * 输入：x = 4
 * 输出：2
 *
 * 示例 2：
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 *
 * 提示：
 *
 * 0 <= x <= 231 - 1
 */
public class Sqrt {
    /**
     * 方法：二分查找
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = -1;
         while (left <= right){
             int mid = (right - left) /2 + left;
              if ((long)mid * mid <= x) {
                  left = mid + 1;
                  res = mid;
              } else
                 right = mid - 1;
         }
         return res;
    }
}