package com.leetcode.L101_200.L0155;

import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * (1)push(x) —— 将元素 x 推入栈中。
 * (2)pop() —— 删除栈顶的元素。
 * (3)top() —— 获取栈顶元素。
 * (4)getMin() —— 检索栈中的最小元素。
 *
 * 示例:
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 * 提示：
 * pop、top 和 getMin 操作总是在 非空栈 上调用。
 */
public class MinStack {
    Stack<Integer> stack;
    //最小栈
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        //压入最大值
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        //压入当前值的时候，将一个最小值伊压入最小栈，即将一个数与栈的最小值绑定
        stack.push(val);
        minStack.push(Math.min(val,minStack.peek()));
    }

    public void pop() {
        //同时弹出
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
