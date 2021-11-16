package com.interview.L0301;

/**
 * 面试题 03.01. 三合一
 * 三合一。描述如何只用一个数组来实现三个栈。
 * 你应该实现push(stackNum, value)、pop(stackNum)、isEmpty(stackNum)、peek(stackNum)方法。stackNum表示栈下标，value表示压入的值。
 * 构造函数会传入一个stackSize参数，代表每个栈的大小。
 *
 * 示例1:
 *  输入：
 * ["TripleInOne", "push", "push", "pop", "pop", "pop", "isEmpty"]
 * [[1], [0, 1], [0, 2], [0], [0], [0], [0]]
 *  输出：
 * [null, null, null, 1, -1, -1, true]
 * 说明：当栈为空时`pop, peek`返回-1，当栈满时`push`不压入元素。
 *
 * 示例2:
 *  输入：
 * ["TripleInOne", "push", "push", "push", "pop", "pop", "pop", "peek"]
 * [[2], [0, 1], [0, 2], [0, 3], [0], [0], [0], [0]]
 *  输出：
 * [null, null, null, null, 2, 1, -1, -1]
 *
 * 提示：
 * 0 <= stackNum <= 2
 */
public class TripleInOne {
    /**
     * 方法：数组
     */
    public int[][] stack;
    //可存储的位置指针
    public int[] location;

    public TripleInOne(int stackSize) {
        stack = new int[3][stackSize];
        location = new int[3];
    }

    public void push(int stackNum, int value) {
        //栈顶索引
        int index = location[stackNum];
        //栈满
        if (location[stackNum] >= stack[stackNum].length)
            return;
        //入栈
        stack[stackNum][index] = value;
        //索引上移
        location[stackNum]++;
    }

    public int pop(int stackNum) {
        //获取栈顶索引
        int index = location[stackNum];
        //空栈
        if (index == 0)
            return -1;
        //索引下移
        location[stackNum]--;
        //弹出
        return stack[stackNum][index-1];
    }

    public int peek(int stackNum) {
        //栈顶索引
        int index = location[stackNum];
        //空栈
        if (index == 0)
            return -1;
        //返回栈顶元素
        return stack[stackNum][index-1];
    }

    public boolean isEmpty(int stackNum) {
        int index = location[stackNum];
        return index == 0;
    }
}
