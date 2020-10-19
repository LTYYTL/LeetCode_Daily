package com.leetcode.L0019;

import com.util.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 说明：
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 */
public class DeleteNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //定义哨兵
        ListNode result=new ListNode(0);
        result.next = head;
        //快慢指针
        ListNode start = result;
        ListNode end = result;
        //制造两个指针距离
        while(n != 0){
            start = start.next;
            n--;
        }
        //两个指针同时移动，直到快指针到达结尾时结束
        while (start.next != null){
            start = start.next;
            end = end.next;
        }

        end.next = end.next.next;

        return result.next;
    }
}