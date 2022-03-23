package com.leetcode.L1_100.L0083;

import com.util.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class RemoveDuplicatesSortedList {
    /**
     * 方法：双指针
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        //空链表
        if (head == null)
            return null;

        //双指针
        ListNode slow = head;
        ListNode fast = head;
        //遍历
        while (fast != null){
            //当两个指针的值不等时候
            if (fast.val != slow.val){
                //改变链表的指针
                slow.next = fast;
                slow = slow.next;
            }
            //指针后移
            fast = fast.next;
        }
        //末尾指向空
        slow.next = null;

        return head;
    }
}
