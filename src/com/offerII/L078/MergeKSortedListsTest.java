package com.offerII.L078;

import com.util.ListNode;

public class MergeKSortedListsTest {
    public static void main(String[] args) {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        /*
          示例 1：
          输入：lists = [[1,4,5],[1,3,4],[2,6]]
          输出：[1,1,2,3,4,4,5,6]
          解释：链表数组如下：
          [
            1->4->5,
            1->3->4,
            2->6
          ]
          将它们合并到一个有序链表中得到。
          1->1->2->3->4->4->5->6
         */
        ListNode listNode1 = new ListNode(1);
        listNode1.add(new int[]{4, 5}, listNode1);
        ListNode listNode2 = new ListNode(1);
        listNode2.add(new int[]{3, 4}, listNode2);
        ListNode listNode3 = new ListNode(2);
        listNode3.add(new int[]{6}, listNode3);
        ListNode[] lists = {listNode1, listNode2, listNode3};
        System.out.println(mergeKSortedLists.mergeKLists(lists));
    }
}
