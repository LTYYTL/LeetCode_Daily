package com.interview.L0302;

public class MinStackTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * MinStack minStack = new MinStack();
         * minStack.push(-2);
         * minStack.push(0);
         * minStack.push(-3);
         * minStack.getMin();   --> 返回 -3.
         * minStack.pop();
         * minStack.top();      --> 返回 0.
         * minStack.getMin();   --> 返回 -2.
         */
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
