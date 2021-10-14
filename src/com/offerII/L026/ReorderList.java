package com.offerII.L026;

import com.util.ListNode;

/**
 * 剑指 Offer II 026. 重排链表
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 *  L0 → L1 → … → Ln-1 → Ln
 * 请将其重新排列后变为：
 * L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 *
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 * 输入: head = [1,2,3,4]
 * 输出: [1,4,2,3]
 *
 * 示例 2:
 * 输入: head = [1,2,3,4,5]
 * 输出: [1,5,2,4,3]
 *
 * 提示：
 * 链表的长度范围为 [1, 5 * 104]
 * 1 <= node.val <= 1000
 *
 * 注意：本题与主站 143 题相同：https://leetcode-cn.com/problems/reorder-list/
 */
public class ReorderList {
    /**
     * 方法：双指针
     * @param head
     */
    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null)
            return;
        /**
         * 1、找中点
         */
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        /**
         * 2、反转后半链表
         */
        ListNode newHead = slow.next;
        //将两个链表分割
        slow.next = null;

        //第二个链表倒置
        newHead = reverseList(newHead);

        /**
         * 拼接
         */
        while (newHead != null){
            //1 -> 2 ->3
            //
            //5   4
            ListNode next = newHead.next;
            //1 -> 2 ->3
            //  /
            //5   4
            newHead.next = head.next;
            //1   2 ->3
            //|  /
            //5   4
            head.next = newHead;
            //1 -> 5 -> 2 ->3
            head = newHead.next;
            //4
            newHead = next;
        }
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    private ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return  pre;
    }
}
