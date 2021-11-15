package com.interview.L0204;

import com.util.ListNode;

/**
 * 面试题 02.04. 分割链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你不需要 保留 每个分区中各节点的初始相对位置。
 *
 * 示例 1：
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 *
 * 示例 2：
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 *
 * 提示：
 * 链表中节点的数目在范围 [0, 200] 内
 * -100 <= Node.val <= 100
 * -200 <= x <= 200
 */
public class PartitionList {
    /**
     * 方法：双指针
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        //存储值小的节点
        ListNode smallHead = new ListNode();
        ListNode small = smallHead;
        //存储值大的节点
        ListNode largerHead = new ListNode();
        ListNode larger = largerHead;

        //遍历
        while (head != null){
            //值小的
            if (head.val < x){
                small.next = head;
                small = small.next;
            }else {//值大的
                larger.next = head;
                larger = larger.next;
            }
            //移动指针
            head = head.next;
        }
        //将大链表的结尾设置为null
        larger.next = null;
        //将大链表连接到小链表上
        small.next = largerHead.next;

        return smallHead.next;
    }
}
