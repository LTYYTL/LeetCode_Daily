package com.offer.L009;

import java.util.LinkedList;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 示例 1：
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 *
 * 示例 2：
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 *
 * 提示：
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 */
public class CQueue {
    /**
     * 1、加入队尾 appendTail()函数： 将数字 val 加入栈 A 即可。
     * 2、删除队首deleteHead()函数： 有以下三种情况。
     *  (1)当栈 B 不为空： B中仍有已完成倒序的元素，因此直接返回 B 的栈顶元素。
     *  (2)否则，当 A 为空： 即两个栈都为空，无元素，因此返回 -1−1 。
     *  (3)否则： 将栈 A 元素全部转移至栈 B 中，实现元素倒序，并返回栈 B 的栈顶元素。
     */

    //两个栈
    private LinkedList<Integer> stack1;
    private LinkedList<Integer> stack2;

    //构造方法
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    //入栈
    public void appendTail(int value) {
        stack1.addLast(value);
    }

    //出栈
    public int deleteHead() {
        if (!stack2.isEmpty()){
            return stack2.removeLast();
        }
        if (stack1.isEmpty())
            return -1;
        while (!stack1.isEmpty())
            stack2.addLast(stack1.removeLast());
        return stack2.removeLast();
    }
}
