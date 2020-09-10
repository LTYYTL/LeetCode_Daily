package com.leetcode.L0002;

import com.util.ListNode;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class TwoNumAdd {
    /**
     * 伪代码如下：
     * 将进位 temp 初始化为 0。
     * 遍历列表 l1 和 l2 直至到达它们的尾端。
     * 将 temp_l1 设为结点 l1 的值。如果已经到达 l1 的末尾，则将其值设置为 0。
     * 将 temp_l2 设为结点 l2 的值。如果已经到达 l2 的末尾，则将其值设置为 0。
     * 设定 sum = temp_l1 + temp_l2 + temp。
     * 更新进位的值，carry = sum / 10
     * 创建一个数值为 (sum% 10)的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
     * 同时，将 l1 和 l2 前进到下一个结点。
     * 检查 temp = 1 是否成立，如果成立，则向返回列表追加一个含有数字 1 的新结点。
     * 返回哨兵结点的下一个结点。
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 和的链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //哨兵节点
        ListNode res = new ListNode(-1);
        ListNode pre = res;
        //临时变量，用于进位
        int temp = 0;
        //当节点都为空并且没有进位时退出循环
        while (l1 != null || l2 != null || temp != 0){
            //当前节点的值，当前节点为null时，赋值为0
            int temp_l1 = l1 == null ? 0 :l1.val;
            int temp_l2 = l2 == null ? 0 :l2.val;
            //计算和
            temp = temp_l1 + temp_l2 + temp;
            //和的个位数节点
            ListNode node = new ListNode(temp%10);
            //进位
            temp = temp/10;
            //向后移动
            pre.next = node;
            pre = pre.next;
            //当链表不为空，才向后移动
            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }
        //要去除哨兵节点
        return res.next;
    }
}
