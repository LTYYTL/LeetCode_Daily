package com.leetcode.L0504;

/**
 * 504. 七进制数
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 *
 * 示例 1:
 * 输入: 100
 * 输出: "202"
 *
 * 示例 2:
 * 输入: -7
 * 输出: "-10"
 *
 * 注意: 输入范围是 [-1e7, 1e7] 。
 */
public class Base7 {
    /**
     * 方法：数学
     * @param num
     * @return
     */
    public String convertToBase7(int num) {
        StringBuilder res = new StringBuilder();
        //判断0
        if (num == 0){
            res.append("0");
            return res.toString();
        }
        //判断正数还是负数
        boolean flag = false;
        if(num < 0){
            num = -num;
            flag = true;
        }
        //短除法
        while (num != 0){
            res.append(num%7);
            num /= 7;
        }
        //逆序
        res.reverse();
        //根据原来的正负添加符号
        if (flag)
            res.insert(0,"-");
        return res.toString();
    }
}
