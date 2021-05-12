package com.interview.L0202;

import com.util.ListNode;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 注意：本题相对原题稍作改动
 *
 * 示例：
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 *
 * 说明：
 * 给定的 k 保证是有效的。
 */
public class DeleteNode {

    /**
     * 方法：双指针
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        //制造两个指针距离
        while(k != 0){
            fast = fast.next;
            k--;
        }
        //两个指针同时移动，直到快指针到达结尾时结束
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;
    }
}