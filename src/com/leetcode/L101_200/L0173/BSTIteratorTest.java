package com.leetcode.L101_200.L0173;

import com.util.TreeNode;

public class BSTIteratorTest {
    public static void main(String[] args) {
        /*
          示例：
          输入
          ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
          [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
          输出
          [null, 3, 7, true, 9, true, 15, true, 20, false]
          解释
          BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
          bSTIterator.next();    // 返回 3
          bSTIterator.next();    // 返回 7
          bSTIterator.hasNext(); // 返回 True
          bSTIterator.next();    // 返回 9
          bSTIterator.hasNext(); // 返回 True
          bSTIterator.next();    // 返回 15
          bSTIterator.hasNext(); // 返回 True
          bSTIterator.next();    // 返回 20
          bSTIterator.hasNext(); // 返回 False
         */
        TreeNode rr = new TreeNode(15, new TreeNode(9), new TreeNode(20));
        TreeNode rl = new TreeNode(3);
        BSTIterator bstIterator = new BSTIterator(new TreeNode(7, rl, rr));
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
    }
}
