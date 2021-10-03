package com.leetcode.L1_100.L0092;

import com.util.ListNode;

/**
 * 92. 反转链表 II
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 *
 * 示例 2：
 * 输入：head = [5], left = 1, right = 1
 * 输出：[5]
 *
 * 提示：
 * 链表中节点数目为 n
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 *
 * 进阶： 你可以使用一趟扫描完成反转吗？
 */
public class ReverseLinkedList {
    /**
     * 方法：头插法
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //反转区间为1
        if (left == right)
            return head;
        //虚拟头节点，方便用于操作
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        //得到反转区间前一个节点
        for (int i  = 0; i < left -1; ++i){
            pre = pre.next;
        }
        //反转的第一个节点
        ListNode cur = pre.next;
        ListNode next;
        //反转
        //1->2->3->4->5 pre:1 cur:2 next:3
        for (int i = 0; i < right - left; ++i){
            next = cur.next;
            cur.next = next.next;//1->2->4
            next.next = pre.next;//5->2->4
            pre.next = next;//1->3->2->4->5
        }
        return dummyHead.next;

    }
}
