package com.offerII.L077;

import com.util.ListNode;

/**
 * 剑指 Offer II 077. 链表排序
 * 给定链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 * 示例 1：
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 *
 * 示例 2：
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 *
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 *
 * 提示：
 * 链表中节点的数目在范围 [0, 5 * 104] 内
 * -105 <= Node.val <= 105
 *
 * 进阶：你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 *
 * 注意：本题与主站 148 题相同：<a href="https://leetcode-cn.com/problems/sort-list/">https://leetcode-cn.com/problems/sort-list/</a>
 */
public class SortList {
    /**
     * 方法：归并排序
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        //一个节点或者空节点
        if (head == null || head.next == null)
            return head;
        //快慢指针，将链表一份为二
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //后半部链表
        ListNode end = slow.next;
        //将前后链表分割
        slow.next = null;

        //前半部进行归并排序
        ListNode left = sortList(head);
        //后半部进行归并排序
        ListNode right = sortList(end);

        //将两个链表进行归并
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null){
            if (left.val < right.val){
                h.next = left;
                left = left.next;
            }else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }

        h.next = left != null ? left : right;

        return res.next;
    }
}
