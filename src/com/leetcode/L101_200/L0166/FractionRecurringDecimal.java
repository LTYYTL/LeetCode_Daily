package com.leetcode.L101_200.L0166;

import java.util.HashMap;
import java.util.Map;

/**
 * 166. 分数到小数
 * 给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。
 * 如果小数部分为循环小数，则将循环的部分括在括号内。
 * 如果存在多个答案，只需返回 任意一个 。
 * 对于所有给定的输入，保证 答案字符串的长度小于 104 。
 *
 * 示例 1：
 * 输入：numerator = 1, denominator = 2
 * 输出："0.5"
 *
 * 示例 2：
 * 输入：numerator = 2, denominator = 1
 * 输出："2"
 *
 * 示例 3：
 * 输入：numerator = 2, denominator = 3
 * 输出："0.(6)"
 *
 * 示例 4：
 * 输入：numerator = 4, denominator = 333
 * 输出："0.(012)"
 *
 * 示例 5：
 * 输入：numerator = 1, denominator = 5
 * 输出："0.2"
 *
 * 提示：
 * -231 <= numerator, denominator <= 231 - 1
 * denominator != 0
 */
public class FractionRecurringDecimal {
    /**
     * 方法：数学
     * @param numerator
     * @param denominator
     * @return
     */
    public String fractionToDecimal(int numerator, int denominator) {
        //转换成长整型
        long numeratorLong = numerator;
        long denominatorLong = denominator;
        //是否能整除
        if (numeratorLong % denominatorLong == 0){
            return String.valueOf(numeratorLong / denominatorLong);
        }

        StringBuilder sb = new StringBuilder();
        //记录符号
        if (numeratorLong < 0 ^ denominatorLong < 0)
            sb.append('-');

        //整数部分
        numeratorLong = Math.abs(numeratorLong);
        denominatorLong = Math.abs(denominatorLong);
        long integerPart = numeratorLong / denominatorLong;
        sb.append(integerPart);
        sb.append(".");

        //小数部分
        Map<Long, Integer> map = new HashMap<>();
        //索引
        int index = 0;
        StringBuilder re = new StringBuilder();
        //余数
        long remainder = numeratorLong % denominatorLong;
        while (remainder != 0 && !map.containsKey(remainder)){
            //记录商的索引
            map.put(remainder,index);
            remainder *= 10;
            re.append(remainder/denominatorLong);
            remainder %= denominator;
            index++;
        }
        //有循环节
        if (remainder != 0){
            int insertIndex = map.get(remainder);
            re.insert(insertIndex,'(');
            re.append(')');
        }
        sb.append(re);
        return sb.toString();
    }
}