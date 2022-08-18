package com.leetcode.L601_700.L0641;

/**
 * 641. 设计循环双端队列
 * 设计实现双端队列。
 * <p>
 * 实现 MyCircularDeque 类:
 * (1)MyCircularDeque(int k) ：构造函数,双端队列最大为 k 。
 * (2)boolean insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true ，否则返回 false 。
 * (3)boolean insertLast() ：将一个元素添加到双端队列尾部。如果操作成功返回 true ，否则返回 false 。
 * (4)boolean deleteFront() ：从双端队列头部删除一个元素。 如果操作成功返回 true ，否则返回 false 。
 * (5)boolean deleteLast() ：从双端队列尾部删除一个元素。如果操作成功返回 true ，否则返回 false 。
 * (6)int getFront() )：从双端队列头部获得一个元素。如果双端队列为空，返回 -1 。
 * (7)int getRear() ：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1 。
 * (8)boolean isEmpty() ：若双端队列为空，则返回 true ，否则返回 false  。
 * (9)boolean isFull() ：若双端队列满了，则返回 true ，否则返回 false 。
 * <p>
 * 示例 1：
 * 输入
 * ["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]
 * [[3], [1], [2], [3], [4], [], [], [], [4], []]
 * 输出
 * [null, true, true, true, false, 2, true, true, true, 4]
 * 解释
 * MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
 * circularDeque.insertLast(1);			        // 返回 true
 * circularDeque.insertLast(2);			        // 返回 true
 * circularDeque.insertFront(3);			        // 返回 true
 * circularDeque.insertFront(4);			        // 已经满了，返回 false
 * circularDeque.getRear();  				// 返回 2
 * circularDeque.isFull();				        // 返回 true
 * circularDeque.deleteLast();			        // 返回 true
 * circularDeque.insertFront(4);			        // 返回 true
 * circularDeque.getFront();				// 返回 4
 * <p>
 * 提示：
 * 1 <= k <= 1000
 * 0 <= value <= 1000
 * insertFront, insertLast, deleteFront, deleteLast, getFront, getRear, isEmpty, isFull  调用次数不大于 2000 次
 */
public class MyCircularDeque {

    private final int capacity;
    private int size;
    private final int[] arr;
    private int front, last;


    public MyCircularDeque(int k) {
        this.capacity = k;
        this.size = 0;
        this.arr = new int[capacity];
        this.front = this.last = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        // 注意这里的写法：先放值后移动
        arr[front] = value;
        front = index(front + 1);
        size++;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        // 注意这里的写法：先移动后放值
        last = index(last - 1);
        arr[last] = value;
        size++;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        front = index(front - 1);
        size--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        last = index(last + 1);
        size--;

        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return arr[index(front - 1)];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[last];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    private int index(int index) {
        return (index + capacity) % capacity;
    }
}
