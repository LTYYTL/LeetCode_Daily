package com.leetcode.L1_100.L0025;

import com.util.ListNode;

/**
 * 25. K 个一组翻转链表
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 进阶：
 * 你可以设计一个只使用常数额外空间的算法来解决此问题吗？
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[2,1,4,3,5]
 *
 * 示例 2：
 * 输入：head = [1,2,3,4,5], k = 3
 * 输出：[3,2,1,4,5]
 *
 * 示例 3：
 * 输入：head = [1,2,3,4,5], k = 1
 * 输出：[1,2,3,4,5]
 *
 * 示例 4：
 * 输入：head = [1], k = 1
 * 输出：[1]
 *
 * 提示：
 * 列表中节点的数量在范围 sz 内
 * 1 <= sz <= 5000
 * 0 <= Node.val <= 1000
 * 1 <= k <= sz
 */
public class ReverseNodesKGroup {
    /**
     * 方法：迭代
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k){
        //空值情况
        if (head == null)
            return null;
        //区间[a,b)包含k个待返转元素
        ListNode a,b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            //不足k个，不需要反转
            if (b == null)
                return head;
            b = b.next;
        }
        //反转前k个元素
        ListNode newHead = reverse(a, b);
        //递归反转后续链表并连接起来
        a.next = reverseKGroup(b,k);
        return newHead;
    }

    /**
     * 交换从a~b之间的链表
     * @param a
     * @param b
     * @return
     */
    private ListNode reverse(ListNode a,ListNode b){
        ListNode pre = null;
        ListNode cur = a;
        while (cur != b){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        //返回反转后的头节点
        return pre;
    }
}
