package com.offer.L0250;

import com.util.ListNode;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 限制：
 * 0 <= 链表长度 <= 1000
 *
 * 注意：本题与主站 21 题相同：<a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">https://leetcode-cn.com/problems/merge-two-sorted-lists/</a>
 */
public class MergeTwoSortedLists {
    /**
     * 方法：双指针
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //虚拟头节点
        ListNode dummyHead = new ListNode(-1);
        ListNode p =dummyHead;
        //遍历链表
        while (l1 != null && l2 != null){
            //选取小的点
            if (l1.val <= l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            //移动指针
            p = p.next;
        }
        //没有遍历完的直接接在后面
        p.next = l1 == null ? l2 : l1;
        return dummyHead.next;
    }
}
