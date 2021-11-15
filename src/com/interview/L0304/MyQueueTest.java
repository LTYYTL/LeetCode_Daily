package com.interview.L0304;

public class MyQueueTest {
    public static void main(String[] args) {
        /**
         * MyQueue queue = new MyQueue();
         * queue.push(1);
         * queue.push(2);
         * queue.peek();  // 返回 1
         * queue.pop();   // 返回 1
         * queue.empty(); // 返回 false
         */
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());

    }
}
