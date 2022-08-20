package com.offer.L0180;

import com.util.ListNode;

public class DeleteNodeListTest {
    public static void main(String[] args) {
        DeleteNodeList deleteNodeList = new DeleteNodeList();
        /* * 示例 1:
          输入: head = [4,5,1,9], val = 5
          输出: [4,1,9]
          解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.

          示例 2:
          输入: head = [4,5,1,9], val = 1
          输出: [4,5,9]
          解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{4, 5, 1, 9}, l1);
        System.out.println(deleteNodeList.deleteNode(l1, 5));
    }
}
