package com.offer.L0030;

public class MinStackTest {
    public static void main(String[] args) {
        /**
         * MinStack minStack = new MinStack();
         * minStack.push(-2);
         * minStack.push(0);
         * minStack.push(-3);
         * minStack.min();   --> 返回 -3.
         * minStack.pop();
         * minStack.top();      --> 返回 0.
         * minStack.min();   --> 返回 -2.
         */
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }
}
