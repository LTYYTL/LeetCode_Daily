package com.interview.L0205;

import com.util.ListNode;

public class SumListsTest {
    public static void main(String[] args) {
        SumLists sumLists = new SumLists();
        /*
          示例：
          输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
          输出：2 -> 1 -> 9，即912
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{7, 1, 6}, l1);

        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{5, 9, 2}, l2);

        System.out.println(sumLists.addTwoNumbers(l1, l2));
    }
}
