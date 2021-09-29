package com.offer.L0430;

/**
 * 剑指 Offer 43. 1～n 整数中 1 出现的次数
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 *
 * 示例 1：
 * 输入：n = 12
 * 输出：5
 *
 * 示例 2：
 * 输入：n = 13
 * 输出：6
 *
 * 限制：
 * 1 <= n < 2^31
 * 注意：本题与主站 233 题相同：https://leetcode-cn.com/problems/number-of-digit-one/
 */
public class NumberDigitOne {
    /**
     * 方法：数学
     * 1、当 cur = 0时： 此位 1 的出现次数只由高位 high 决定，计算公式为：high×digit
     * 2、当 cur = 1时： 此位 1 的出现次数由高位 high 和低位 low 决定，计算公式为：high×digit+low+1
     * 3、当 cur > 2时： 此位 1 的出现次数只由高位 high 决定，计算公式为：(high+1)×digit
     * @param n
     * @return
     */
    public int countDigitOne(int n) {
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
            if (cur == 0){
                res += high * digit;
            }else if (cur == 1){
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
