package com.leetcode.L101_200.L0143;

import com.util.ListNode;

public class ReorderListTest {
    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        /*
          示例 1:
          输入: head = [1,2,3,4]
          输出: [1,4,2,3]
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{1, 2, 3, 4}, l1);
        reorderList.reorderList(l1);
        System.out.println(l1);
        /*
          示例 2:
          输入: head = [1,2,3,4,5]
          输出: [1,5,2,4,3]
         */
        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{1, 2, 3, 4, 5}, l2);
        reorderList.reorderList(l2);
        System.out.println(l2);
    }
}
