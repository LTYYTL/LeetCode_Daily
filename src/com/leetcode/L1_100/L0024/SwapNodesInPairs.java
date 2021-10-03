package com.leetcode.L1_100.L0024;

import com.util.ListNode;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 *
 * 示例 2：
 * 输入：head = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：head = [1]
 * 输出：[1]
 *
 * 提示：
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 */
public class SwapNodesInPairs {
    /**
     * 方法一：递归
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        //空值情况
        if(head == null || head.next == null){
            return head;
        }
        //获得头节点的后一个元素
        ListNode prev = head.next;
        head.next = swapPairs(prev.next);
        prev.next = head;
        return prev;
    }

    /**
     * 方法二：迭代
     * @param head
     * @return
     */
    public ListNode swapPairs_Iteration(ListNode head) {
        //构建头节点
        ListNode prev = new ListNode(0);
        prev.next = head;
        //临时操作链表
        ListNode temp = prev;
        while(temp != null || temp.next.next != null){
            //获得下一个元素
            ListNode start = temp.next;
            //获得下一个元素的下一个元素
            ListNode end = temp.next.next;
            //进行交换操作
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return prev.next;
    }
}
