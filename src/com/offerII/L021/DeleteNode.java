package com.offerII.L021;

import com.util.ListNode;

/**
 * 剑指 Offer II 021. 删除链表的倒数第 n 个结点
 * 给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 *
 * 示例 2：
 * 输入：head = [1], n = 1
 * 输出：[]
 *
 * 示例 3：
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *
 * 提示：
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *
 * 进阶：能尝试使用一趟扫描实现吗？
 *
 * 注意：本题与主站 19 题相同： https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class DeleteNode {
    /**
     * 方法:双指针
     * @param head
     * @param n
     * @return
     */
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
