package com.leetcode.L301_400.L0367;

/**
 * 367. 有效的完全平方数
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 *
 * 示例 1：
 * 输入：num = 16
 * 输出：true
 *
 * 示例 2：
 * 输入：num = 14
 * 输出：false
 *
 * 提示：
 * 1 <= num <= 2^31 - 1
 */
public class ValidPerfectSquare {
    /**
     * 方法：二分查找
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        //双指针
        int left = 0;
        int right = num;
        while (left <= right){
            //中间值
            int mid = (right - left)/2 + left;
            long seq = (long) mid * mid;
            if (seq == num)
                return true;
            else if (seq < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
