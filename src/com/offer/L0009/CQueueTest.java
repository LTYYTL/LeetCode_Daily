package com.offer.L0009;

public class CQueueTest {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        /*** 示例 1：
         * 输入：
         * ["CQueue","appendTail","deleteHead","deleteHead"]
         * [[],[3],[],[]]
         * 输出：[null,null,3,-1]
         */
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
