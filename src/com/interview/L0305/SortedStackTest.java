package com.interview.L0305;

public class SortedStackTest {
    public static void main(String[] args) {
        /*
          示例1:
           输入：
          ["SortedStack", "push", "push", "peek", "pop", "peek"]
          [[], [1], [2], [], [], []]
           输出：
          [null,null,null,1,null,2]
         */
        SortedStack stack = new SortedStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        /*
          示例2:
           输入：
          ["SortedStack", "pop", "pop", "push", "pop", "isEmpty"]
          [[], [], [], [1], [], []]
           输出：
          [null,null,null,null,null,true]
         */
    }
}
