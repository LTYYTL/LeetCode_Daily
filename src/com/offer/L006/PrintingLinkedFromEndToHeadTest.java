package com.offer.L006;

import com.util.ListNode;

import java.util.Arrays;

public class PrintingLinkedFromEndToHeadTest {
    public static void main(String[] args) {
        PrintingLinkedFromEndToHead printingLinkedFromEndToHead = new PrintingLinkedFromEndToHead();
        /**
         * 示例 1：
         * 输入：head = [1,3,2]
         * 输出：[2,3,1]
         */
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

        System.out.println(Arrays.toString(printingLinkedFromEndToHead.reversePrint(node1)));
        System.out.println(Arrays.toString(printingLinkedFromEndToHead.reversePrint_recursive(node1)));
    }
}
