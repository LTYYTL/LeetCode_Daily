package com.interview.L0204;

import com.util.ListNode;

public class PartitionListTest {
    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        /*
          示例 1：
          输入：head = [1,4,3,2,5,2], x = 3
          输出：[1,2,2,4,3,5]
         */
        ListNode listNode = new ListNode();
        listNode = listNode.add(new int[]{1, 4, 3, 2, 5, 2}, listNode);
        System.out.println(partitionList.partition(listNode, 3));
        /*
          示例 2：
          输入：head = [2,1], x = 2
          输出：[1,2]
         */
        ListNode listNode1 = new ListNode();
        listNode1 = listNode1.add(new int[]{2, 1}, listNode1);
        System.out.println(partitionList.partition(listNode1, 2));
    }
}
