package com.leetcode.L601_700.L0622;

/**
 * 622. 设计循环队列
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 * <p>
 * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
 * <p>
 * 你的实现应该支持如下操作：
 * <p>
 * (1)MyCircularQueue(k): 构造器，设置队列长度为 k 。
 * (2)Front: 从队首获取元素。如果队列为空，返回 -1 。
 * (3)Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * (4)enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
 * (5)deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
 * (6)isEmpty(): 检查循环队列是否为空。
 * (7)isFull(): 检查循环队列是否已满。
 * <p>
 * 示例：
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
 * <p>
 * 提示：
 * 所有的值都在 0 至 1000 的范围内；
 * 操作数将在 1 至 1000 的范围内；
 * 请不要使用内置的队列库。
 */
public class MyCircularQueue {
    /**
     * 方法：数组
     */
    //使用数组模拟队列
    private int[] queue;
    // 队头
    private int head;
    // 队尾
    private int tail;
    //长度
    private int n;

    //初始化
    public MyCircularQueue(int k) {
        //牺牲一个空间
        this.queue = new int[k + 1];
        this.head = 0;
        this.tail = 0;
        this.n = k + 1;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        queue[tail] = value;
        tail = (tail + 1) % n;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        head = (head + 1) % n;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return queue[head];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return queue[(tail + n - 1) % n];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % n == head;
    }
}
