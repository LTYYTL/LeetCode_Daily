package com.offerII.L072;

/**
 * 剑指 Offer II 072. 求平方根
 * 给定一个非负整数 x ，计算并返回 x 的平方根，即实现 int sqrt(int x) 函数。
 * 正数的平方根有两个，只输出其中的正数平方根。
 * 如果平方根不是整数，输出只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 * 输入: x = 4
 * 输出: 2
 *
 * 示例 2:
 * 输入: x = 8
 * 输出: 2
 * 解释: 8 的平方根是 2.82842...，由于小数部分将被舍去，所以返回 2
 *
 * 提示:
 * 0 <= x <= 231 - 1
 *
 * 注意：本题与主站 69 题相同： <a href="https://leetcode-cn.com/problems/sqrtx/">https://leetcode-cn.com/problems/sqrtx/</a>
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
