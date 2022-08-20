package com.leetcode.L601_700.L0641;

public class MyCircularDequeTest {
    public static void main(String[] args) {
        /*
          示例 1：
          输入
          ["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]
          [[3], [1], [2], [3], [4], [], [], [], [4], []]
          输出
          [null, true, true, true, false, 2, true, true, true, 4]
          解释
          MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
          circularDeque.insertLast(1);			        // 返回 true
          circularDeque.insertLast(2);			        // 返回 true
          circularDeque.insertFront(3);			        // 返回 true
          circularDeque.insertFront(4);			        // 已经满了，返回 false
          circularDeque.getRear();  				// 返回 2
          circularDeque.isFull();				        // 返回 true
          circularDeque.deleteLast();			        // 返回 true
          circularDeque.insertFront(4);			        // 返回 true
          circularDeque.getFront();				// 返回 4
         */
        MyCircularDeque circularDeque = new MyCircularDeque(3);
        System.out.println(circularDeque.insertLast(1));
        System.out.println(circularDeque.insertLast(2));
        System.out.println(circularDeque.insertFront(3));
        System.out.println(circularDeque.insertFront(4));
        System.out.println(circularDeque.getRear());
        System.out.println(circularDeque.isFull());
        System.out.println(circularDeque.deleteLast());
        System.out.println(circularDeque.insertFront(4));
        System.out.println(circularDeque.getFront());


    }
}
