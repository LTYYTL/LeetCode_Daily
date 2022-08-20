package com.leetcode.L101_200.L0155;

public class MinStackTest {
    public static void main(String[] args) {
        /*
          示例:
          输入：
          ["MinStack","push","push","push","getMin","pop","top","getMin"]
          [[],[-2],[0],[-3],[],[],[],[]]
          输出：
          [null,null,null,null,-3,null,0,-2]
          解释：
          MinStack minStack = new MinStack();
          minStack.push(-2);
          minStack.push(0);
          minStack.push(-3);
          minStack.getMin();   --> 返回 -3.
          minStack.pop();
          minStack.top();      --> 返回 0.
          minStack.getMin();   --> 返回 -2.
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
