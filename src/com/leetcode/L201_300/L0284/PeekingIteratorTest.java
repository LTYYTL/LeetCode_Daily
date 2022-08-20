package com.leetcode.L201_300.L0284;

import java.util.Arrays;
import java.util.Iterator;

public class PeekingIteratorTest {
    public static void main(String[] args) {
        /*
          示例：
          输入：
          ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
          [[[1, 2, 3]], [], [], [], [], []]
          输出：
          [null, 1, 2, 2, 3, false]
          解释：
          PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]); // [1,2,3]
          peekingIterator.next();    // 返回 1 ，指针移动到下一个元素 [1,2,3]
          peekingIterator.peek();    // 返回 2 ，指针未发生移动 [1,2,3]
          peekingIterator.next();    // 返回 2 ，指针移动到下一个元素 [1,2,3]
          peekingIterator.next();    // 返回 3 ，指针移动到下一个元素 [1,2,3]
          peekingIterator.hasNext(); // 返回 False
         */
        Iterator<Integer> iterator = Arrays.asList(new Integer[]{1, 2, 3}).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());


    }
}
