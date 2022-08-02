package com.leetcode.L601_700.L0622;

public class MyCircularQueueTest {
    public static void main(String[] args) {
        /**
         * MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
         * circularQueue.enQueue(1);  // 返回 true
         * circularQueue.enQueue(2);  // 返回 true
         * circularQueue.enQueue(3);  // 返回 true
         * circularQueue.enQueue(4);  // 返回 false，队列已满
         * circularQueue.Rear();  // 返回 3
         * circularQueue.isFull();  // 返回 true
         * circularQueue.deQueue();  // 返回 true
         * circularQueue.enQueue(4);  // 返回 true
         * circularQueue.Rear();  // 返回 4
         */
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1));  // 返回 true
        System.out.println(circularQueue.enQueue(2));  // 返回 true
        System.out.println(circularQueue.enQueue(3));  // 返回 true
        System.out.println(circularQueue.enQueue(4));  // 返回 false，队列已满
        System.out.println(circularQueue.Rear());  // 返回 3
        System.out.println(circularQueue.isFull());  // 返回 true
        System.out.println(circularQueue.deQueue());  // 返回 true
        System.out.println(circularQueue.enQueue(4));  // 返回 true
        System.out.println(circularQueue.Rear());  // 返回 4

    }
}
