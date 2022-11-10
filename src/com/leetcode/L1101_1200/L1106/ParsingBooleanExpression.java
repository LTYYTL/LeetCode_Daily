package com.leetcode.L1101_1200.L1106;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1106. 解析布尔表达式
 * 给你一个以字符串形式表述的 布尔表达式（boolean） expression，返回该式的运算结果。
 * 有效的表达式需遵循以下约定：
 * （1）"t"，运算结果为 True
 * （2）"f"，运算结果为 False
 * （3）"!(expr)"，运算过程为对内部表达式 expr 进行逻辑 非的运算（NOT）
 * （4）"&(expr1,expr2,...)"，运算过程为对 2 个或以上内部表达式 expr1, expr2, ... 进行逻辑 与的运算（AND）
 * （5）"|(expr1,expr2,...)"，运算过程为对 2 个或以上内部表达式 expr1, expr2, ... 进行逻辑 或的运算（OR）
 * <p>
 * 示例 1：
 * 输入：expression = "!(f)"
 * 输出：true
 * <p>
 * 示例 2：
 * 输入：expression = "|(f,t)"
 * 输出：true
 * <p>
 * 示例 3：
 * 输入：expression = "&(t,f)"
 * 输出：false
 * <p>
 * 示例 4：
 * 输入：expression = "|(&(t,f,t),!(t))"
 * 输出：false
 * <p>
 * 提示：
 * 1 <= expression.length <= 20000
 * expression[i] 由 {'(', ')', '&', '|', '!', 't', 'f', ','} 中的字符组成。
 * expression 是以上述形式给出的有效表达式，表示一个布尔值。
 */
public class ParsingBooleanExpression {
    /**
     * 方法：栈
     */
    public boolean parseBoolExpr(String expression) {
        // 存放数值
        Deque<Character> stack = new LinkedList<>();
        // 存放操作
        Deque<Character> op_stack = new LinkedList<>();

        // 遍历
        for (int i = 0; i < expression.length(); i++) {
            // 当前字符
            char c = expression.charAt(i);
            // 是括号的结束
            if (c == ')') {
                // 当前括号内的操作符
                char op = op_stack.pop();
                boolean cur = stack.peek() == 't';
                // 一直出栈直到遇到‘（’
                while (stack.peek() != '(') {
                    boolean top = stack.pop() == 't';
                    // 根据不同的符号操作
                    switch (op) {
                        case '!' -> cur = !top;
                        case '&' -> cur = cur & top;
                        case '|' -> cur = cur | top;
                        default -> {
                        }
                    }
                }
                // 弹出‘）’
                stack.pop();
                // 将结果入栈
                stack.push(cur ? 't' : 'f');
            } else if (c == '!' || c == '&' || c == '|') {// 将符号存储
                op_stack.push(c);
            } else if (c != ',') {// 将t和f存储
                stack.push(c);
            }
        }

        return stack.pop() == 't';
    }
}
