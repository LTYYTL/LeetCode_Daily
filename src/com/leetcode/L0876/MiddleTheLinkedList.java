package com.leetcode.L0876;

import com.util.ListNode;

/**
 * 876. 链表的中间结点
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 * 示例 1：
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 *
 * 示例 2：
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 *
 * 提示：
 * 给定链表的结点数介于 1 和 100 之间。
 */
public class MiddleTheLinkedList {
    /**
     * 方法：双指针
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        //空值情况
        if (head == null)
            return null;
        //快慢指针初始化指针向head
        ListNode fast = head;
        ListNode slow = head;
        //快指针走到末尾时停止
        while (fast != null && fast.next != null){
            //慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        //慢指针指向中点
        return slow;
    }

    /**
     * 方法二：数组
     * @param head
     * @return
     */
    public ListNode middleNode_array(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }

}
