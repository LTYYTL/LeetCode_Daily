package com.offer.L0592;

public class MaxQueueTest {
    public static void main(String[] args) {
        /**
         * 示例 1：
         * 输入:
         * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
         * [[],[1],[2],[],[],[]]
         * 输出: [null,null,null,2,1,2]
         */
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());
        /**
         * 示例 2：
         * 输入:
         * ["MaxQueue","pop_front","max_value"]
         * [[],[],[]]
         * 输出: [null,-1,-1]
         */
        MaxQueue maxQueue1 = new MaxQueue();
        System.out.println(maxQueue1.pop_front());
        System.out.println(maxQueue1.max_value());
    }
}
