package com.offer.L0250;

import com.util.ListNode;

public class MergeTwoSortedListsTest {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        /**
         * 示例1：
         * 输入：1->2->4, 1->3->4
         * 输出：1->1->2->3->4->4
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{1,2,4},l1);

        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{1,3,4},l2);

        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}
