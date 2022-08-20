package com.leetcode.L201_300.L0203;

import com.util.ListNode;

public class RemoveLinkedListElementsTest {
    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        /*
          示例 1：
          输入：head = [1,2,6,3,4,5,6], val = 6
          输出：[1,2,3,4,5]
         */
        ListNode head = new ListNode();
        head.add(new int[]{1, 2, 6, 3, 4, 5, 6}, head);
        System.out.println(removeLinkedListElements.removeElements(head, 6));
        System.out.println(removeLinkedListElements.removeElements_recursion(head, 6));
        /*
          示例 2：
          输入：head = [], val = 1
          输出：[]
         */
        ListNode head1 = new ListNode();
        //head.add(new int[]{1,2,6,3,4,5,6},head);
        System.out.println(removeLinkedListElements.removeElements(head1, 1));
        /*
          示例 3：
          输入：head = [7,7,7,7], val = 7
          输出：[]
         */
        ListNode head2 = new ListNode();
        head2.add(new int[]{7, 7, 7, 7}, head2);
        System.out.println(removeLinkedListElements.removeElements(head2, 7));
    }
}
