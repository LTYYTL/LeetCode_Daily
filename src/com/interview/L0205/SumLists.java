package com.interview.L0205;

import com.util.ListNode;

/**
 * 面试题 02.05. 链表求和
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 *
 * 示例：
 * 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
 * 输出：2 -> 1 -> 9，即912
 *
 * 进阶：思考一下，假设这些数位是正向存放的，又该如何解决呢?
 *
 * 示例：
 * 输入：(6 -> 1 -> 7) + (2 -> 9 -> 5)，即617 + 295
 * 输出：9 -> 1 -> 2，即912
 */
public class SumLists {
    /**
     * 方法：双指针
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //控制链表指针
        ListNode p1 = l1;
        ListNode p2 = l2;
        //结果链表的虚拟头节点
        ListNode dummyHead = new ListNode(0);
        ListNode node = dummyHead;
        //进位
        int ac = 0;
        //遍历
        while (p1 != null || p2 != null || ac != 0){
            //存在直接取，不存在取0
            int x1 = p1 != null ? p1.val : 0;
            int x2 = p2 != null ? p2.val : 0;
            //计算和
            int sum = x1 + x2 + ac;
            //超过10取余数
            node.next = new ListNode(sum % 10);
            //进位
            ac = sum/10;
            //指针能移动向后移动
            p1 = p1 != null ? p1.next : null;
            p2 = p2 != null ? p2.next : null;
            node = node.next;
        }

        return dummyHead.next;

    }
}
