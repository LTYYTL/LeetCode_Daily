package com.leetcode.L201_300.L0224;

import java.util.Stack;

/**
 * 224. 基本计算器
 * 实现一个基本的计算器来计算一个简单的字符串表达式 s 的值。
 *
 * 示例 1：
 * 输入：s = "1 + 1"
 * 输出：2
 *
 * 示例 2：
 * 输入：s = " 2-1 + 2 "
 * 输出：3
 *
 * 示例 3：
 * 输入：s = "(1+(4+5+2)-3)+(6+8)"
 * 输出：23
 *
 * 提示：
 * 1 <= s.length <= 3 * 105
 * s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
 * s 表示一个有效的表达式
 */
public class BasicCalculator {
    //索引
    int index = 0;

    /**
     * 方法：模拟
     */
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        //符号位，默认是+
        char sign = '+';
        //将字符串转换成数字
        int num = 0;
        //遍历字符串
        while (index < s.length()){
            //当前字符
            char c = s.charAt(index++);
            //数字情况
            if (isSign(c)){
                num = 10 * num + (c - '0');
            }
            //（递归调用
            if (c == '('){
                num = calculate(s);
            }
            //不会数字，空格跳过
            if ((!isSign(c) && c != ' ')|| index == s.length()){
                //判断符号
                switch (sign) {
                    case '+' -> stack.push(num);//加入正数
                    case '-' -> stack.push(-num);//加入负数
                    case '*' -> stack.push(stack.pop() * num);
                    case '/' -> stack.push(stack.pop() / num);
                }
                //变符号
                sign = c;
                //清0
                num = 0;
            }
            //）情况
            if (c == ')'){
                break;
            }
        }
        return sum(stack);
    }

    /**
     * 计算和
     */
    private int sum(Stack<Integer> stack) {
        int res = 0;
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }

    /**
     * 判断是否为数字
     */
    private boolean isSign(char c){
        return c >= '0' && c <= '9';
    }
}
