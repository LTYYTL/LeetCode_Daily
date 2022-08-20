package com.offerII.L021;

import com.util.ListNode;

public class DeleteNodeTest {
    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        /*
          示例 1：
          输入：head = [1,2,3,4,5], n = 2
          输出：[1,2,3,5]
         */
        ListNode head = new ListNode();
        head = head.add(new int[]{1, 2, 3, 4, 5}, head);
        System.out.println(deleteNode.removeNthFromEnd(head, 2));
        /*
          示例 2：
          输入：head = [1], n = 1
          输出：[]
         */
        ListNode head1 = new ListNode();
        head1 = head1.add(new int[]{1}, head1);
        System.out.println(deleteNode.removeNthFromEnd(head1, 1));
        /*
          示例 3：
          输入：head = [1,2], n = 1
          输出：[1]
         */
        ListNode head2 = new ListNode();
        head2 = head2.add(new int[]{1, 2}, head2);
        System.out.println(deleteNode.removeNthFromEnd(head2, 1));
    }
}
