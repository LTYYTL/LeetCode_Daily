package com.leetcode.L1_100.L0021;

import com.util.ListNode;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例 1：
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 *
 * 示例 2：
 * 输入：l1 = [], l2 = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 * 提示：
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
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
