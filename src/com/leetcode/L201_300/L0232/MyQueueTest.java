package com.leetcode.L201_300.L0232;

public class MyQueueTest {
    public static void main(String[] args) {
        /*
          MyQueue myQueue = new MyQueue();
          myQueue.push(1); // queue is: [1]
          myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
          myQueue.peek(); // return 1
          myQueue.pop(); // return 1, queue is [2]
          myQueue.empty(); // return false
         */
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
