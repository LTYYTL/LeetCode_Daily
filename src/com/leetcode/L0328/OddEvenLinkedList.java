package com.leetcode.L0328;

import com.util.ListNode;

/**
 * 328. 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 *
 * 示例 2:
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 *
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        //空值情况
        if (head == null){
            return head;
        }
        //偶数链表
        ListNode evenHead = head.next;
        //奇数指针、偶数指针
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null){
            //奇数节点在偶数节点后
            odd.next = even.next;
            //移动奇数指针
            odd = odd.next;
            //偶数节点在奇数节点后面
            even.next = odd.next;
            //移动偶数指针
            even = even.next;
        }
        //将偶数链表放到奇数链表之后
        odd.next = evenHead;
        return head;
    }
}
