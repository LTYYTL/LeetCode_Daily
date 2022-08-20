package com.offerII.L027;

import com.util.ListNode;

import java.util.Stack;

/**
 * 剑指 Offer II 027. 回文链表
 * 给定一个链表的 头节点 head ，请判断其是否为回文链表。
 * 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
 *
 * 示例 1：
 * 输入: head = [1,2,3,3,2,1]
 * 输出: true
 *
 * 示例 2：
 * 输入: head = [1,2]
 * 输出: false
 *
 * 提示：
 * 链表 L 的长度范围为 [1, 105]
 * 0 <= node.val <= 9
 *
 * 进阶：能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * 注意：本题与主站 234 题相同：<a href="https://leetcode-cn.com/problems/palindrome-linked-list/">https://leetcode-cn.com/problems/palindrome-linked-list/</a>
 */
public class PalindromeLinkedList {
    /**
     * 方法一：栈
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        //把链表节点的值存放到栈中
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        //然后再出栈
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
