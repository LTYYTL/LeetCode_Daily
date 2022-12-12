package com.leetcode.L801_900.L0895;

import java.util.HashMap;
import java.util.Stack;

/**
 * 895. 最大频率栈
 * 设计一个类似堆栈的数据结构，将元素推入堆栈，并从堆栈中弹出出现频率最高的元素。
 * 实现 FreqStack 类:
 * (1)FreqStack() 构造一个空的堆栈。
 * (2)void push(int val) 将一个整数 val 压入栈顶。
 * (3)int pop() 删除并返回堆栈中出现频率最高的元素。
 * 如果出现频率最高的元素不只一个，则移除并返回最接近栈顶的元素。
 * <p>
 * 示例 1：
 * 输入：
 * ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
 * [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
 * 输出：[null,null,null,null,null,null,null,5,7,5,4]
 * 解释：
 * FreqStack = new FreqStack();
 * freqStack.push (5);//堆栈为 [5]
 * freqStack.push (7);//堆栈是 [5,7]
 * freqStack.push (5);//堆栈是 [5,7,5]
 * freqStack.push (7);//堆栈是 [5,7,5,7]
 * freqStack.push (4);//堆栈是 [5,7,5,7,4]
 * freqStack.push (5);//堆栈是 [5,7,5,7,4,5]
 * freqStack.pop ();//返回 5 ，因为 5 出现频率最高。堆栈变成 [5,7,5,7,4]。
 * freqStack.pop ();//返回 7 ，因为 5 和 7 出现频率最高，但7最接近顶部。堆栈变成 [5,7,5,4]。
 * freqStack.pop ();//返回 5 ，因为 5 出现频率最高。堆栈变成 [5,7,4]。
 * freqStack.pop ();//返回 4 ，因为 4, 5 和 7 出现频率最高，但 4 是最接近顶部的。堆栈变成 [5,7]。
 * <p>
 * 提示：
 * 0 <= val <= 109
 * push 和 pop 的操作数不大于 2 * 104。
 * 输入保证在调用 pop 之前堆栈中至少有一个元素。
 */
public class FreqStack {
    // 记录 FreqStack 中每个 val 对应的出现频率，后文就称为 VF 表
    private final HashMap<Integer, Integer> valToFreq;
    // 记录频率 freq 对应的 val 列表，后文就称为 FV 表
    private final HashMap<Integer, Stack<Integer>> freqToVals;
    // 记录 FreqStack 中元素的最大频率
    private int maxFreq;

    public FreqStack() {
        maxFreq = 0;
        valToFreq = new HashMap<>();
        freqToVals = new HashMap<>();
    }

    public void push(int val) {
        // 计算当前元素的频率
        int freq = valToFreq.getOrDefault(val, 0) + 1;
        // 记录
        valToFreq.put(val, freq);

        // 如果当前频率不存在的key就创建
        freqToVals.putIfAbsent(freq, new Stack<>());
        // 对应元素加入频率栈
        freqToVals.get(freq).push(val);

        // 更新最大频率
        maxFreq = Math.max(maxFreq, freq);
    }

    public int pop() {
        // 最高频率的元素
        Stack<Integer> stack = freqToVals.get(maxFreq);
        // 出栈
        int val = stack.pop();

        // 更新元素频率
        int freq = valToFreq.get(val) - 1;
        valToFreq.put(val, freq);

        // 没有这个频率了，就减小最高频率
        if (stack.isEmpty()) {
            maxFreq--;
        }

        return val;
    }
}
