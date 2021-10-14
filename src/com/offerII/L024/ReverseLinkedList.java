package com.offerII.L024;

import com.util.ListNode;

import java.util.Stack;

/**
 * 剑指 Offer II 024. 反转链表
 * 给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 *
 * 示例 2：
 * 输入：head = [1,2]
 * 输出：[2,1]
 *
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 *
 * 提示：
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 *
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 *
 * 注意：本题与主站 206 题相同： https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    /**
     * 方法一：栈
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        //栈
        Stack<ListNode> stack = new Stack<>();
        //将所有节点存入栈
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode res = new ListNode(-1);
        ListNode pre = res;
        //将每个节点弹出栈，成为反转
        while (!stack.isEmpty()){
            pre.next = stack.pop();
            pre = pre.next;
        }
        //最后一个指向null
        pre.next = null;
        return res.next;
    }

    /**
     * 方法二：迭代
     * @param head
     * @return
     */
    public ListNode reverseList_iteration(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            //改变指针指向
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * 方法三：递归
     * @param head
     * @return
     */
    public ListNode reverseList_recursion(ListNode head) {
        //递归终止条件是当前为空，或者下一个节点为空
        if(head==null || head.next==null) {
            return head;
        }
        //这里的cur就是最后一个节点
        ListNode cur = reverseList_recursion(head.next);
        //这里请配合动画演示理解
        //如果链表是 1->2->3->4->5，那么此时的cur就是5
        //而head是4，head的下一个是5，下下一个是空
        //所以head.next.next 就是5->4
        head.next.next = head;
        //防止链表循环，需要将head.next设置为空
        head.next = null;
        //每层递归函数都返回cur，也就是最后一个节点
        return cur;
    }
}
