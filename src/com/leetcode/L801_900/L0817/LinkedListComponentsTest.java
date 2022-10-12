package com.leetcode.L801_900.L0817;

import com.util.ListNode;

public class LinkedListComponentsTest {
    public static void main(String[] args) {
        LinkedListComponents linkedListComponents = new LinkedListComponents();
        /*
          示例 1：
          输入: head = [0,1,2,3], nums = [0,1,3]
          输出: 2
          解释: 链表中,0 和 1 是相连接的，且 nums 中不包含 2，所以 [0, 1] 是 nums 的一个组件，同理 [3] 也是一个组件，故返回 2。
         */
        ListNode listNode = new ListNode();
        listNode = listNode.add(new int[]{0, 1, 2, 3}, listNode);
        System.out.println(linkedListComponents.numComponents(listNode, new int[]{0, 1, 3}));
        /*
          示例 2：
          输入: head = [0,1,2,3,4], nums = [0,3,1,4]
          输出: 2
          解释: 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
         */
        ListNode listNode1 = new ListNode();
        listNode1 = listNode1.add(new int[]{0, 1, 2, 3, 4}, listNode1);
        System.out.println(linkedListComponents.numComponents(listNode1, new int[]{0, 3, 1, 4}));
    }
}
