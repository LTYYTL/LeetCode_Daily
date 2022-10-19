package com.interview.L1626;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 面试题 16.26. 计算器
 * 给定一个包含正整数、加(+)、减(-)、乘(*)、除(/)的算数表达式(括号除外)，计算其结果。
 *
 * 表达式仅包含非负整数，+， - ，*，/ 四种运算符和空格  。 整数除法仅保留整数部分。
 *
 * 示例 1:
 * 输入: "3+2*2"
 * 输出: 7
 *
 * 示例 2:
 * 输入: " 3/2 "
 * 输出: 1
 *
 * 示例 3:
 * 输入: " 3+5 / 2 "
 * 输出: 5
 *
 * 说明：
 * 你可以假设所给定的表达式都是有效的。
 * 请不要使用内置的库函数 eval。
 */
public class Calculator {
    /**
     * 方法：栈
     */
    public int calculate(String s) {
        //去掉空格
        s = s.replaceAll(" ","");
        //栈
        Deque<Integer> stack = new LinkedList<>();
        //符号
        char flag = '+';
        //数值
        int num = 0;
        //遍历
        for (int i = 0; i < s.length(); i++) {
            //当前符号
            char c = s.charAt(i);
            //是数字
            if (c >= '0' && c <= '9'){
                //与前面数组合
                num = num * 10 + c - '0';
            }
            //不是数也不是最后一位
            if (!Character.isDigit(c) || i == s.length()-1) {
                //根据符号做操作
                switch (flag) {
                    case '+':
                        stack.push(num);
                    case '-':
                        stack.push(-num);
                    case '*':
                        stack.push(stack.pop() * num);
                    case '/':
                        stack.push(stack.pop() / num);
                }
                //记录符号
                flag = c;
                //数字清空
                num = 0;
            }
        }
        while (!stack.isEmpty()){
            num += stack.pop();
        }

        return num;
    }
}
