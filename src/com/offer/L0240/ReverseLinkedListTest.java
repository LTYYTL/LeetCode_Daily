package com.offer.L0240;

import com.util.ListNode;

public class ReverseLinkedListTest {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        /*
          示例 1：
          输入：head = [1,2,3,4,5]
          输出：[5,4,3,2,1]
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{1, 2, 3, 4, 5}, l1);
        System.out.println(reverseLinkedList.reverseList(l1));
        /*
          示例 2：
          输入：head = [1,2]
          输出：[2,1]
         */
        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{1, 2}, l2);
        System.out.println(reverseLinkedList.reverseList(l2));
        /*
          示例 3：
          输入：head = []
          输出：[]
         */
        ListNode l3 = new ListNode();
        System.out.println(reverseLinkedList.reverseList(l3));
    }
}
