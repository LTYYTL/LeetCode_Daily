package com.offer.L0592;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 剑指 Offer 59 - II. 队列的最大值
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 *
 * 示例 1：
 * 输入:
 * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
 * [[],[1],[2],[],[],[]]
 * 输出: [null,null,null,2,1,2]
 *
 * 示例 2：
 * 输入:
 * ["MaxQueue","pop_front","max_value"]
 * [[],[],[]]
 * 输出: [null,-1,-1]
 *
 * 限制：
 * 1 <= push_back,pop_front,max_value的总操作数 <= 10000
 * 1 <= value <= 10^5
 */
public class MaxQueue {
    //正常队列
    Queue<Integer> queue;
    //优先队列
    PriorityQueue<Integer> max;
    public MaxQueue() {
        queue = new LinkedList<>();
        //从大到小排列
        max = new PriorityQueue<>((o1, o2) -> o2-o1);
    }

    public int max_value() {
        //空值
        if (max.isEmpty())
            return -1;
        //返回队首元素
        return max.peek();
    }

    //将元素压入两个队列中
    public void push_back(int value) {
        queue.offer(value);
        max.offer(value);
    }

    public int pop_front() {
        //空值情况
        if (queue.isEmpty())
            return -1;
        //从优先队列中移除，普通的队列要出队的元素
        max.remove(queue.peek());
        return queue.poll();
    }
}
