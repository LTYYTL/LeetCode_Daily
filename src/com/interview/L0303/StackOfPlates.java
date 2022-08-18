package com.interview.L0303;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 面试题 03.03. 堆盘子
 * 堆盘子。设想有一堆盘子，堆太高可能会倒下来。因此，在现实生活中，盘子堆到一定高度时，我们就会另外堆一堆盘子。
 * 请实现数据结构SetOfStacks，模拟这种行为。SetOfStacks应该由多个栈组成，并且在前一个栈填满时新建一个栈。
 * 此外，SetOfStacks.push()和SetOfStacks.pop()应该与普通栈的操作方法相同（也就是说，pop()返回的值，应该跟只有一个栈时的情况一样）。
 *
 * 进阶：实现一个popAt(int index)方法，根据指定的子栈，执行pop操作。
 * 当某个栈为空时，应当删除该栈。当栈中没有元素或不存在该栈时，pop，popAt 应返回 -1.
 *
 * 示例1:
 *  输入：
 * ["StackOfPlates", "push", "push", "popAt", "pop", "pop"]
 * [[1], [1], [2], [1], [], []]
 *  输出：
 * [null, null, null, 2, 1, -1]
 *
 * 示例2:
 *  输入：
 * ["StackOfPlates", "push", "push", "push", "popAt", "popAt", "popAt"]
 * [[2], [1], [2], [3], [0], [0], [0]]
 *  输出：
 * [null, null, null, null, 2, 1, 3]
 */
public class StackOfPlates {
    /**
     * 方法：list集合
     */
    private final List<Stack<Integer>> list;
    private final int size;

    //初始化
    public StackOfPlates(int cap) {
        list = new ArrayList<>();
        this.size = cap;
    }


    public void push(int val) {
        if (size <= 0)
            return;
        //没有栈，创建新栈
        if (list.isEmpty())
            list.add(new Stack<>());
        //最后一个栈已经满了，创建新栈
        if (list.get(list.size()-1).size() >= size)
            list.add(new Stack<>());
        //获取列表最后的一个栈
        Stack<Integer> cur = list.get(list.size() - 1);
        //入栈
        cur.push(val);
    }

    public int pop() {
        //没有栈
        if (list.isEmpty())
            return -1;
        //获取最后一个栈
        Stack<Integer> cur = list.get(list.size() - 1);
        //出栈
        int val = cur.pop();
        //出栈后，栈为空，将其移除
        if (cur.isEmpty())
            list.remove(list.size() - 1);

        return val;
    }

    public int popAt(int index) {
        //没有栈或者没有当前索引的栈
        if (list.size() <= 0 || list.size() <= index)
            return -1;
        //获取当前索引的栈
        Stack<Integer> cur = list.get(index);
        //出栈
        int val = cur.pop();
        //出栈后，栈为空，将其移除
        if (cur.isEmpty())
            list.remove(index);

        return val;
    }
}