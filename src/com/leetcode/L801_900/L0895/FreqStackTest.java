package com.leetcode.L801_900.L0895;

public class FreqStackTest {
    public static void main(String[] args) {
        /*
          示例 1：
          输入：
          ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
          [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
          输出：[null,null,null,null,null,null,null,5,7,5,4]
          解释：
          FreqStack = new FreqStack();
          freqStack.push (5);//堆栈为 [5]
          freqStack.push (7);//堆栈是 [5,7]
          freqStack.push (5);//堆栈是 [5,7,5]
          freqStack.push (7);//堆栈是 [5,7,5,7]
          freqStack.push (4);//堆栈是 [5,7,5,7,4]
          freqStack.push (5);//堆栈是 [5,7,5,7,4,5]
          freqStack.pop ();//返回 5 ，因为 5 出现频率最高。堆栈变成 [5,7,5,7,4]。
          freqStack.pop ();//返回 7 ，因为 5 和 7 出现频率最高，但7最接近顶部。堆栈变成 [5,7,5,4]。
          freqStack.pop ();//返回 5 ，因为 5 出现频率最高。堆栈变成 [5,7,4]。
          freqStack.pop ();//返回 4 ，因为 4, 5 和 7 出现频率最高，但 4 是最接近顶部的。堆栈变成 [5,7]。
         */
        FreqStack freqStack = new FreqStack();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
    }
}
