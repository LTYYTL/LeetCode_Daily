package com.leetcode.L1_100.L0082;

import com.util.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 * 返回同样按升序排列的结果链表。
 *
 * 示例 1：
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 *
 * 示例 2：
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 *
 * 提示：
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序排列
 */
public class RemoveDuplicatesSortedListII {
    /**
     * 方法：迭代
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        //哨兵节点
        ListNode result = new ListNode(0);
        result.next = head;
        //操作节点
        ListNode prev = result;
        while (prev.next != null && prev.next.next !=null){
            if (prev.next.val == prev.next.next.val){
                int x = prev.next.val;
                while (prev.next != null && prev.next.val == x){
                    prev.next = prev.next.next;
                }
            }else {
                prev = prev.next;
            }
        }
        return result.next;
    }
}
